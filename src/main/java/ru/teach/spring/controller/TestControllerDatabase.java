package ru.teach.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.teach.spring.entity.TestEntity;
import ru.teach.spring.repository.interfaces.TestEntityRepository;

import java.time.LocalDateTime;

@Controller
public class TestControllerDatabase {
    @Autowired
    TestEntityRepository testEntityRepository;

    @Controller
    public class TestControllerServlet {
        @RequestMapping(value = "/testdb", method = RequestMethod.GET)
        @ResponseBody
        public String testController() {
            TestEntity testEntity = new TestEntity();
            testEntity.setStartapp(LocalDateTime.now().withNano(0));
            testEntityRepository.saveTestEntity(testEntity);
            return "TestControllerDatabase!!!";
        }
    }
}