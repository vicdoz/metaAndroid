package com;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

private Button button;
private Button add;
private EditText field;
private TextView view;


@Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.MainActivity);
		
		button = (Button) findViewById(R.id.button);
		add = (Button) findViewById(R.id.add);
		field = (EditText) findViewById(R.id.field);
		view = (TextView) findViewById(R.id.view);
		
  }

}
	