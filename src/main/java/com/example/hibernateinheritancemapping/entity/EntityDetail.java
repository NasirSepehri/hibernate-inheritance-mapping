package com.example.hibernateinheritancemapping.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "detail")
@Data
public class EntityDetail extends AuditableEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "detail_id")
	private Long detailId;

	@Column(name = "center_code")
	private Boolean centerCode;

	@Column(name = "comments")
	private String comments;
}