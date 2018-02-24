	AZpackage calculator.shohag.com;

import android.app.Activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class CalculatorActivity extends Activity {
    /** Called when the activity is first created. */
	int counter;
	Button add,sub,mul,div;	
	Button one,two,three,four,five,six,seven,eight,nine,zero,delete,cut,equal;
	EditText edittext1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        addListenerOnButton();
        //Calculate();
    };
    
public void addListenerOnButton(){	
		
	  counter = 0;
	  edittext1=(EditText)findViewById(R.id.editText1);
	 
      add = (Button) findViewById(R.id.btn1);
      sub = (Button) findViewById(R.id.btn2);
      mul = (Button) findViewById(R.id.btn3);
      div = (Button) findViewById(R.id.btn4);
      one = (Button) findViewById(R.id.btn5);
      two = (Button) findViewById(R.id.btn6);
      three = (Button) findViewById(R.id.btn7);
      zero = (Button) findViewById(R.id.btn8);
      four = (Button) findViewById(R.id.btn9);
      five = (Button) findViewById(R.id.btn10);
      six = (Button) findViewById(R.id.btn11);
      cut = (Button) findViewById(R.id.btn12);
     
      seven = (Button) findViewById(R.id.btn13);
      eight = (Button) findViewById(R.id.btn14);
      nine = (Button) findViewById(R.id.btn15);
      equal = (Button) findViewById(R.id.btn16);
      one.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"1");
          }
      });
      two.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"2");
          }
      });
      three.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"3");
          }
      });
      four.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"4");
          }
      });
      five.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"5");
          }
      });
      six.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"6");
          }
      });
      seven.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"7");
          }
      });
      eight.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"8");
          }
      });
      nine.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"9");
          }
      });      zero.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
        	  edittext1.setText(edittext1.getText()+"0");
          }
      });
      add.setOnClickListener(new OnClickListener(){

			public void onClick(View veiw) {
				edittext1.setText(edittext1.getText()+"+");
				
			}
			
		});
      sub.setOnClickListener(new OnClickListener(){

			public void onClick(View veiw) {
				edittext1.setText(edittext1.getText()+"-");
				
			}
			
		});
      mul.setOnClickListener(new OnClickListener(){

			public void onClick(View veiw) {
				edittext1.setText(edittext1.getText()+"*");
				
			}
			
		});
      div.setOnClickListener(new OnClickListener(){

			public void onClick(View veiw) {
				edittext1.setText(edittext1.getText()+"/");
			}
			
		});
      cut.setOnClickListener(new OnClickListener(){

			public void onClick(View veiw) {
				//edittext1.setText(edittext1.getText()+"");
				edittext1.setText(" ");
			}
			
		});  
      equal.setOnClickListener(new OnClickListener(){

			public void onClick(View veiw) {
				edittext1.setText(edittext1.getText()+"");
				String fulltext=edittext1.getText().toString();
			
			
				char Sign='\0';
				int index=0;
				
				for(int i=0;i < fulltext.length();i++){
					Sign=fulltext.charAt(i);
					if(Sign == '+'){
						index=i;
						break;
					}
					else if(Sign == '-'){
						index=i;
						break;
					}
					else if(Sign== '*'){
						index=i;
					}
					else if(Sign == '/'){
						index=i;
						break;
					}
					else {
						continue;
					}
				}
				String 	a,b;		
				
			
				a=fulltext.substring(0, index);
				b=fulltext.substring(index+1, fulltext.length());
				
				double val1=Double.parseDouble(a);
				double val2=Double.parseDouble(b);				
								
				if(Sign == '+'){
					Double result=val1+val2;
					String val=Double.toString(result);
					
					edittext1.setText(val);	
				}
				else if(Sign == '-'){
					Double result=val1-val2;
					String val=Double.toString(result);
					
					edittext1.setText(val);
				}
				else if(Sign == '*'){
					Double result=val1*val2;
					String val=Double.toString(result);
				
					edittext1.setText(val);
				}
				else if(Sign == '/'){		
					if(val1==0){
						if(val2==0){
							edittext1.setText("1");
						}
						else {
							edittext1.setText("Error");
						}
					}
					else if(val2==0){
						if(val1==0){
							edittext1.setText("1");
						}
						else {
							edittext1.setText("Error");
						}
					}
					else{
						Double result=val1/val2;
						String val=Double.toString(result);					
						edittext1.setText(val);
					}
			}
			}
		});
		
	

}

}
