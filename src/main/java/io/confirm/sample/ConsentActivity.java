package io.confirm.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ConsentActivity extends AppCompatActivity {


    private Button mStartButton = null;
    private void loadOnClickevt(){
        mStartButton = (Button) findViewById(R.id.agreebtn);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent consentIntent = new Intent(ConsentActivity.this,MainActivity.class );
                startActivity(consentIntent);
            }
        });
        mStartButton = (Button) findViewById(R.id.disagreebtn);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String text = "You disagreed to continue, Exiting application and thanks for using the app";
                Toast.makeText(getBaseContext(), text,Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consent);
        loadOnClickevt();
    }
}
