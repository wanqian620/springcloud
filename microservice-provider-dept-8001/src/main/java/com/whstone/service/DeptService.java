package com.whstone.service;

import com.whstone.entities.Dept;

import java.util.List;

public interface DeptService {

     boolean add(Dept dept);

     Dept get(Long id);

     List<Dept> list();
}
