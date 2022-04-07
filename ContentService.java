package com.management.Content;

import org.springframework.beans.factory.annotation.Autowired;

import java.security.Provider;
import java.util.List;

public class ContentService {
    @Autowired
    private Provider.Service Repository repo;
    public List<Content> listAll(){
        return repo.findAll();
    }
    public void save(Content content); {
        return repo.save(content);
    }
    public Content get(Long id)
    {
        return repo.findbyId(id);
    }
    public void delete (Long id)
    {
        deletebyId(id);
    }
    }

}
