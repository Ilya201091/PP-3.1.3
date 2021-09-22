package ru.ilya.springboot.springboot.dao;

import ru.ilya.springboot.springboot.entities.User;

import java.util.List;

public interface UserDAO {

    List<User> allUser();
    User addUser(User user);
    User getUserById(long id);
    User updateUser(User user);
    void removeUserById(long id);
    User getUserByNickname(String nickname);

}
