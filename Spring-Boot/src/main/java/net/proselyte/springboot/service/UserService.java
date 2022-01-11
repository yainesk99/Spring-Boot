package net.proselyte.springboot.service;

import net.proselyte.springboot.model.Role;
import net.proselyte.springboot.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


public interface UserService extends UserDetailsService {
    void addUser(User user);

    void updateUser(User user);

    void removeUser(Long id);

    User getUserById(Long id);

    List<User> listUser();

    Set<Role> getSetOfRole(List<String> id);

    User findUserByName(String username);

}
