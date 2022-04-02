package com.tmdb.moviedb.Controllers;

import java.util.List;
import java.util.Optional;

import com.tmdb.moviedb.Entities.Role;
import com.tmdb.moviedb.Entities.User;
import com.tmdb.moviedb.Repository.Service.Roles;
import com.tmdb.moviedb.Repository.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private Roles roleService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> allUser = userService.getAllUsers();
        try {
            if (allUser.size() <= 0) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } else
                return ResponseEntity.of(Optional.of(userService.getAllUsers()));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {

        try {
            userService.newUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @PutMapping("/users{user}")
    public ResponseEntity<User> updateUser(@RequestBody User user) {

        try {
            userService.updateUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable int id) {

        try {
            userService.deleteUser(id);

            return ResponseEntity.status(HttpStatus.OK).build();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    // Roles Controller
    @GetMapping("/roles")
    public ResponseEntity<List<Role>> getAllRoles() {
        List<Role> allRoles = roleService.getAllRoles();

        try {
            if (allRoles.size() <= 0) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } else
                return ResponseEntity.of(Optional.of(roleService.getAllRoles()));

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @PostMapping("/roles/{newRole}")
    public ResponseEntity<Role> newRole(@RequestBody Role newRole) {

        try {
            roleService.newRole(newRole);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @PutMapping("/roles/{updateRole}")
    public ResponseEntity<User> updateRole(@RequestBody Role updateRole) {

        try {
            roleService.updateRole(updateRole);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @DeleteMapping("/roles/{id}")
    public ResponseEntity<User> deleteRole(@PathVariable int id) {

        try {
            roleService.deleteRole(id);

            return ResponseEntity.status(HttpStatus.OK).build();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
