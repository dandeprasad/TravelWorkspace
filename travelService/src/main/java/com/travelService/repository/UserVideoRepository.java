package com.travelService.repository;

import com.travelService.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserVideoRepository extends JpaRepository<Video, Long> {

    //@Query("SELECT * FROM video WHERE user_id LIKE :id%")
    List<Video> findByUserId(Long user);
}
