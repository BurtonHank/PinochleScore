package com.burton_chandler.pinochlescore;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button btnSetMeld = (Button)findViewById(R.id.meldbutton);
        btnSetMeld.setOnClickListener(new Button.OnClickListener(){
        	public void onClick(View arg0) {
        		LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View setMeldView = layoutInflater.inflate(R.layout.set_meld_layout, null);
        		final PopupWindow meldPopup = new PopupWindow(
        				setMeldView,
        				LayoutParams.WRAP_CONTENT,
        				LayoutParams.WRAP_CONTENT);
        		
        		Button btnSave = (Button)setMeldView.findViewById(R.id.savemeld);
        		btnSave.setOnClickListener(new Button.OnClickListener()
        		{
        			public void onClick(View v){
        				meldPopup.dismiss();
        			}
        		});
        		
        		meldPopup.showAtLocation(btnSetMeld,1, 50, -75);
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
