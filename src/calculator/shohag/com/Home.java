package calculator.shohag.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;


public class Home extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
         
        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {			
			public void onClick(View view) {
				Intent i=new Intent(getApplicationContext(),CalculatorActivity.class);
				startActivity(i);			
			}
		});    
    }  

}
