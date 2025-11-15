package com.example.spring_security_jwt.services;

import com.example.spring_security_jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User(UUID.randomUUID().toString(),"Raees","raees@gmai.com"));
        userList.add(new User(UUID.randomUUID().toString(),"Ali","ali@gmai.com"));
        userList.add(new User(UUID.randomUUID().toString(),"Umer","umer@gmai.com"));

    }


    public List<User> getUsers(){
        return this.userList;
    }


    
}
