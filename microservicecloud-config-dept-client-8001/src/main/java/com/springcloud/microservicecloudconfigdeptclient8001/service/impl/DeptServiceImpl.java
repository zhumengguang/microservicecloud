package com.springcloud.microservicecloudconfigdeptclient8001.service.impl;

import com.springcloud.microservicecloudapi.entity.Dept;
import com.springcloud.microservicecloudconfigdeptclient8001.dao.DeptDao;
import com.springcloud.microservicecloudconfigdeptclient8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
