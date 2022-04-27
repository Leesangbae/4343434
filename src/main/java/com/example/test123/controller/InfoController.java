package com.example.test123.controller;

import com.example.test123.domain.Info;
import com.example.test123.service.InfoService;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Autowired
    private InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @PostMapping("/test")
    public ResponseEntity<?> save( Info info){
        infoService.save(info);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
