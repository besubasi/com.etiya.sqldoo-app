package com.etiya.sqldoo.service;

import com.etiya.sqldoo.entity.Criteria;

import java.util.List;

/**
 * Created by bekir.subasi on 8/1/2017.
 */


public interface CriteriaService {

    public List<Criteria> listCriteria(Integer menuId);

    public boolean addCriteria(Criteria search);



}
