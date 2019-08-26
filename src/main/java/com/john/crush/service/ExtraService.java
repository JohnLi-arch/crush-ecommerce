package com.john.crush.service;

import org.springframework.stereotype.Service;

import com.john.crush.entity.Extra;

import java.util.List;

@Service
public interface ExtraService {
    public Extra findById(int id);

    public List<Extra> findAll();
}