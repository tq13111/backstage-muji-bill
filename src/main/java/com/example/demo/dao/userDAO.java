package com.example.demo.dao;

public interface userDAO {
    void register(String name,String password);
    void login(String name,String password);
}
