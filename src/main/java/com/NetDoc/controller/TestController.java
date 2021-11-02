package com.NetDoc.controller;

import com.NetDoc.entity.TestEntity;
import com.NetDoc.repos.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestRepository testRepository;

    @GetMapping("/test")
    public List<TestEntity> getTestEntities() {
        return testRepository.findAll();
    }

}
