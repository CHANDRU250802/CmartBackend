package com.project.cmart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.cmart.CmartModel.SignupModel;

public interface SignupInt extends JpaRepository<SignupModel,Integer> {

}