package challenge.afor.technology.routerconfiq.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import challenge.afor.technology.routerconfiq.R;
import challenge.afor.technology.routerconfiq.utils.AppUtils;

public class MainActivity extends AppCompatActivity {

    EditText uname,phone_number;
    String macAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=(EditText)findViewById(R.id.uname);
        phone_number=(EditText)findViewById(R.id.phone_number);


        macAddress=AppUtils.getDeviceMAC(MainActivity.this); // Here you will get device MAC address
        uname.getText().toString();    // here you will get user name from text field
        phone_number.getText().toString(); //here you will get phone number from input. 

    }
}
