package com.chalmers.schmaps;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;


public class Startup extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        //Use a thread for the splash screen to assign its lifetime.
        Thread timer = new Thread(){
        public void run (){
        	try{
        		sleep(5000);
        		Intent startMenuActivity = new Intent("android.intent.action.MENUACTIVITY");
        		startActivity(startMenuActivity);
        	}
        	catch(InterruptedException e){
        		e.printStackTrace();
        	}
        }
      };
      
      timer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_startup, menu);
        return true;
    }

	@Override
	protected void onPause() {
		super.onPause();
		finish();
	}
    

}
