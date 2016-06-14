package com.painkillermobile.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.painkillermobile.domain.Media;
import com.painkillermobile.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MediaService mediaService;

    @RequestMapping(value = "/media/{id}", method = RequestMethod.GET)
    public String getMedia(@PathVariable Integer id) throws JsonProcessingException {
        Media media = mediaService.getMedia(id);
        return new ObjectMapper().writeValueAsString(media);
    }
}
