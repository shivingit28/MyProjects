import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnimationUtils.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


//Our MainActivity class inherits from the AppCompatActivity base class.

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Animation scale;
    private String curr;
    private String first;
    private String second;
    private String operation;

    private boolean operation_selected;
    private boolean dot_inserted;
    private boolean operation_completed;

    private TextView first_string_part;
    private TextView second_string_part;
    private TextView operation_part;
    private TextView result_part;
    private TextView current;



    @Override
    protected void onCreate(Bundle savedInstanceState) {			//this function is called when the activity is created, it is called automatically
        super.onCreate(savedInstanceState);					//this passes information to base class. Bundle consists of housekeeping information
        setContentView(R.layout.activity_main);					//this sets activity_main.xml as the interface for MainActivity.java

    first_string_part=(TextView)findViewById(R.id.first_string_part);
    second_string_part=(TextView)findViewById(R.id.second_string_part);
    operation_part=(TextView)findViewById(R.id.operation_part);
    result_part=(TextView)findViewById(R.id.result_part);

    scale=AnimationUtils.loadAnimation(this,R.anim.anim_scale);			//the anim_scale contains information about button pop up animation. As 
    current=first_string_part;							//you press each button it pop up and zooms up in size


    //intialize boolean flags
    operation_selected=false;
    dot_inserted=false;
    operation_completed=false;

    //initializing strings
    operation=null;
    first=null;
    second=null;
    curr=null;


}

	//here are the function definition related to all button clicks and other support function for displaying and other stuff



    public void display()
    {
        current.setText(curr);
    }

    public void clear_and_delete()
    {
        first=second=curr=null;
        current=first_string_part;
        operation_selected=false;
        dot_inserted=false;
        operation_completed=false;
        first_string_part.setText("");
        operation_part.setText("");
        second_string_part.setText("");
        result_part.setText("");
    }
    public void onClick_0(View view) {

        button=(Button)findViewById(R.id.btn_0);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="0";
        else
            curr=curr+"0";
        display();
    }

    public void onClick_1(View view) {

        button=(Button)findViewById(R.id.btn_1);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="1";
        else
            curr=curr+"1";
        display();
    }

    public void onClick_2(View view) {
        button=(Button)findViewById(R.id.btn_2);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="2";
        else
            curr=curr+"2";
        display();
    }

    public void onClick_3(View view) {
        button=(Button)findViewById(R.id.btn_3);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="3";
        else
            curr=curr+"3";
        display();
    }

    public void onClick_4(View view) {
        button=(Button)findViewById(R.id.btn_4);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="4";
        else
            curr=curr+"4";
        display();

    }

    public void onClick_5(View view) {
        button=(Button)findViewById(R.id.btn_5);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="5";
        else
            curr=curr+"5";
        display();
    }

    public void onClick_6(View view) {
        button=(Button)findViewById(R.id.btn_6);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="6";
        else
            curr=curr+"6";
        display();
    }

    public void onClick_7(View view) {
        button=(Button)findViewById(R.id.btn_7);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="7";
        else
            curr=curr+"7";
        display();
    }

    public void onClick_8(View view) {
        button=(Button)findViewById(R.id.btn_8);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="8";
        else
            curr=curr+"8";
        display();

    }

    public void onClick_9(View view) {
        button=(Button)findViewById(R.id.btn_9);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(curr==null)
            curr="9";
        else
            curr=curr+"9";
        display();

    }
    public void onClick_dot(View view) {
        button=(Button)findViewById(R.id.btn_dot);
        button.startAnimation(scale);
        if(operation_completed==true)
        {
            clear_and_delete();
        }
        if(dot_inserted==true)
            return;
        if(curr==null)
            curr=".";
        else
            curr=curr+".";
        dot_inserted=true;
        display();
    }

    private void clear_and_reset() {

        curr=first;
        first=second=null;

        first_string_part.setText(curr);
        operation_part.setText("");
        result_part.setText("");
        second_string_part.setText("");
        operation_completed=false;
        operation_selected=false;
    }

    public void onClick_add(View view) {            //add

        button=(Button)findViewById(R.id.btn_add);
        button.startAnimation(scale);

        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(curr==null)
            return ;
        if(curr.compareTo(".")==0)
            return ;
        operation_part.setText("+");
        current=second_string_part;
        operation_selected=true;
        first=curr;
        curr=null;
        operation="+";
    }



    public void onClick_sub(View view) {            //sub

        button=(Button)findViewById(R.id.btn_sub);
        button.startAnimation(scale);

        if(operation_selected==true) {
            if(curr==null)
                curr="-";
            current.setText(curr);
                return;
        }
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(curr==null) {
            curr="-";
            current.setText(curr);
            return ;
        }if(curr.compareTo(".")==0)
            return ;
        operation_part.setText("-");
        current=second_string_part;
        operation_selected=true;
        first=curr;
        curr=null;
        operation="-";
    }

    public void onClick_mul(View view) {            //mul

        button=(Button)findViewById(R.id.btn_mul);
        button.startAnimation(scale);
        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(curr==null)
            return ;
        if(curr.compareTo(".")==0)
            return ;
        operation_part.setText("*");
        current=second_string_part;
        operation_selected=true;
        first=curr;
        curr=null;
        operation="*";
    }

    public void onClick_div(View view) {         //divide

        button=(Button)findViewById(R.id.btn_div);
        button.startAnimation(scale);
        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(curr==null)
            return ;
        if(curr.compareTo(".")==0)
            return ;
        operation_part.setText("/");
        current=second_string_part;
        operation_selected=true;
        first=curr;
        curr=null;
        operation="/";
    }

    public void onClick_and(View view) {            //and
        button=(Button)findViewById(R.id.btn_and);
        button.startAnimation(scale);

        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(curr==null)
            return ;
        if(curr.compareTo(".")==0)
            return ;
        operation_part.setText("&");
        current=second_string_part;
        operation_selected=true;
        first=curr;
        curr=null;
        operation="&";
    }

    public void onClick_or(View view) {             //or
        button=(Button)findViewById(R.id.btn_or);
        button.startAnimation(scale);

        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(curr==null)
            return ;
        if(curr.compareTo(".")==0)
            return ;
        operation_part.setText("|");
        current=second_string_part;
        operation_selected=true;
        first=curr;
        curr=null;
        operation="|";
    }


    public void onClick_xor(View view) {            //xor

        button=(Button)findViewById(R.id.btn_xor);
        button.startAnimation(scale);
        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(curr==null)
            return ;
        if(curr.compareTo(".")==0)
            return ;
        operation_part.setText("^");
        current=second_string_part;
        operation_selected=true;
        first=curr;
        curr=null;
        operation="^";
    }

    public void onClick_mod(View view) {            //mod

        button=(Button)findViewById(R.id.btn_mod);
        button.startAnimation(scale);
        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(curr==null)
            return ;
        if(curr.compareTo(".")==0)
            return ;
        operation_part.setText("%");
        current=second_string_part;
        operation_selected=true;
        first=curr;
        curr=null;
        operation="%";
    }

    public void onClick_pow(View view) {            //pow
        button=(Button)findViewById(R.id.btn_pow);
        button.startAnimation(scale);
        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(curr==null)
            return ;
        if(curr.compareTo(".")==0)
            return ;
        operation_part.setText("**");
        current=second_string_part;
        operation_selected=true;
        first=curr;
        curr=null;
        operation="**";
    }

    public void onClick_isp(View view) {            //isp
        button=(Button)findViewById(R.id.btn_isp);
        button.startAnimation(scale);
        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(first==null && curr==null)
            return;

        if(first==null && curr!=null) {
            first = curr;
            curr=null;
        }
        operation_part.setText("ISP");
        operation_selected=true;
        boolean res=Calculator_class.is_prime(first);
        if(res==true)
            result_part.setText("Prime");
        else
            result_part.setText("Not Prime");
        operation_selected=false;
        operation_completed=true;

    }

    public void onClick_not(View view) {            //isp
        button=(Button)findViewById(R.id.btn_not);
        button.startAnimation(scale);
        if(operation_selected==true)
            return ;
        if(operation_completed==true)
        {
            clear_and_reset();
        }
        if(first==null && curr==null)
            return;

        if(first==null && curr!=null) {
            first = curr;
            curr=null;
        }
        operation_part.setText("~");
        operation_selected=true;
        String res=Calculator_class.logical_not(first);
        result_part.setText(res);
        first=res;
        operation_selected=false;
        operation_completed=true;

    }

    public void onClick_equals(View view) {         //equals
        button=(Button)findViewById(R.id.btn_equals);
        button.startAnimation(scale);
        if(operation_selected==false)
            return;
        if(first==null)
            return ;
        if(curr==null)
            return ;
        second=curr;
        switch (operation)
        {
            case "+":
            {
                String res=Calculator_class.add(first,second);
                result_part.setText(res);
                first=res;
                operation_selected=false;
                operation_completed=true;
                break;
            }
            case "-":
            {
                String res=Calculator_class.subtract(first,second);
                result_part.setText(res);
                first=res;
                operation_selected=false;
                operation_completed=true;
                break;
            }
            case "*":
            {
                String res=Calculator_class.multiply(first,second);
                result_part.setText(res);
                first=res;
                operation_selected=false;
                operation_completed=true;
                break;
            }
            case "/":
            {
                String res=Calculator_class.divide(first,second);
                result_part.setText(res);
                first=res;
                operation_selected=false;
                operation_completed=true;
                break;
            }
            case "&":
            {
                String res=Calculator_class.logical_and(first,second);
                result_part.setText(res);
                first=res;
                operation_selected=false;
                operation_completed=true;
                break;
            }
            case "|":
            {
                String res=Calculator_class.logical_or(first,second);
                result_part.setText(res);
                first=res;
                operation_selected=false;
                operation_completed=true;
                break;
            }
            case "^":
            {
                String res=Calculator_class.logical_xor(first,second);
                result_part.setText(res);
                first=res;
                operation_selected=false;
                operation_completed=true;
                break;
            }

            case "%":
            {
                String res=Calculator_class.mod(first,second);
                result_part.setText(res);
                first=res;
                operation_selected=false;
                operation_completed=true;
                break;
            }
            case "**":
            {
                String res=Calculator_class.pow(first,second);
                result_part.setText(res);
                first=res;
                operation_selected=false;
                operation_completed=true;
                break;
            }
            case "gcd": {
                String res = Calculator_class.gcd(first, second);
                result_part.setText(res);
                first = res;
                operation_selected = false;
                operation_completed = true;
                break;
            }
            default:
            {
                break;
            }
        }
    }

    public void onClick_clr(View view) {
        button=(Button)findViewById(R.id.btn_0);
        button.startAnimation(scale);
        first=second=curr=null;
        current=first_string_part;
        operation_selected=false;
        dot_inserted=false;
        operation_completed=false;
        first_string_part.setText("");
        operation_part.setText("");
        second_string_part.setText("");
        result_part.setText("");


    }

    public void onClick_gcd(View view) {
    //add
        button=(Button)findViewById(R.id.btn_0);
        button.startAnimation(scale);

            if(operation_selected==true)
                return ;
            if(operation_completed==true)
            {
                clear_and_reset();
            }
            if(curr==null)
                return ;
            if(curr.compareTo(".")==0)
                return ;
            operation_part.setText("GCD");
            current=second_string_part;
            operation_selected=true;
            first=curr;
            curr=null;
            operation="gcd";
        }
}


