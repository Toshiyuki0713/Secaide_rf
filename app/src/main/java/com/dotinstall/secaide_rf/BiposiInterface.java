package com.dotinstall.secaide_rf;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by gosho on 2017/10/19.
 */

public interface BiposiInterface {
    String END_POINT = "https://travossbot.herokuapp.com";
    String TARGET_URL = "https://travossbot.herokuapp.com/api/userwalkdata/";

    /**
     * BiposiDataを取得する
     * https://travossbot.herokuapp.com/api/userwalkdata/
     */
    @GET("/api/userwalkdata/")
    Call<List<BiposiWalk>> listBiposiWalk(@Query("url") String target);
}
