package com.serastudio.organization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.serastudio.organization.model.Organization;
import com.serastudio.organization.service.OrganizationServiceImpl;

@RestController
@RequestMapping(value = "/organization")
public class OrganizationController {

    @Autowired
    private OrganizationServiceImpl organizationservice;

    @GetMapping("/all")
    public List<Organization> findAllOrganization() {
        return organizationservice.findAll();
    }

    @GetMapping("/get/{id}")
    public Organization findOrganizationById(@PathVariable Long id) {
        return organizationservice.findById(id);
    }

    @PostMapping("/create")
    public Organization createOrganization(@RequestParam String name, @RequestParam String email) {

        return organizationservice.create(name, email);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteOrganization(@PathVariable Long id) {
        return organizationservice.delete(id);
    }

}
