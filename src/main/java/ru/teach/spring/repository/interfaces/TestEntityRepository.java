package ru.teach.spring.repository.interfaces;

import ru.teach.spring.entity.TestEntity;

public interface TestEntityRepository {
    void saveTestEntity(TestEntity testEntity);
}