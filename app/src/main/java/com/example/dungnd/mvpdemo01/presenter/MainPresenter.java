package com.example.dungnd.mvpdemo01.presenter;

import com.example.dungnd.mvpdemo01.interator.Interator;
import com.example.dungnd.mvpdemo01.model.LoadUserListerner;
import com.example.dungnd.mvpdemo01.model.User;
import com.example.dungnd.mvpdemo01.view.MainView;

import java.util.List;

public class MainPresenter implements LoadUserListerner {
    private Interator interator;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.interator = new Interator(this);
        this.mainView = mainView;
    }

    public void loadData() {
        interator.getData();
    }
    @Override
    public void onLoadSuccess(List<User> users) {
        mainView.displayMain(users);
    }

    @Override
    public void onLoadFailure(String message) {

    }
}
