package com.example.test123.controller;

import com.example.test123.domain.Info;
import com.example.test123.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InfoController {
    private final InfoService infoService;

    @PostMapping("/test")
    public ResponseEntity<?> save( Info info){
        infoService.save(info);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
