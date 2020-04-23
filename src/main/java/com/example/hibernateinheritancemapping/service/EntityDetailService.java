package com.example.hibernateinheritancemapping.service;

import com.example.hibernateinheritancemapping.entity.EntityDetail;
import com.example.hibernateinheritancemapping.repo.EntityDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class EntityDetailService {

	private final EntityDetailRepo entityDetailRepo;

	@Autowired
	public EntityDetailService(EntityDetailRepo entityDetailRepo) {
		this.entityDetailRepo = entityDetailRepo;
	}

	public EntityDetail save(){
		long randomNumber = (new SecureRandom()).nextLong();
		EntityDetail entityDetail = new EntityDetail();
		entityDetail.setCenterCode(true);
		entityDetail.setComments("comments " + randomNumber);
		entityDetail.setDetailId(randomNumber);
		return entityDetailRepo.save(entityDetail);
	}

	public EntityDetail find(long id) {
		return entityDetailRepo.findById(id).get();
	}
}
