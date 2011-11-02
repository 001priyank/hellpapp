package com.HelloApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void buttonClickListener(View v)
    {
    	Intent i=new Intent(this, com.HelloApp.nextpage.class);
    	startActivity(i);
    	
    	
    }
    
}