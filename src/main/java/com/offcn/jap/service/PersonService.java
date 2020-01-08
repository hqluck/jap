package com.offcn.jap.service;

import com.offcn.jap.bean.Person;
import org.apache.catalina.User;

import java.util.List;

public interface PersonService {

    public Person findByNameIs(String name);

    public  void save(Person person);

    public List<Person> findByNameContaining(String name);

}
