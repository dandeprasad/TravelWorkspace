package com.travelService.model;

import com.travelService.constants.CommonConstants;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Entity(name="video_view")
public class VideoView {
    private Long uniqueId;
    private Long videoId;
    private Long viewCount;
    private String userType;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        if(userType!=null && userType.equalsIgnoreCase("user"))
        {
            this.userType = String.valueOf(CommonConstants.UserType.USER);
        }else{
            this.userType = String.valueOf(CommonConstants.UserType.GUEST);
        }
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long viewId;



    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }



}
