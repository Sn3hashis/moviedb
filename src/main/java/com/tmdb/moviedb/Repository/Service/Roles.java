package com.tmdb.moviedb.Repository.Service;

import java.util.List;

import com.tmdb.moviedb.Entities.Role;

public interface Roles {
    public List<Role> getAllRoles();

    public Role newRole(Role newRole);

    public void deleteRole(int id);

    public Role updateRole(Role updateRole);
}
