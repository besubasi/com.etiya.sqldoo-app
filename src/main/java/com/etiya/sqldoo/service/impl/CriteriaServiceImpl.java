package com.etiya.sqldoo.service.impl;

import com.etiya.sqldoo.entity.Criteria;
import com.etiya.sqldoo.repository.CriteriaRepository;
import com.etiya.sqldoo.service.CriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bekir.subasi on 8/1/2017.
 */
@Service
public class CriteriaServiceImpl implements CriteriaService {

    @Autowired
    private CriteriaRepository criteriaRepository;


    @Override
    public List<Criteria> listCriteria(Integer menuId) {
        List<Criteria> criteriaList =  criteriaRepository.findAll();
        return criteriaList;
    }

    @Override
    public boolean addCriteria(Criteria criteria) {
        criteriaRepository.save(criteria);
        return true;
    }
}
