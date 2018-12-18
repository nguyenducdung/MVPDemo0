package com.example.dungnd.mvpdemo01.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.dungnd.mvpdemo01.R;
import com.example.dungnd.mvpdemo01.adapter.UserAdapter;
import com.example.dungnd.mvpdemo01.model.User;
import com.example.dungnd.mvpdemo01.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    private MainPresenter presenter;
    private Button btnLoad;
    private RecyclerView rcList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        btnLoad = findViewById(R.id.btn_load);
        rcList = findViewById(R.id.rc_list);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadData();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void displayMain(List<User> users) {
        UserAdapter adapter = new UserAdapter(users, this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcList.addItemDecoration(dividerItemDecoration);
        rcList.setLayoutManager(manager);
        rcList.setAdapter(adapter);
    }
}
