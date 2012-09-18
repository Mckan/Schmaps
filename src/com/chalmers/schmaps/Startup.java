package com.chalmers.schmaps;

import android.os.Bundle;
import android.app.Activity;
<<<<<<< HEAD
import android.view.Menu;
=======
import android.content.Intent;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

>>>>>>> upstream/master

public class Startup extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
<<<<<<< HEAD
=======
        
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
        ImageView myView = (ImageView) findViewById(R.id.imageView1);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.appear);
        myView.startAnimation(fadeInAnimation);
        timer.start();
>>>>>>> upstream/master
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_startup, menu);
        return true;
    }
<<<<<<< HEAD
=======

	@Override
	protected void onPause() {
		super.onPause();
		finish();
	}
    

>>>>>>> upstream/master
}
