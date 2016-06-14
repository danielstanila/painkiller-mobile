package com.painkillermobile.service.impl;

import com.painkillermobile.domain.Media;
import com.painkillermobile.service.MediaService;
import com.painkillermobile.utils.Utils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MediaServiceImpl implements MediaService {

    private List<Media> mediaList = new ArrayList<>();

    private void populate() {
        mediaList.add(Utils.loadMedia("D:\\SampleVideo_1280x720_10mb.mp4"));
    }

    public Media getMedia(Integer id) {
        mediaList.clear();
        populate();
        return mediaList.get(id);
    }
}