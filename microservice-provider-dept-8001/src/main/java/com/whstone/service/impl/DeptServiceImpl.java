package com.whstone.service.impl;

import com.whstone.entities.Dept;
import com.whstone.mapper.DeptMapper;
import com.whstone.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {


//    @Autowired
//    private DeptDao dao;
    @Resource
    private DeptMapper deptMapper;

    @Override
    public int add(Dept dept)
    {
        return deptMapper.insert(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dept> list()
    {
        return deptMapper.selectAll();
    }
}
