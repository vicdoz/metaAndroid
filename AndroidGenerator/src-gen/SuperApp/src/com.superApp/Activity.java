package com.superApp;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class Activity extends Activity {

	private OnClickListener mClickListener;
	private OnLongClickListener mLongClickListener;
	private Button boton;
	

@Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);
		
		boton = (Button) findViewById(R.id.boton);
		
		events();
		boton.setOnClickListener(mClickListener);
		 boton.setOnLongClickListener(mLongClickListener);
		
  }
  
  @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void events(){
			mClickListener = new View.OnClickListener(){
				public void onClick(View view) {
					switch(view.getId()){
						case R.id.boton:
						AlertDialog.Builder builder = new AlertDialog.Builder(this);
						builder.setMessage(Prueba);
						
						AlertDialog dialog = builder.create();
						break;
						
					}
				}
			}
			mLongClickListener = new View.OnLongClickListener(){
				public boolean onLongClick(View arg0) {
					switch(view.getId()){
						case R.id.boton:
						AlertDialog.Builder builder = new AlertDialog.Builder(this);
						builder.setMessage(Prueba2);
						
						AlertDialog dialog = builder.create();
						break;
						
					}
					return false;
				}
			}
	}
	

}
	