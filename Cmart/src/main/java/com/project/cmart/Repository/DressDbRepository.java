package com.project.cmart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.cmart.CmartModel.DressDbEntity;

public interface DressDbRepository extends JpaRepository<DressDbEntity, Integer> {

}
