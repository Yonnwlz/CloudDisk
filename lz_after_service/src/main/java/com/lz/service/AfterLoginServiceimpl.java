package com.lz.service;

import com.lz.dao.LzaminMapper;
import com.lz.model.pojo.Lzamin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class AfterLoginServiceimpl implements AfterLoginService{
    @Autowired
    private LzaminMapper lzaminMapper;


    @Override
    public List<Lzamin> getAll() {
        return lzaminMapper.selectByExample(null);
    }
}
