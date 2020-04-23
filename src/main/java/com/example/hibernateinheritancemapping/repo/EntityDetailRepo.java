package com.example.hibernateinheritancemapping.repo;

import com.example.hibernateinheritancemapping.entity.EntityDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityDetailRepo extends JpaRepository<EntityDetail, Long> {
}
