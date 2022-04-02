package com.tmdb.moviedb.Dao;

import com.tmdb.moviedb.Entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

}
