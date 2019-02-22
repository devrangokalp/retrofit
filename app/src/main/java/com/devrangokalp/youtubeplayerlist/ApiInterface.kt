package com.devrangokalp.youtubeplayerlist

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
//GET https://www.googleapis.com/youtube/v3/playlists?part=snippet&channelId=UCyffC3_0m2gWOKjs6NyufOw&maxResults=50&key={YOUR_API_KEY}

    @GET("playlists?part=snippet")
    fun tumListeleriGetir(@Query("channelID") channelID:String,@Query("key") apiKEy:String):retrofit2.Call<PlayListData>


}