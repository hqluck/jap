package com.offcn.jap.controller;

import com.offcn.jap.bean.Person;
import com.offcn.jap.mapper.PersonMapper;
import com.offcn.jap.service.PersonService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("per")
public class PersonController {

    @Autowired
    PersonService ps;

    @Autowired
    PersonMapper pm;

     @PostMapping("/save")
     @ResponseBody
         public String getPageCus(@RequestBody Person person){
              ps.save(person);
             return "success";
         }

      @GetMapping("/{name}")
      @ResponseBody
      public  Person getByName(@PathVariable("name") String name){

             return ps.findByNameIs(name);
      }

    @GetMapping("/like/{name}")
    @ResponseBody
    public List<Person> likefind(@PathVariable("name") String name){

        return ps.findByNameContaining(name);
    }

    @GetMapping("/like2/{name}")
    @ResponseBody
    public List<Person> like2find(@PathVariable("name") String name){

        return pm.getNameslike(name);
    }

}
