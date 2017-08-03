package com.etiya.sqldoo.controller;


import com.etiya.sqldoo.entity.User;
import com.etiya.sqldoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;



/**
 *
 * @author bekir.subasi
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @CrossOrigin
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST, produces = "application/json")
    public User authenticate(@RequestBody User user) throws ServletException {
        if (user == null)
            return user;

        return userService.authenticate(user);
    }



    @CrossOrigin
    @RequestMapping(value ="/addUser", method = RequestMethod.POST, produces = "application/json")
    public boolean addUser(@RequestBody User user) throws ServletException {
        return userService.addUser(user);
    }

}
