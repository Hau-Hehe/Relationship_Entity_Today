package com.app.ecom;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>();
    public List<User> fetchAllUser() {
        return userList;
    }

    public List<User> addUser(User user) {
        userList.add(user);
        return userList;
    }
}
