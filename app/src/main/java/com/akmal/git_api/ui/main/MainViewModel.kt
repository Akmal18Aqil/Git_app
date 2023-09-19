package com.akmal.git_api.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.akmal.git_api.data.api.RetrofitClient
import com.akmal.git_api.data.model.GithubResponse
import com.akmal.git_api.data.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainViewModel : ViewModel() {
    val listUser = MutableLiveData<ArrayList<User>>()

    fun setSearchUser(query: String){
        RetrofitClient.apiInstance
            .getSearchUser(query)
            .enqueue(object : Callback<GithubResponse> {
                override fun onResponse(
                    call: Call<GithubResponse>,
                    response: Response<GithubResponse>
                ) {
                    if (response.isSuccessful){
                        listUser.postValue(response.body()?.items as ArrayList<User>?)
                    }
                }

                override fun onFailure(call: Call<GithubResponse>, t: Throwable) {
                    Log.d("failure", t.message.toString())
                }

            })
    }
    fun getSearchUser() : MutableLiveData<ArrayList<User>> {
        return listUser
    }
}