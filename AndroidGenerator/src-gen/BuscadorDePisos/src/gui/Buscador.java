package gui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class Buscador extends Activity {

	private OnClickListener mClickListener;
	private OnLongClickListener mLongClickListener;
	private Button Buscar;
	private EditText Ciudad;


@Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.LayoutBuscador);
		
		Buscar = (Button) findViewById(R.id.idBuscar);
		Ciudad = (EditText) findViewById(R.id.idCiudad);
		
		events();
		Buscar.setOnClickListener(mClickListener);
		 Buscar.setOnLongClickListener(mLongClickListener);
		
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
						case R.id.idBuscar:
						AlertDialog.Builder builder = new AlertDialog.Builder(this);
						builder.setMessage(¿Seguro que desea buscar en esta ciudad?);
						
						AlertDialog dialog = builder.create();
						break;
						
					}
				}
			}
			mLongClickListener = new View.OnLongClickListener(){
				public boolean onLongClick(View arg0) {
					switch(view.getId()){
						case R.id.idBuscar:
						AlertDialog.Builder builder = new AlertDialog.Builder(this);
						builder.setMessage(Consulta con tiempo excesivo¿Quiere seguir esperando?);
						
						AlertDialog dialog = builder.create();
						break;
						
					}
					return false;
				}
			}
	}
	

}
	