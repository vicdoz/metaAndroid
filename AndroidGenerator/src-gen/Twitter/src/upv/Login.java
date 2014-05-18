package upv;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class Login extends Activity {

	private OnClickListener mClickListener;
	private OnLongClickListener mLongClickListener;
	private Button Login;
	private EditText User;
private EditText Password;
private TextView Password;
private TextView User;


@Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.IntroApp);
		
		Login = (Button) findViewById(R.id.);
		User = (EditText) findViewById(R.id.idLoginUser);
		Password = (EditText) findViewById(R.id.idLoginPassText);
		Password = (TextView) findViewById(R.id.idLoginPass);
		User = (TextView) findViewById(R.id.idLoginLabel);
		
		
		
  }
  
  @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
	