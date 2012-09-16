package com.chalmers.schmaps;

import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MapActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        final HashMap<String, Integer> lectureHashMap = new HashMap();
        final Button editButton = (Button) findViewById(R.id.edittextbutton);
        final EditText lectureEdit = (EditText) findViewById(R.id.edittextlecture);
        lectureEdit.setOnTouchListener(new View.OnTouchListener() {
			
			public boolean onTouch(View arg0, MotionEvent arg1) {
				lectureEdit.setText("");
				return false;
			}
		});
        editButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				String lectureText = lectureEdit.getText().toString();
				if(lectureHashMap.containsKey(lectureText))
						{
							//TODO A method that returns coordinates to database.
						}
				
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_map, menu);
        return true;
    }
}
