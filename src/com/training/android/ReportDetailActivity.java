package com.training.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReportDetailActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.report_detail);

		TextView textView1 = (TextView) findViewById(R.id.textView1);

		Intent i = getIntent();
		// Getting data
		String report = i.getStringExtra("report");
		// Show report name
		textView1.setText(report);
	}
}
