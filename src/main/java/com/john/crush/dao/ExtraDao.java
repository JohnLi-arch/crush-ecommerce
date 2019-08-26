package com.john.crush.dao;

import org.springframework.stereotype.Repository;

import com.john.crush.entity.Extra;

import java.util.List;

@Repository
public interface ExtraDao {
    public Extra findById(int id);

    public List<Extra> findAll();
}
