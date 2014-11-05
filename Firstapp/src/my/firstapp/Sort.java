package my.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Sort extends Activity{
	public static int[] oarray;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sorting_layout);
	}

	public void sortIt(View view)
	{
		switch (view.getId()) {
		case R.id.btnbubble:
			int[] cloneA = calculator.cloneArray(oarray);
			long start = System.currentTimeMillis();
			calculator.bubbleSort(cloneA);
			long end = System.currentTimeMillis();
			long timet = end - start;
			TextView tvbubble = (TextView) findViewById(R.id.tvbubble);
			tvbubble.setText(" "+timet+" ms");
			break;
		case R.id.btnmerge:
			int [] cloneB = calculator.cloneArray(oarray);
			long starts = System.currentTimeMillis();
			calculator.mergeSort(cloneB);
			long ends = System.currentTimeMillis();
			long timetk = ends - starts;
			TextView tvmerge = (TextView) findViewById(R.id.tvmerge);
			tvmerge.setText(" "+timetk+" ms");
			break;
		}
	}
	public void generate(View view)
	{
		TextView tvstat = (TextView) findViewById(R.id.tvStat);
		EditText etsize = (EditText) findViewById(R.id.etsize);
		try {
			int size = Integer.parseInt(etsize.getText().toString());
			
			RadioGroup rgcase = (RadioGroup) findViewById(R.id.rgcase);
			switch (rgcase.getCheckedRadioButtonId()) {
			case R.id.rbbest:
				oarray = calculator.generateascendingarray(size);
				tvstat.setText("sorted array is generated");
				break;
			case R.id.rbavg:
				oarray = calculator.genereateArray(size);
				
				tvstat.setText("random array is generated");
				break;
			case R.id.rbworst:
				oarray = calculator.genereateArray(size);
				tvstat.setText("unsorted array is generated");
				break;
			}
		} catch (Exception e) {
			tvstat.setText("enter a valid integer");
		}

		}

}
	
	