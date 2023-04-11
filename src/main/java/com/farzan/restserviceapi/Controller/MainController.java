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
    private final  ServiceImpl service;
    @Autowired
    public MainController(ServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<Response> response(@RequestBody Request request)
    {
        Response response = service.createUser(request);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

    @PostMapping("/find")
    public Optional<User> findUser(@RequestBody Request request)
    {
        Optional<User> user = service.findByPassNumber(String.valueOf(request.getPassNumber()));

        return user;
    }


}
