package com.demo.Serveict;

import com.demo.bean.User;

public interface UserServict {
    User getUser(String username, String password);

    int adduser(User user);

    int inset(String username, String password);
}
