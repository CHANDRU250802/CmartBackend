package com.project.cmart.CmartController;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.cmart.CmartModel.DressDbEntity;
import com.project.cmart.CmartService.DressDbService;

@RequestMapping("/dresslist")
@CrossOrigin("*")
@RestController
public class DressDbController {

	@Autowired
	DressDbService obj;
	@GetMapping("/get")
	public List<DressDbEntity> getfooddb()
	{
		return obj.getData();
	}
	@GetMapping("/getbyid")
	public Optional<DressDbEntity> byID(@RequestParam int id)
	{
		return obj.byID(id);
	}
	@PostMapping("/post")
	public void post(@RequestBody DressDbEntity fe)
	{
		obj.postdata(fe);	
	}
	@PutMapping("/put")
	public void put(@RequestBody DressDbEntity fe,@RequestParam int id) {
		System.out.println(fe.getDressname());
	
		fe.setId(id);
		obj.postdata(fe);
	}
	@DeleteMapping("/del")
	public void delete(@RequestParam int id)
	{
		obj.deletedata(id);
	}
}
