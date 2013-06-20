package com.tekacademy.alarmdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ScrollView extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scrollview);
		
		TextView text1 = (TextView)findViewById(R.id.txt1);
		text1.setText("WELCOME");
		
		TextView text2 = (TextView)findViewById(R.id.txt2);
		text2.setText("To");
		
		TextView text3 = (TextView)findViewById(R.id.txt3);
		text3.setText("TekAcademy");
	}

}
