package com.example.mongoDB.repository;

import com.example.mongoDB.model.Jagadeesh;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MongoRepo extends MongoRepository<Jagadeesh,String> {

    List<Jagadeesh> findByAgeGreaterThan(int age);
}
