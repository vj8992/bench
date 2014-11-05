package my.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.another_layout);
	}
	
public void greetuser(View view)
{
	EditText etname = (EditText) findViewById(R.id.etname);
	String fname = etname.getText().toString();
	EditText etlname = (EditText) findViewById(R.id.etlname);
	String lname = etlname.getText().toString();
	TextView tvresult = (TextView) findViewById(R.id.tvresult);
	tvresult.setText("helloo  " +fname+" "+lname);
}
}
