package com.etiya.sqldoo.service.impl;

import com.etiya.sqldoo.entity.User;
import com.etiya.sqldoo.repository.UserRepository;
import com.etiya.sqldoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * Created by bekir.subasi on 8/1/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public User authenticate(User user) {

        Iterable<User> userList = userRepository.findAll();
        Iterator<User> iterator = userList.iterator();

        while (iterator.hasNext()){
            User dbUser = iterator.next();
            if (user.getUserName().equals(dbUser.getUserName())
                    && user.getPassword().equals(dbUser.getPassword())) {
                user.setToken(String.valueOf(System.currentTimeMillis()));
                user.setUserId(dbUser.getUserId());
                return user;
            }
        }

        return null;
    }

    @Override
    public boolean addUser(User user) {
        userRepository.save(user);
        return true;
    }
}
