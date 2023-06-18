package com.project.cmart.CmartService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.cmart.CmartModel.SignupModel;
import com.project.cmart.Repository.SignupInt;



@Service
public class SignupService {

	@Autowired
	private SignupInt sr;
	public List<SignupModel> getData1(){
		return sr.findAll();
	}
	public void saveData1(SignupModel se) {
		sr.saveAndFlush(se);
	}
	public SignupModel updatedata(SignupModel se) {
		return sr.save(se);
	}
}