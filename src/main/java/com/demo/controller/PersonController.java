package com.demo.controller;

import com.demo.entity.Person;
import com.demo.model.Json;
import com.demo.model.JsonResult;
import com.demo.model.SearchModel;
import com.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;


    @RequestMapping(value = "/")
    public String index(){
        System.out.println("home");
        return "home";
    }

    @RequestMapping(value = "/listP")
    public String lis(){
        System.out.println("ok");
        return "home";
    }

    @RequestMapping(value = "/listPerson", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult list(@RequestParam String name,@RequestParam String identityCard){
        try{
            System.out.println("listPerson");
            List<Person> list = personService.getPerson(new SearchModel('%'+name+'%', '%'+identityCard+'%'));

            System.out.println(name +"-"+identityCard);
            System.out.println(list);
            return new Json("OK", list, list.size());
        }catch (Exception e){
            return new Json("ERROR", e.getMessage());
        }

    }

    @RequestMapping( value = "/addPerson", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult saveProcess(Person person){
        Person p = personService.addPerson(person);
        return new Json("OK", p);
    }

    @RequestMapping(value = "/updatePerson", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult update(Person person){
        Person p = personService.updatePerson(person);
        return new Json("OK", p);
    }


    @RequestMapping(value = "/deletePerson", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult delete(Integer personId){
        personService.deletePerson(personId);
        return new Json("OK");
    }
}
