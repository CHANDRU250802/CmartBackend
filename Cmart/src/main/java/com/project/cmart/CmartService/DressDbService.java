package com.project.cmart.CmartService;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.cmart.CmartModel.DressDbEntity;
import com.project.cmart.Repository.DressDbRepository;
@Service
public class DressDbService {
	@Autowired
	DressDbRepository obj;
	public List<DressDbEntity> getData() {
		// TODO Auto-generated method stub
		return obj.findAll();
	}
	public Optional<DressDbEntity> byID(int id) {
		return obj.findById(id);
	}
	public void postdata(DressDbEntity fde)
	{
		obj.save(fde);
	}
	public void deletedata(int id)
	{
		obj.deleteById(id);
	}

}
