package com.arjanaproject.contentcalendar.repository;

import com.arjanaproject.contentcalendar.model.Content;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    List<Content> findAllByContentType(String type);
}
