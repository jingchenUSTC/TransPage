package com.jingchen.pagerdemo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity
{
	ScanView scanview;
	ScanViewAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		scanview = (ScanView) findViewById(R.id.scanview);
		List<String> items = new ArrayList<String>();
		for (int i = 0; i < 8; i++)
			items.add("ตฺ " + (i + 1) + " าณ");
		adapter = new ScanViewAdapter(this, items);
		scanview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
