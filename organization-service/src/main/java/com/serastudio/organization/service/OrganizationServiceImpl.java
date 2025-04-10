package com.serastudio.organization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serastudio.organization.model.Organization;
import com.serastudio.organization.repo.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public List<Organization> findAll() {

        return organizationRepository.findAll();
    }

    public Organization findById(Long id) {

        return organizationRepository.findById(id).orElse(null);
    }

    public Organization create(String title, String content) {
        Organization organization = new Organization(title, content);
        return organizationRepository.save(organization);
    }

    public boolean delete(Long id) {
        organizationRepository.deleteById(id);
        return true;
    }

}