package com.TNSProject.ShoppingMall.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TNSProject.ShoppingMall.entity.Mall;
import com.TNSProject.ShoppingMall.repo.MallRepo;

@Service
public class MallService {
	@Autowired
	MallRepo mallRepo;
	public Mall save(Mall mall)
	{
		return mallRepo.save(mall);
	}
	public Mall getMall(long id)
	{
		return mallRepo.findById(id).get();
	}
	public Mall update(long id,Mall mal)
	{
		Mall mall=mallRepo.findById(id).get();
		mall.setMallAdmin(mal.getMallAdmin());
		mall.setMallName(mal.getMallName());
		mall.setLocation(mal.getLocation());
		mall.setShopid(mal.getShopid());
		mall.setCategory(mal.getCategory());
		return mallRepo.save(mall);
	}
	public String delete(long id)
	{
		mallRepo.deleteById(id);
		return "Entity with this id is deleted "+id;
	}
	public List<Mall> getMallList()
	{
		return mallRepo.findAll();
	}
}
