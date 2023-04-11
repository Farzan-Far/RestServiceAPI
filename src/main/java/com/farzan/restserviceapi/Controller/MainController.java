package com.farzan.restserviceapi.Controller;

import com.farzan.restserviceapi.DataModels.Request;
import com.farzan.restserviceapi.DataModels.Response;
import com.farzan.restserviceapi.Domain.User;
import com.farzan.restserviceapi.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class MainController
{
    @Autowired
    ServiceImpl service;
    Request request;
    @PostMapping("/add")
    public ResponseEntity<Response> response(@RequestBody Request request)
    {
        Response response = service.createUser(request);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

  /*  @PostMapping("/find")
    public ResponseEntity<User> getUserById(@PathVariable("passNumber") String passNumber) throws Exception
    {
        User user = service.getAUSer(passNumber);
        return new ResponseEntity<>(user,HttpStatus.FOUND);
    }*/

   /* @PostMapping("/find")
    public ResponseEntity<User> getUser(@PathVariable("passNumber")String passNumber)
            throws Exception
    {
        Optional<User> user1 = service.findByPassNumber(passNumber);
        if (user1.isPresent())
        {
            return new ResponseEntity<>(user1.get(),HttpStatus.FOUND);
        }

        else {
            throw new Exception();
        }
    }*/

    @PostMapping("/find")
    public Optional<User> findUser(@RequestBody Request request)
    {
//       System.out.println("I am inside of find service");
        Optional<User> user = service.findByPassNumber(String.valueOf(request.getPassNumber()));
//        User obj = user.get();
//        System.out.println(obj.getPassNumber());

//        System.out.println("Pass Number : " + user.get());
        return user;
    }

   /* @PostMapping("/find")
    public Optional<User> findUser(String passNumber)
    {
    Optional<User> request = service.findByPassNumber(passNumber);

    return request;

    }*/

}
