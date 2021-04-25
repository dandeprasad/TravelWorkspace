package com.travelService.repository;


import com.travelService.model.VideoMeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VideoMetaRepository extends JpaRepository<VideoMeta, Integer> {

    VideoMeta findByCatagory(String name);
}
