package com.devrangokalp.youtubeplayerlist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    val API_KEY= "322951806288-jluvse5cunqvg22ms40ol8ja1bh6c6ul.apps.googleusercontent.com"
    val CHANNEL_ID="UCyffC3_0m2gWOKjs6NyufOw"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var apiInterface=ApiClient.client?.create(ApiInterface::class.java)
        var apiCall=apiInterface?.tumListeleriGetir(CHANNEL_ID,API_KEY)

        apiCall?.enqueue(object : Callback<PlayListData>{
            override fun onFailure(call: Call<PlayListData>, t: Throwable) {

            }

            override fun onResponse(call: Call<PlayListData>, response: Response<PlayListData>) {
                Log.e("BASARILI",call?.request()?.url()?.toString())
                Log.e("BASARILI",response?.body().toString())
            }

        })
    }
}
