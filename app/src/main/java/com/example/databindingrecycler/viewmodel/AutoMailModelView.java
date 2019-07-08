package com.example.databindingrecycler.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.databindingrecycler.entity.AutoMailEntity;
import com.example.databindingrecycler.http.WorkPlaneService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class AutoMailModelView extends ViewModel {

    public MutableLiveData<AutoMailEntity> loadData() {
        final MutableLiveData<AutoMailEntity> liveData = new MutableLiveData<>();
        final String address = "https://raw.githubusercontent.com/xueqiya/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(address)//基础URL 建议以 / 结尾
                .addConverterFactory(GsonConverterFactory.create())//设置 Json 转换器
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//RxJava 适配器
                .build();
        WorkPlaneService workPlaneService = retrofit.create(WorkPlaneService.class);
        workPlaneService.getre()
                .subscribeOn(Schedulers.io())//IO线程加载数据
                .observeOn(AndroidSchedulers.mainThread())//主线程显示数据
                .subscribe(new Subscriber<AutoMailEntity>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        liveData.setValue(null);
                        Log.d("请求失败", e.toString());
                    }

                    @Override
                    public void onNext(AutoMailEntity autoMailEntity) {
                        liveData.setValue(autoMailEntity);
                    }
                });
        return liveData;
    }
}
