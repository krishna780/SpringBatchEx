package com.example.springbatch.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UserCache {

    @Autowired
    UserRepository userRepo;

   @Cacheable(value = "userCache", key = "#name")
    public Users getUser(String name){
       System.out.println("retriving the db");
        return userRepo.getByName(name);
    }

}
