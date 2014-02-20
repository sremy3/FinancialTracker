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

public class Register extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		Button register = (Button) findViewById(R.id.register_register_button);
		register.setOnClickListener(new OnClickListener() {	
					
			public void onClick(View v){
				String userName = ((EditText) findViewById(R.id.register_userName)).getText().toString();
				String password = ((EditText) findViewById(R.id.register_password)).getText().toString();
				String firstName = ((EditText) findViewById(R.id.register_firstName)).getText().toString();
				String lastName = ((EditText) findViewById(R.id.register_lastName)).getText().toString();				
				boolean available = LoginData.checkAvailability(userName);
						
				if (available){
					User newUser = new User(userName, password, firstName, lastName);
					LoginData.addNewUser(newUser);
					Toast success = Toast.makeText(getApplicationContext(), "You may now log in", Toast.LENGTH_SHORT);
					success.show();
					Register.this.finish();
				}
				else{
					Toast incLogin = Toast.makeText(getApplicationContext(), "That user name is not available", Toast.LENGTH_SHORT);
					incLogin.show();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

}
