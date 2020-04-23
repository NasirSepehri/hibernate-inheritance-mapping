package com.example.hibernateinheritancemapping.controller;

import com.example.hibernateinheritancemapping.entity.EntityDetail;
import com.example.hibernateinheritancemapping.repo.EntityDetailRepo;
import com.example.hibernateinheritancemapping.service.EntityDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/detail")
public class EntityDetailController {

	private final EntityDetailService entityDetailService;

	@Autowired
	public EntityDetailController(EntityDetailService entityDetailService) {
		this.entityDetailService = entityDetailService;
	}

	@GetMapping(value = "/add")
	EntityDetail save(){
		return entityDetailService.save();
	}

	@GetMapping(value = "/find/{id}")
	EntityDetail find(@PathVariable("id") long id){
		return entityDetailService.find(id);
	}

}
