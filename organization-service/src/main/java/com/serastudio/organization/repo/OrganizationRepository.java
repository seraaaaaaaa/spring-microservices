package com.serastudio.organization.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serastudio.organization.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
