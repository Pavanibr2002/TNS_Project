package com.TNSProject.ShoppingMall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import com.TNSProject.ShoppingMall.entity.Mall;
import com.TNSProject.ShoppingMall.service.MallService;

@RestController
public class MallController {
@Autowired
MallService mallService;
@PostMapping("/malls")
public Mall addMall(@RequestBody Mall mall)
{
	return mallService.save(mall);
}
@GetMapping("/malls/{id}")
public Mall getMall(@PathVariable long id)
{
	return mallService.getMall(id);
}
@PutMapping("/malls/{id}")
public Mall updateMall(@RequestBody Mall mall,@PathVariable long id)
{
	return mallService.update(id, mall);
}
@DeleteMapping("/malls/{id}")
public String deleteMall(@PathVariable int id)
{
	return mallService.delete(id);
}
@GetMapping("/malls")
public List<Mall> getAllMalls()
{
	return mallService.getMallList();
}
}


