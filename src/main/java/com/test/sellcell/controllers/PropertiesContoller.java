package com.test.sellcell.controllers;

import com.test.sellcell.configuration.VersionConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("prop")
@RestController
public class PropertiesContoller {

    private final VersionConfiguration config;

    @Autowired
    public PropertiesContoller(VersionConfiguration versionConfiguration) {
        this.config = versionConfiguration;
    }
    
    @GetMapping()
    public ResponseEntity<?> getProp() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Available");
    }

    @GetMapping("/version")
    public ResponseEntity<String> getApiVersion() {
        var version = config.getVersion();
        if (version.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.status(HttpStatus.OK).body(version);
        }
    }
}
