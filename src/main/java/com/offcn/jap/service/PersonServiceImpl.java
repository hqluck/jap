package com.offcn.jap.service;

import com.offcn.jap.bean.Person;
import com.offcn.jap.mapper.PersonMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper pm;

    @Override
    public Person findByNameIs(String name) {
        return pm.findByNameIs(name);
    }

    @Override
    public void save(Person person) {
         pm.save(person);
    }

    @Override
    public List<Person> findByNameContaining(String name) {
        return pm.findByNameContaining(name);
    }
}
