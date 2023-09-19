package com.akmal.git_api.data.api

import com.akmal.git_api.data.model.GithubResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface api {
    @GET ("search/user")
    @Headers("Authorization: token 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")
    fun getSearchUser(
        @Query("q") query: String
    ):Call<GithubResponse>
}