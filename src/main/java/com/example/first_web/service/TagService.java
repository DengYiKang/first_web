package com.example.first_web.service;

import com.example.first_web.model.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TagService {

    Tag saveTag(Tag type);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Long id, Tag type);

    void deleteTag(Long id);
}