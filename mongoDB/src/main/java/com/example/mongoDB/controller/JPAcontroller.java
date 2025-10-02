package com.example.mongoDB.controller;

import com.example.mongoDB.model.Jagadeesh;
import com.example.mongoDB.service.jagaservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@RestController
@Slf4j
public class JPAcontroller {

    @Autowired
    private jagaservice jaga;

    @GetMapping("/getvalues/{id}")
    public Jagadeesh returnval(@PathVariable String id)
    {
        return jaga.result(id).get();
    }

    @PostMapping(value="/post", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Jagadeesh jack)
    {
        jaga.createRecord(jack);
    }

    @GetMapping("/getbyage/{age}")
    public List<Jagadeesh> returnval(@PathVariable int age)
    {
        log.info("Tell Something");
        return jaga.getRecordage(age);
    }
}
