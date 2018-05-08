package com.springcloud.microservicecloudproviderdepthystrix8001.service;

import com.springcloud.microservicecloudapi.entity.Dept;

import java.util.List;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
