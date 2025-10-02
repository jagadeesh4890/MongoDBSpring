package com.example.mongoDB.service;

import com.example.mongoDB.model.Jagadeesh;
import com.example.mongoDB.repository.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class jagaServiceImpl implements jagaservice{

    @Autowired
    private MongoRepo mongoRepo;


    @Override
    public Optional<Jagadeesh> result(String id) {
        return mongoRepo.findById(id);
    }

    @Override
    public void createRecord(Jagadeesh jack) {
        mongoRepo.save(jack);
    }

    @Override
    public List<Jagadeesh> getRecordage(int age) {
        return mongoRepo.findByAgeGreaterThan(age);
    }

}
