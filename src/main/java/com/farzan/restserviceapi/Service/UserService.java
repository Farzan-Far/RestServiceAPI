package com.farzan.restserviceapi.Service;

import com.farzan.restserviceapi.DataModels.Request;
import com.farzan.restserviceapi.DataModels.Response;
import com.farzan.restserviceapi.Domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService
{
    Response createUser(Request request);

//    Optional<User> updateUser(Integer id,Request request) throws Exception;

//    Optional<User> findByPassNumber(String passNumber) throws Exception;

  /* Request getAUSer(String passNumber) throws Exception;*/

   /* User getAUSer(String passNumber) throws Exception;*/

    List<User> getAllUser();

    Optional<User> findByPassNumber(String passNumber);

   /* Optional<User> findUser(String passNumber);*/

}
