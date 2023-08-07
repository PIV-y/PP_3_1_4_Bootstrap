package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.UserDao;
import ru.kata.spring.boot_security.demo.model.UserMan;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void dropData() {
        userDao.dropData();
        System.out.println("в сервис команда удаления прошла успешно");
    }

    @Override
    @Transactional
    public void saveUser(UserMan userMan) {
        userDao.saveUser(userMan);
    }

    @Override
    @Transactional
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    @Transactional
    public List<UserMan> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void changeByID(UserMan userMan, long id) {
        userDao.changeByID(userMan, id);
    }

    @Override
    @Transactional
    public UserMan getUserById(long id) {
        return userDao.getUserById(id);
    }
}
