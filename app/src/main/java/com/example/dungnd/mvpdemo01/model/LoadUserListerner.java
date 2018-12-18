package com.example.dungnd.mvpdemo01.model;

import java.util.List;

public interface LoadUserListerner {
    void onLoadSuccess(List<User> users);
    void onLoadFailure(String message);
}
