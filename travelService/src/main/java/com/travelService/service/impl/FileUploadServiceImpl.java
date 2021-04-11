package com.travelService.service.impl;

import java.io.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.travelService.helperutil.AmazonSupportS3;
import com.travelService.vo.CustomPrincipal;


import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.travelService.constants.ResponeConstants;
import com.travelService.response.FileUploadResponse;
import software.amazon.awssdk.utils.IoUtils;

@Component
@Path("/fileUpload")
public class FileUploadServiceImpl {
@Autowired
	AmazonSupportS3 amazonSupportS3;
	@POST
	@Path("/image")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public FileUploadResponse  uploadImage(
	    @FormDataParam("file") InputStream uploadedInputStream,
	    @FormDataParam("file") FormDataContentDisposition fileDetails) throws IOException {

		CustomPrincipal principal = (CustomPrincipal) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();


	   System.out.println(fileDetails.getFileName());

	   String uploadedFileLocation = "/Users/dandereddyprasad/Downloads/travel/" + fileDetails.getFileName();

		InputStream is;
		//after reading the bytes inputstream becomes empty
		//byte[] bytes = IoUtils.toByteArray(uploadedInputStream);
		//amazonSupportS3.uploadImageFile(bytes);

		amazonSupportS3.multipartUpload(uploadedInputStream);
	   // save it
	   //writeToFile(uploadedInputStream, uploadedFileLocation);

	   String output = "File uploaded to : " + uploadedFileLocation;

	   FileUploadResponse responseBean = new FileUploadResponse();

	   responseBean.setCode(ResponeConstants.FILE_SUCCESS_CODE);
	   responseBean.setMessage(fileDetails.getFileName());
	   responseBean.setResult(null);
	   return responseBean;
	}

	// save uploaded file to new location
	private void writeToFile(InputStream uploadedInputStream,
	                   String uploadedFileLocation) {
	   try {

	      OutputStream out = new FileOutputStream(new File(
	            uploadedFileLocation));
	      int read = 0;
		   int mB = 1024 * 1024 * 5;
	      byte[] bytes = new byte[mB];
int i = 1;
	      out = new FileOutputStream(new File(uploadedFileLocation));
	      while ((read = uploadedInputStream.read(bytes)) != -1) {
	         out.write(bytes, 0, read);
	         i++;
	      }
	      System.out.println(i);
	      out.flush();
	      out.close();
	   } catch (IOException e) {
	      e.printStackTrace();
	   }
	}

}
