package com.renup.dao;

import com.renup.service.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentDao extends CrudRepository<Document, Long>{
    
}
