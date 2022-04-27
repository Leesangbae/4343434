package com.example.test123.service;

import com.example.test123.domain.Info;
import com.example.test123.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
    @Autowired
    private InfoRepository infoRepository;

    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public void save(Info info) {
        infoRepository.save(info);
    }
}
