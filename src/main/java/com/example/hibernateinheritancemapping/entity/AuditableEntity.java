package com.example.hibernateinheritancemapping.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Data
public class AuditableEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@CreatedBy
	private String createdBy;

	@CreatedDate
	private Date createdOn;

	@LastModifiedBy
	private String updatedBy;

	@LastModifiedDate
	private Date updatedOn;

}