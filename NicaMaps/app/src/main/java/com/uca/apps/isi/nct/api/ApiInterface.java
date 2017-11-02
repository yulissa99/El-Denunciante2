package com.uca.apps.isi.nct.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import com.uca.apps.isi.nct.models.Category;
import com.uca.apps.isi.nct.models.Complaint;

public interface ApiInterface {

    @GET("Categories")
    Call<List<Category>> getCategories();

    @GET("Complaints")
    Call<List<Complaint>> getComplaints();

    @POST("Complaints")
    Call<Complaint> createComplaint(@Body Complaint complaint);


}