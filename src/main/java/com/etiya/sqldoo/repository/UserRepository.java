/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etiya.sqldoo.repository;

import com.etiya.sqldoo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ertan.yildiz
 */

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
    
}
