package com.john.crush.dao;

import com.john.crush.entity.Role;

public interface RoleDao {
    public Role getRole(String username);

    public Role findRoleByName(String roleName);
}
