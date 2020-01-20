package ru.teach.spring.repository.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.teach.spring.entity.TestEntity;
import ru.teach.spring.repository.interfaces.TestEntityRepository;

@Repository
@Transactional
public class TestEntityRepositoryImpl implements TestEntityRepository {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void saveTestEntity(TestEntity testEntity) {
        sessionFactory.getCurrentSession().save(testEntity);
    }
}