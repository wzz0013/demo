package com.example.nanqi.controller;

import com.example.nanqi.pojo.User;
import com.example.nanqi.service.Imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class Test {
    @Autowired
    private UserServiceImp serviceImp;
     @GetMapping("/hehe")
 public  String  hello(){

     return  "<a href='/hello/haha'>HELLO WORLD</a>";
 }
     @GetMapping("/haha")
  public  String  demo(){
      return  "<p style='font-size:15px'>world:滚！</p>";
  }

        @GetMapping("/test")
    public List<User> findAll(){
        return  serviceImp.findAll();
    }

        @GetMapping("/one/{id}")
    public  User findOne(@PathVariable("id") String id){
         if (id==null){
             return new User();
         }
            System.out.println(id);
         return  serviceImp.findOneUser(id);
    }
}
