package edu.cs2340.supercoders.financialtracker.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import edu.cs2340.supercoders.financialtracker.R;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		// Setting up new account Button to start CreateAccount intent
		Button newAccount = (Button) findViewById(R.id.home_newAccount);
		newAccount.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent createAccountIntent = new Intent(
						getApplicationContext(), CreateAccount.class);
				startActivity(createAccountIntent);
			}
		});

		/*
		 * This little area of code is a bit weird. Basically, we have a list
		 * view that starts out empty. What we're doing here is getting an array
		 * of Strings (that represent the accounts) and populating the list view
		 * by putting our array into an array adaptor, and then setting that
		 * adaptor to our list view.
		 */
		ListView list = (ListView) findViewById(R.id.home_accountList);
		String[] accountList = Welcome.getData().getCurrent().accountArray();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				getApplicationContext(), R.layout.account_list, accountList);
		list.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	/*
	 * This basically forces the method to refresh, so when we back out of
	 * create account it calls onCreate() again and displays our new account
	 * list.
	 */
	@Override
	protected void onResume() {
		super.onResume();
		this.onCreate(null);
	}

}
