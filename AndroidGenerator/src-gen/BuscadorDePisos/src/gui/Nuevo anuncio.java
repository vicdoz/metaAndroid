package gui;

import gui.R;
import android.app.Activity;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;

import android.widget.EditText;
import android.widget.TextView;



public class Nuevo anuncio extends Activity {

	
	
	private EditText Precio;
private EditText Ciudad;
private EditText nHabitaciones;
private EditText Descripcion;
private TextView Precio;
private TextView Ciudad;
private TextView Habitaciones;
private TextView Descripcion;


@Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.LayoutNuevo Anuncio);
		
		Precio = (EditText) findViewById(R.id.idPrecio);
		Ciudad = (EditText) findViewById(R.id.idCiudad);
		nHabitaciones = (EditText) findViewById(R.id.idHab);
		Descripcion = (EditText) findViewById(R.id.idDescrp);
		Precio = (TextView) findViewById(R.id.idPrecio);
		Ciudad = (TextView) findViewById(R.id.idCiudad);
		Habitaciones = (TextView) findViewById(R.id.idhab);
		Descripcion = (TextView) findViewById(R.id.idDescript);
		
		
		
  }
  
  @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
	