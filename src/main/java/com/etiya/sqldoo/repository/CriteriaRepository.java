/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etiya.sqldoo.repository;

import com.etiya.sqldoo.entity.Criteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author bekir.subasi
 */
@Repository
public interface CriteriaRepository extends JpaRepository<Criteria, Long> {
    
}
