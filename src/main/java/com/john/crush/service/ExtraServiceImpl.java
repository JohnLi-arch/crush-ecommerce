package com.john.crush.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.john.crush.dao.ExtraDao;
import com.john.crush.entity.Extra;

import java.util.List;

@Service
public class ExtraServiceImpl implements ExtraService {
    @Autowired
    private ExtraDao extraDao;

    @Override
    public Extra findById(int id) {
        return extraDao.findById(id);
    }

    @Override
    @Transactional
    public List<Extra> findAll() {
        return extraDao.findAll();
    }
}