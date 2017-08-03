/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etiya.sqldoo.repository;

import com.etiya.sqldoo.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 *
 * @author ertan.yildiz
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query("select m from Menu  m where m.parentMenuId = 0 and m.userId=:userId")
    List<Menu> findFirstLevelParentMenu(@Param("userId") Integer userId);

    
}
