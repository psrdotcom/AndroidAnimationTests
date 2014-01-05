
package info.pillisureshraju.mobile.android.animationstest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity
{
	private final static String TAG = "MainActivity";

	private ToggleButton tb;
	private Animation anim;
	private TextView tv_record;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tb = (ToggleButton) findViewById(R.id.tb_record);
		anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
		tv_record = (TextView) findViewById(R.id.tv_recording);

	}
	
	public void onToggle(View view)
	{
		boolean on = ((ToggleButton) view).isChecked();
		
		if (on)
		{
			// Start animation code goes here
			Log.d(TAG, "Animation Started");
			tv_record.startAnimation(anim);
		} else
		{
			// Stop animation code goes here
			Log.d(TAG, "Animation Stoped");
			tv_record.clearAnimation();
		}
	}
	
}
