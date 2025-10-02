package com.example.mongoDB.service;

import com.example.mongoDB.model.Jagadeesh;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface jagaservice {

    Optional<Jagadeesh> result(String id);

    void createRecord(Jagadeesh jack);

    List<Jagadeesh> getRecordage(int age);
}
