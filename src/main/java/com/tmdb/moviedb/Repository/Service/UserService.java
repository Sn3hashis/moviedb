package com.tmdb.moviedb.Repository.Service;

import java.util.List;

import com.tmdb.moviedb.Entities.User;

public interface UserService {
    public List<User> getAllUsers();

    public User newUser(User newUser);

    public void deleteUser(int id);

    public void updateUser(User user);

}
