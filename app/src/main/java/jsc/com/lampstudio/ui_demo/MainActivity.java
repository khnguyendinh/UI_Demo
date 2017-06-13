package jsc.com.lampstudio.ui_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_constraint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_constraint = (Button) findViewById(R.id.btn_constrain);
        btn_constraint.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_constrain:
                Intent intent = new Intent(this,ConstraintLayout.class);
                startActivity(intent);
                break;
        }
    }
}
