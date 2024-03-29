package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.mapper.RoleMapper;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        //bring all the roles
        List<Role> roleList = roleRepository.findAll();

        // convert entity to dto - mapper - get roles from db and convert each role to roledto
        return roleList.stream().map(roleMapper::covertToDTO).collect(Collectors.toList());
    }
}
