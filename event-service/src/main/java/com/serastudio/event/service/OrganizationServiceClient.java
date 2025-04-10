package com.serastudio.event.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.serastudio.event.model.Organization;

@FeignClient(name = "organization-service")
public interface OrganizationServiceClient {

    @GetMapping("/organization/get/{id}")
    Organization getOrganizationById(@PathVariable long id);
}