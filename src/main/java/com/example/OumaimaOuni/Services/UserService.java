package com.example.OumaimaOuni.Services;

import com.example.OumaimaOuni.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> retrieveAllUsers ();

    public User retrieveOneUser(Integer idUser);

    public void deleteUser(Integer idUser);

    public User updateUser(User u);

    public User addUser(User u);
}
