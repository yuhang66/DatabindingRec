package com.example.databindingrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.databindingrecycler.adapter.AutoMailAdapter;
import com.example.databindingrecycler.databinding.ActivityMainBinding;
import com.example.databindingrecycler.entity.AutoMailEntity;
import com.example.databindingrecycler.viewmodel.AutoMailModelView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    AutoMailModelView autoMailModelView;
    private List<AutoMailEntity.DateBean> list;
    private AutoMailAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        autoMailModelView = ViewModelProviders.of(this).get(AutoMailModelView.class);
        initView();
        initObserve();
    }

    private void initView() {
        list = new ArrayList<>();
        adapter = new AutoMailAdapter(list);
        binding.recycler.setLayoutManager(new LinearLayoutManager(this));
        binding.recycler.setAdapter(adapter);
    }

    private void initObserve() {
        autoMailModelView.loadData().observe(this, new Observer<AutoMailEntity>() {
            @Override
            public void onChanged(AutoMailEntity autoMailEntity) {
                if (autoMailEntity.getState().equals("access")) {
                    list.addAll(autoMailEntity.getDate());
                    adapter.notifyDataSetChanged();
                }
            }
        });
    }
}
