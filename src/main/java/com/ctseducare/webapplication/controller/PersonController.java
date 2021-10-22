package com.ctseducare.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ctseducare.webapplication.model.Person;
import com.ctseducare.webapplication.repository.PersonRepository;

@Controller
public class PersonController {
  
  @Autowired
  PersonRepository repository;

  @GetMapping("/persons")
  public ModelAndView findAll() {
    ModelAndView modelAndView = new ModelAndView("Person");
    modelAndView.addObject("persons", repository.findAll());
    modelAndView.addObject("person", new Person());
    return modelAndView;
  }
  
  @PostMapping("/persons")
  public String save(Person person) {
    repository.save(person);
    return "redirect:/persons";
  }

}

