package com.chalmers.schmaps;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
<<<<<<< HEAD
import android.widget.ImageView;
=======
import android.view.View;
import android.widget.Button;
>>>>>>> 2d5059616debe4f27043f8c5e2f23402eaddf505

public class MenuActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
<<<<<<< HEAD

=======
        Button searchHall = (Button) findViewById(R.id.button1);
        searchHall.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent startMapActivity = new Intent("android.intent.action.MAPACTIVITY");
				startActivity(startMapActivity);
			}
		});
>>>>>>> 2d5059616debe4f27043f8c5e2f23402eaddf505
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
}
