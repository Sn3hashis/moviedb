package com.tmdb.moviedb.Repository.Implementation;

import java.util.List;

import com.tmdb.moviedb.Dao.UserDao;
import com.tmdb.moviedb.Entities.User;
import com.tmdb.moviedb.Repository.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {

        return userDao.findAll();
    }

    @Override
    public User newUser(User newUser) {

        return userDao.save(newUser);
    }

    @Override
    public void deleteUser(int id) {

        userDao.deleteById(id);

    }

    @Override
    public void updateUser(User user) {
        List<User> allusers = getAllUsers();

        allusers.stream().forEach(u -> {
            if (u.getUserID() == user.getUserID()) {
                u.setEmail(user.getEmail());
                u.setFullName(user.getFullName());
                u.setUserName(user.getUserName());
                u.setPassword(user.getPassword());
            }
        });

    }

}
