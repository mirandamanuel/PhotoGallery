package com.bignerdranch.android.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET(
    "services/rest/?method=flickr.interestingness.getList" +
            "&api_key=6e8151e295b03028310fc3cd721414e9" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}

