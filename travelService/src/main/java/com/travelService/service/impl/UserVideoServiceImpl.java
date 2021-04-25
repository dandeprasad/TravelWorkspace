package com.travelService.service.impl;

import com.travelService.constants.ResponeConstants;
import com.travelService.dao.daoimpl.UserVideoDaoImpl;
import com.travelService.model.Video;
import com.travelService.model.VideoView;
import com.travelService.response.TravelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserVideoServiceImpl {
    @Autowired
    UserVideoDaoImpl userVideoDao;
   public List<Video> userVideoData(Long userId){
       return userVideoDao.getUserVideoDao(userId);
    }

    public TravelResponse userVideoCount(VideoView videoView){

      String response =   userVideoDao.saveVideoCountDao(videoView);

        TravelResponse responseBean = new TravelResponse();

        responseBean.setCode(ResponeConstants.VIDEO_VIEW_CODE);
        responseBean.setMessage("Success");
        responseBean.setResult(response);
        return responseBean;

    }
}
