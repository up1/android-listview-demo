package com.training.android;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Load data from xml file ( /res/values/reports.xml )
		String[] reports = getResources().getStringArray(R.array.reports);

		// Binding resources to ListAdapter
		this.setListAdapter(new ArrayAdapter<String>(this,
				R.layout.list_report, R.id.label, reports));

		// Get ListView object
		ListView listView = getListView();

		// Handling ListView item click
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// Selected item
				String report = ((TextView) view).getText().toString();

				// Launching new Activity on selecting item
				Intent i = new Intent(getApplicationContext(), ReportDetailActivity.class);
				// Sending data to new activity
				i.putExtra("report", report);
				startActivity(i);
			}
		});
		
	}
}