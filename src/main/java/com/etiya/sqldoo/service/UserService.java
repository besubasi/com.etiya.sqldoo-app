package com.etiya.sqldoo.service;

import com.etiya.sqldoo.entity.User;

/**
 * Created by bekir.subasi on 8/1/2017.
 */

public interface UserService {

    public User authenticate(User user);

    public boolean addUser(User user);

}
