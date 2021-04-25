package com.travelService.service.impl;

import com.travelService.dao.daoimpl.UserVideoDaoImpl;
import com.travelService.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileUploadServiceImpl {
    @Autowired
    UserVideoDaoImpl fileUploadDao;

   public Video videoUpload(Video video){

       return fileUploadDao.saveVideo(video);
    }
}
