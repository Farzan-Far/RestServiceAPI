package com.farzan.restserviceapi.Service;

import com.farzan.restserviceapi.DataModels.Request;
import com.farzan.restserviceapi.DataModels.Response;
import com.farzan.restserviceapi.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements UserService
{
    @Autowired
    com.farzan.restserviceapi.Repository.repository repository;
    User user;
    @Override
    public Response createUser(Request request)
    {
        User user = new User();

        user.setName(request.getName());
        user.setFamily(request.getFamily());
        user.setPassNumber(request.getPassNumber());
        user.setCountry(request.getCountry());

        repository.save(user);
        return new Response("New User is Registered.");
    }
  /*  @Override
    public Optional<User> updateUser(Integer id, Request request) throws Exception
    {
        return Optional.empty();
    }*/

  /*  @Override
    public Optional<User> findByPassNumber(String passNumber) throws Exception
    {
        return repository.findById(passNumber);
    }*/

   /* @Override
    public User getAUSer(String passNumber) throws Exception
    {
        return repository.findById(passNumber).orElseThrow(() -> new RuntimeException("Not found"));
    }*/

    /*  @Override
   *//* public Request getAUSer(String passNumber) throws Exception {
        return null;
    }*/

    @Override
    public List<User> getAllUser()
    {
        return repository.findAll();
    }

    @Override
    public Optional<User> findByPassNumber(String passNumber)
    {
        User request = getAllUser().stream().filter(t -> passNumber.equals(t.getPassNumber()))
                .findFirst()
                .orElse(null);
        return repository.findById(passNumber);
    }

    /*@Override
    public Optional<User> findByPassNumber(String passNumber)
    {
        Optional<User> request = repository.findById(passNumber);

        return request;
    }*/

//    @Override
   /* public Optional<User> findUser(String passNumber)
    {
        User request = getAllUser().stream().filter(t -> passNumber.equals(t.getPassNumber()))
                .findFirst()
                .orElse(null);
        return repository.findById(passNumber);
    }*/

}
