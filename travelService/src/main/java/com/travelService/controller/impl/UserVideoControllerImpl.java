package com.travelService.controller.impl;

import com.travelService.model.Video;
import com.travelService.model.VideoView;
import com.travelService.response.TravelResponse;
import com.travelService.service.impl.UserVideoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/video")
public class UserVideoControllerImpl {
    @Autowired
    UserVideoServiceImpl userVideoService;
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public List<Video> userVideoCtrl(@PathParam("id") Long userId) {

        return userVideoService.userVideoData(userId) ;
    }

    @POST
    @Path("/viewcount")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TravelResponse videoViewCtrl(VideoView videoView){

        return userVideoService.userVideoCount(videoView);
    }
    @POST
    @Path("/guest/viewcount")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TravelResponse guestVideoViewCtrl(VideoView videoView){

        return userVideoService.userVideoCount(videoView);
    }
}
