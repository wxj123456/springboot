package com.wang.service;

public interface IUserService {
    boolean login(String username, String passwd);
    boolean register(String username, String passwd);
}
