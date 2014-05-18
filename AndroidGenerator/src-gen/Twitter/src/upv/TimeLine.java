package upv;

import upv.R;
import android.app.Activity;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class TimeLine extends Activity {

	private OnClickListener mClickListener;
	private OnLongClickListener mLongClickListener;
	private Button Compartir;
	private EditText Busqueda;


@Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.Principal);
		
		Compartir = (Button) findViewById(R.id.id1);
		Busqueda = (EditText) findViewById(R.id.idBusqueda);
		
		events();
		Compartir.setOnClickListener(mClickListener);
		
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
						case R.id.id1:
						AlertDialog.Builder builder = new AlertDialog.Builder(this);
						builder.setMessage(¿Está seguro de compartirlo?);
						
						AlertDialog dialog = builder.create();
						break;
						
					}
				}
			}
			mLongClickListener = new View.OnLongClickListener(){
				public boolean onLongClick(View arg0) {
					switch(view.getId()){
						
					}
					return false;
				}
			}
	}
	

}
	