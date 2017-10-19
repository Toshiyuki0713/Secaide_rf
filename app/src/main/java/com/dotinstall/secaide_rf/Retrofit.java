package com.dotinstall.secaide_rf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gosho on 2017/10/19.
 */

public class Retrofit {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main, container, false);
        mUnbinder = ButterKnife.bind(this, view);

        // Retrofitインスタンス作成
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BiposiInterface.END_POINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Web APIアクセス用インタフェース作成
        mApiInterface = retrofit.create(BiposiInterface.class);

        return view;
    }


    // Web API実行用インスタンス(インタフェース)を取得します。
    Call<BiposiWalk> call = mApiInterface.getBiposiWalk(targetUrl);

    // Web APIを実行します
    // コールバック呼び出しで処理結果が通知されます
    call.enqueue(new Callback<BiposiWalk>() {
        @Override
        public void onResponse(Call<BiposiWalk> call, Response<BiposiWalk> response) {
            // Web APIアクセスが成功した場合の処理を記述します
        }

        @Override
        public void onFailure(Call<BiposiWalk> call, Throwable t) {
            // Web APIアクセスが失敗した場合の処理を記述します
        }
    });
}
