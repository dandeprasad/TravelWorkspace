package com.travelService.repository;

import com.travelService.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface VideoRepository extends JpaRepository<Video, Long> {

}
