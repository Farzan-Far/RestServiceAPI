package com.farzan.restserviceapi.Service;

import com.farzan.restserviceapi.DataModels.Request;
import com.farzan.restserviceapi.DataModels.Response;
import com.farzan.restserviceapi.Domain.User;
import com.farzan.restserviceapi.Repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements UserService
{
    private final repository repo;

    @Autowired
    public ServiceImpl(repository repo) {
        this.repo = repo;
    }

    @Override
    public Response createUser(Request request)
    {
        User user = new User();

        user.setName(request.getName());
        user.setFamily(request.getFamily());
        user.setPassNumber(request.getPassNumber());
        user.setCountry(request.getCountry());

        repo.save(user);
        return new Response("New User is Registered.");
    }

    @Override
    public List<User> getAllUser()
    {
        return repo.findAll();
    }

    @Override
    public Optional<User> findByPassNumber(String passNumber)
    {
        return repo.findById(passNumber);
    }

}
