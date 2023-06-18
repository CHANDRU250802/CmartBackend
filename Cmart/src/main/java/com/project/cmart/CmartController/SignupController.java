package com.project.cmart.CmartController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.project.cmart.CmartService.SignupService;
import com.project.cmart.CmartModel.SignupModel;

@RestController
@RequestMapping("/signup")
@CrossOrigin("*")
public class SignupController {

	@Autowired
	private SignupService ss;
	@GetMapping("/getsignup")
	public List<SignupModel> getData1(){
		return ss.getData1();
	}
	@PostMapping("/postsignup")
	public void saveData1(@RequestBody SignupModel se) {
		ss.saveData1(se);
	}
	@PutMapping("/putsignup/{id}")
	public SignupModel updatedata(@PathVariable int id,@RequestBody SignupModel se) {
		se.setId(id);
		return ss.updatedata(se);
	}
}