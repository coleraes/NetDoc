package com.NetDoc.repos;

import com.NetDoc.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepository extends CrudRepository<TestEntity, Long> {

    List<TestEntity> findByText(String text);

}