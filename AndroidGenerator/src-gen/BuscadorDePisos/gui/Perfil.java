package gui;

import gui.R;
import android.app.Activity;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;


import android.widget.TextView;



public class Perfil extends Activity {

	
	
	private TextView Nombre;
private TextView labelApellido;


@Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.Layout Perfil);
		
		Nombre = (TextView) findViewById(R.id.idNombre);
		labelApellido = (TextView) findViewById(R.id.idApellidos);
		
		
		
  }
  
  @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
	