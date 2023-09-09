package com.alarcon.springstreming.repositorios;

import com.alarcon.springstreming.entidades.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, String> {
}
