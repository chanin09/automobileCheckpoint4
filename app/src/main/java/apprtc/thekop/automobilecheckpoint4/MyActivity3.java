package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity3 extends AppCompatActivity {
private Button btnna,btnjd,btndon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my3);
        Button button = (Button) findViewById(R.id.btnna);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity13m.class);
                startActivity(i);
            }
        });
        Button button1 = (Button) findViewById(R.id.btnjd);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity14m.class);
                startActivity(i);
            }
        });
        Button button2 = (Button) findViewById(R.id.btndon);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity15m.class);
                startActivity(i);
            }
        });


    }

}//Main Class
