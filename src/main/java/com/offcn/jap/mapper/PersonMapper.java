package com.offcn.jap.mapper;

import com.offcn.jap.bean.Person;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonMapper extends JpaRepository<Person,Integer> {

    public  Person findByNameIs(String name);

    public List<Person> findByNameContaining(String name);

    @Query("select p from  Person p where p.name like %:name%")
    public List<Person> getNameslike(@Param("name") String name);

}
