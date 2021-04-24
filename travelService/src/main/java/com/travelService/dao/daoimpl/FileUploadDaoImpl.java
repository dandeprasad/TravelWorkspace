package com.travelService.dao.daoimpl;

import com.travelService.model.Video;
import com.travelService.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileUploadDaoImpl {
    @Autowired
    private VideoRepository videoRepository;

    public Video saveVideo(Video video) {
        videoRepository.save(video);
        return video;
    }
}
