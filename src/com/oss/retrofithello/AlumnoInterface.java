package com.oss.retrofithello;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

import com.oss.retrofithello.model.Alumno;


public interface AlumnoInterface {
	
	@FormUrlEncoded
	@POST("/service")
	void loginAlumno(@Field("cedula") String cedula,
					 @Field("password") String password,
					 Callback<Alumno> callback);
}
