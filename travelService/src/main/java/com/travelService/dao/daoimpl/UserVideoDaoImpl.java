package com.travelService.dao.daoimpl;

import com.travelService.model.User;
import com.travelService.model.Video;
import com.travelService.model.VideoView;
import com.travelService.repository.UserVideoRepository;
import com.travelService.repository.VideoViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserVideoDaoImpl {
    @Autowired
    private UserVideoRepository userVideoRepository;
    @Autowired
    private VideoViewRepository videoViewRepository;

    public Video saveVideo(Video video) {
        userVideoRepository.save(video);
        return video;
    }
    public List<Video> getUserVideoDao(Long user) {

        return userVideoRepository.findByUserId(user);
    }

    public String saveVideoCountDao(VideoView videoView){
        List<VideoView> listview = videoViewRepository.findByUniqueId(videoView.getUniqueId());
       if(listview.size()>0){
           return "Already count registered";
       }
        videoViewRepository.save(videoView);
        return "New Count registered";

    }
}
