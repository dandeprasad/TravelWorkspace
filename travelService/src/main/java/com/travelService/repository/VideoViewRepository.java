package com.travelService.repository;

import com.travelService.model.Video;
import com.travelService.model.VideoView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoViewRepository extends JpaRepository<VideoView,Long> {
    List<VideoView> findByUniqueId(Long id);
}
