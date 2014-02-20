package edu.cs2340.supercoders.financialtracker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		//Setting up the login button
		Button login = (Button) findViewById(R.id.login_login_button);
		login.setOnClickListener(new OnClickListener() {	
			
			public void onClick(View v){
				String userName = ((EditText) findViewById(R.id.user_name)).getText().toString();
				String password = ((EditText) findViewById(R.id.password)).getText().toString();
				boolean result = LoginData.checkUser(userName, password);
				
				if (result){
					Intent loginIntent = new Intent(getApplicationContext(), Home.class);
					startActivity(loginIntent);
				}
				else{
					Toast incLogin = Toast.makeText(getApplicationContext(), "Incorrect Login", Toast.LENGTH_SHORT);
					incLogin.setGravity(Gravity.CENTER, 0, 0);
					incLogin.show();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
