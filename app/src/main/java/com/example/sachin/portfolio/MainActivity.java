package com.example.sachin.portfolio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    Button btnStream, btnScore, btnBig, btnLib, btnRead, btnCap;
    Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStream=(Button) findViewById(R.id.btnStream);
        btnScore=(Button) findViewById(R.id.btnScore);
        btnBig=(Button) findViewById(R.id.btnBig);
        btnLib=(Button) findViewById(R.id.btnLib);
        btnRead=(Button) findViewById(R.id.btnRead);
        btnCap=(Button) findViewById(R.id.btnCap);

        btnStream.setOnClickListener(this);
        btnScore.setOnClickListener(this);
        btnBig.setOnClickListener(this);
        btnLib.setOnClickListener(this);
        btnRead.setOnClickListener(this);
        btnCap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(mToast != null)
        {
            mToast.cancel();
        }
        mToast = Toast.makeText(this, "This button will launch " + ((Button) view).getText().toString().toLowerCase() + "!", Toast.LENGTH_SHORT);
        mToast.show();
    }

}
