package com.example.dungnd.mvpdemo01.interator;

import com.example.dungnd.mvpdemo01.model.LoadUserListerner;
import com.example.dungnd.mvpdemo01.model.User;

import java.util.ArrayList;
import java.util.List;

public class Interator {
    private LoadUserListerner loadUserListerner;

    public Interator(LoadUserListerner loadUserListerner) {
        this.loadUserListerner = loadUserListerner;
    }

    public void getData() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(new User("Number" + String.valueOf(i), "Nam", i));
        }
        loadUserListerner.onLoadSuccess(users);
    }
}
