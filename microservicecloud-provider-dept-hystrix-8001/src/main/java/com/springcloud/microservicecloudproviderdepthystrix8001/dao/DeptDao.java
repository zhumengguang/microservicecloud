package com.springcloud.microservicecloudproviderdepthystrix8001.dao;

import com.springcloud.microservicecloudapi.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
