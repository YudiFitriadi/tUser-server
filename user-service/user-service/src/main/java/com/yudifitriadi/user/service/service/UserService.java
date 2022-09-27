/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.yudifitriadi.user.service.service;

import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

/**
 *
 * @author user
 */
public interface UserService {
   

    public List<User> getAlluser();
        
    public User getUser(String id);

    public void addUser(User user);

    public User updateUser(User user);

    public User deleteUser(String id);

    public List<User> getALLUsers();
    
}
