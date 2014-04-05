package com.oss.retrofithello;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.oss.retrofithello.model.Alumno;

public class MainActivity extends Activity {
	private TextView userData;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		userData = (TextView)findViewById(R.id.user_data);
		@SuppressWarnings("deprecation")
		RestAdapter restAdapter = new RestAdapter.Builder().setServer("http://10.0.2.2").build();
		AlumnoInterface service = restAdapter.create(AlumnoInterface.class);
		Callback<Alumno> callback = new Callback<Alumno>() {

			@Override
			public void failure(RetrofitError error) {
				Log.e("RETROFIT", error.toString());
				Toast.makeText(getApplicationContext(),
						"No se pudo conectar al Servidor", Toast.LENGTH_LONG)
						.show(); 
			}

			@Override
			public void success(Alumno alumno, Response response) {
				Log.d("RETROFIT", alumno.toString());
				userData.setText(alumno.toString());
			}
		};
		service.loginAlumno("3222127", "5414", callback);
	}
}
