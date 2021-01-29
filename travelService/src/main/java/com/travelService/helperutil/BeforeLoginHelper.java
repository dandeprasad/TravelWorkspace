package com.travelService.helperutil;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;

@Component
public class BeforeLoginHelper {
	
	public String convertStringToDate(String string)
	{
	   String dateString = null;
	   SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");
	   /*you can also use DateFormat reference instead of SimpleDateFormat 
	    * like this: DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
	    */
	   try{
		dateString = sdfr.format( string );
	   }catch (Exception ex ){
		System.out.println(ex);
	   }
	   return dateString;
	}
	
	public String convertStringToTime(String string)
	{
	   String TimeString = null;
	   SimpleDateFormat sdfr = new SimpleDateFormat("hh:mm:ss");
	   /*you can also use DateFormat reference instead of SimpleDateFormat 
	    * like this: DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
	    */
	   try{
		TimeString = sdfr.format( string );
	   }catch (Exception ex ){
		System.out.println(ex);
	   }
	   return TimeString;
	}
	
   public String latestMovieRating(String string)
     {
	
	    Object Ratings = null;
	
        String str = String.valueOf(Ratings);    
		return str;
	 }

   

   public String updateImage(String string) throws Exception{
   
   
	   
	      Socket soc;
	      BufferedImage img = null;
	      soc=new Socket("localhost",4000);
	      //System.out.println("Client is running. ");
	      
	      try {
	         //System.out.println("Reading image from disk. ");
	         img = ImageIO.read(new File("digital_image_processing.jpg"));
	         ByteArrayOutputStream baos = new ByteArrayOutputStream();
	         
	         ImageIO.write(img, "jpg", baos);
	         baos.flush();
	         
	         byte[] bytes = baos.toByteArray();
	         baos.close();
	         
	         //System.out.println("Sending image to server. ");
	         
	         OutputStream out = soc.getOutputStream(); 
	         DataOutputStream dos = new DataOutputStream(out);
	         
	         dos.writeInt(bytes.length);
	         dos.write(bytes, 0, bytes.length);
	         
	         //System.out.println("Image sent to server. ");

	         dos.close();
	         out.close();
	         
	      } catch (Exception e) {
	         //System.out.println("Exception: " + e.getMessage());
	         soc.close();
	      }
	      soc.close();
	   
   
          
         return string;
   
}
	
}