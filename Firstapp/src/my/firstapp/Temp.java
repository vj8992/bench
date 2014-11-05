package my.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Temp extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calci_layout);
	}

	public void calculate(View view)
	{
	TextView tvresult = (TextView) findViewById(R.id.tvresult);
	EditText etone = (EditText) findViewById(R.id.etone);
	EditText ettwo = (EditText) findViewById(R.id.ettwo);
	try {
		double num1 = Double.parseDouble(etone.getText().toString());
		double num2 = Double.parseDouble(ettwo.getText().toString());
		switch (view.getId()) {
		case R.id.btn1:
					tvresult.setText(" "+(num1+num2));
			break;
		case R.id.btn2:
			tvresult.setText(" "+(num1-num2));
	break;
		case R.id.btn3:
			tvresult.setText(" "+(num1/num2));
	break;
		case R.id.btn4:
			tvresult.setText(" "+(num1*num2));
	break;
		}
	} catch (Exception e) {
		tvresult.setText("please enter both the numbers.....");
	}
		
	}
}
