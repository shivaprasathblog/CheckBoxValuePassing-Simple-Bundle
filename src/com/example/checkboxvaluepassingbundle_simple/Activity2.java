package com.example.checkboxvaluepassingbundle_simple;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Activity2 extends Activity 
{

	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		
		tv=(TextView)findViewById(R.id.textView1);
		
		Bundle bundle=getIntent().getExtras();
		
		String checkboxvaluereceived=bundle.getString("key_checkbox");
		
		tv.setText("The Value Checkbox Received -"+checkboxvaluereceived);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}

}
