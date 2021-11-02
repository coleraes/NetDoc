package com.NetDoc.repos;

import com.NetDoc.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface TestRepository extends CrudRepository<TestEntity, Long> {

    default List<TestEntity> findAll() {
        ArrayList<TestEntity> testEntities = new ArrayList<>();

        testEntities.add(new TestEntity(1L, "Bratislava"));
        testEntities.add(new TestEntity(2L, "Budapest"));
        testEntities.add(new TestEntity(3L, "Prague"));
        testEntities.add(new TestEntity(4L, "Warsaw"));
        testEntities.add(new TestEntity(5L, "Los Angeles"));

        return testEntities;
    }

}