package com.tmdb.moviedb.Repository.Implementation;

import java.util.List;

import com.tmdb.moviedb.Dao.RoleDao;
import com.tmdb.moviedb.Entities.Role;
import com.tmdb.moviedb.Repository.Service.Roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements Roles {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> getAllRoles() {

        return roleDao.findAll();
    }

    @Override
    public Role newRole(Role newRole) {

        return roleDao.save(newRole);
    }

    @Override
    public void deleteRole(int id) {

        roleDao.deleteById(id);

    }

    @Override
    public Role updateRole(Role updateRole) {
        List<Role> allRoles = roleDao.findAll();
        allRoles.stream().forEach(r -> {
            if (r.getId() == updateRole.getId()) {
                r.setRoleName(updateRole.getRoleName());
                ;
            }
        });
        return roleDao.getById(updateRole.getId());
    }

}
