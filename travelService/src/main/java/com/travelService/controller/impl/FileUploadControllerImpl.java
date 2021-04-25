package com.travelService.controller.impl;

import java.io.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.travelService.helperutil.AmazonSupportS3;
import com.travelService.helperutil.CommonUtil;
import com.travelService.model.Video;
import com.travelService.service.impl.FileUploadServiceImpl;
import com.travelService.vo.CustomPrincipal;


import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.travelService.constants.ResponeConstants;
import com.travelService.response.TravelResponse;

@Component
@Path("/fileUpload")
public class FileUploadControllerImpl {
@Autowired
	AmazonSupportS3 amazonSupportS3;
@Autowired
	FileUploadServiceImpl fileUploadService;
	@POST
	@Path("/video")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public TravelResponse uploadVideo(
	    @FormDataParam("file") InputStream videoInputStream,
	    @FormDataParam("file") FormDataContentDisposition videoDetails,
		@FormDataParam("image") InputStream imageInputStream,
		@FormDataParam("image") FormDataContentDisposition imageDetails,
		@FormDataParam("video-content") FormDataBodyPart jsonPart) throws IOException {

		CustomPrincipal principal = (CustomPrincipal) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		int userId = principal.getId();
		jsonPart.setMediaType(MediaType.APPLICATION_JSON_TYPE);
		Video video = jsonPart.getValueAs(Video.class);
		video.setUserId(userId);
		video.setVideoImg(new CommonUtil().epochTime()+"_"+imageDetails.getFileName());
		video.setVideoUrl(new CommonUtil().epochTime()+"_"+videoDetails.getFileName());
		video.setUploadedTime(new CommonUtil().epochTime());

	   String uploadedFileLocation = "/Users/dandereddyprasad/Downloads/travel/" + videoDetails.getFileName();
		String uploadedFileLocation1 = "/Users/dandereddyprasad/Downloads/travel/" + imageDetails.getFileName();
		InputStream is;
		//after reading the bytes inputstream becomes empty
		//byte[] bytes = IoUtils.toByteArray(uploadedInputStream);
		//amazonSupportS3.uploadImageFile(bytes);

		//amazonSupportS3.multipartUpload(uploadedInputStream);
	   // save it
	   writeToFile(videoInputStream, uploadedFileLocation);
		writeToFile(imageInputStream, uploadedFileLocation1);
		fileUploadService.videoUpload(video);

	   String output = "File uploaded to : " + uploadedFileLocation;

	   TravelResponse responseBean = new TravelResponse();

	   responseBean.setCode(ResponeConstants.FILE_SUCCESS_CODE);
	   responseBean.setMessage(videoDetails.getFileName());
	   responseBean.setResult("Success");
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
