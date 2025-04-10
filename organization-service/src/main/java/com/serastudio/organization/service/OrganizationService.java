package com.serastudio.organization.service;

import java.util.List;

import com.serastudio.organization.model.Organization;

public interface OrganizationService {

    List<Organization> findAll();

    Organization findById(Long id);

    Organization create(String title, String content);

    boolean delete(Long id);

}
