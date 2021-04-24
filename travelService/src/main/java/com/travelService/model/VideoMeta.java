package com.travelService.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity(name="video_meta")
public class VideoMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "catagory")
    private String catagory;

    @Column(name = "sub_caragory")
    private String subCatagory;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }


    public String getSubCatagory() {
        return subCatagory;
    }

    public void setSubCatagory(String subCatagory) {
        this.subCatagory = subCatagory;
    }


}
