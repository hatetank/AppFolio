package com.gavin.example.appfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button app1Button;
    Button app2Button;
    Button app3Button;
    Button app4Button;
    Button app5Button;
    Button app6Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app1Button = (Button) findViewById(R.id.button_app1);
        app2Button = (Button) findViewById(R.id.button_app2);
        app3Button = (Button) findViewById(R.id.button_app3);
        app4Button = (Button) findViewById(R.id.button_app4);
        app5Button = (Button) findViewById(R.id.button_app5);
        app6Button = (Button) findViewById(R.id.button_app6);
    }

    public void launchApp(View view) {
        switch (view.getId()) {
            case (R.id.button_app1): {
                popToast(app1Button.getText().toString());
            }
            case (R.id.button_app2): {
                popToast(app2Button.getText().toString());
            }
            case (R.id.button_app3): {
                popToast(app3Button.getText().toString());
            }
            case (R.id.button_app4): {
                popToast(app4Button.getText().toString());
            }
            case (R.id.button_app5): {
                popToast(app5Button.getText().toString());
            }
            case (R.id.button_app6): {
                popToast(app6Button.getText().toString());
            }
            default: {
                popToast("You pressed a button that shouldn't exist!");
            }

        }
    }

    private void popToast(String s) {
        Toast.makeText(getApplicationContext(),
                String.format("This button will launch %s", s),
                Toast.LENGTH_LONG).show();
    }
}
