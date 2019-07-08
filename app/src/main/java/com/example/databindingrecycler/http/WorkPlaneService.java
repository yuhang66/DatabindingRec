package com.example.databindingrecycler.http;

import com.example.databindingrecycler.entity.AutoMailEntity;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface WorkPlaneService {
    @GET("testJson/master/update.json")
    Observable<AutoMailEntity> getre();//工作计划
}
