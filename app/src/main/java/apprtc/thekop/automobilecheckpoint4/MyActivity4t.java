package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity4t extends AppCompatActivity {
    private Button btndomneun,btnyam,btnsrisu,btnbanrai,btnpang
            ,btntanud,btnkun,btndon,btndonkang,btndonkoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity4t);
        Button button1 = (Button) findViewById(R.id.btndomneun);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity26m.class);
                startActivity(k);
            }
        });
        Button button2 = (Button) findViewById(R.id.btnyam);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity27m.class);
                startActivity(k);
            }
        });
        Button button3 = (Button) findViewById(R.id.btnsrisu);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity28m.class);
                startActivity(k);
            }
        });
        Button button4 = (Button) findViewById(R.id.btnbanrai);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity29m.class);
                startActivity(k);
            }
        });
        Button button5 = (Button) findViewById(R.id.btnpang);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity30m.class);
                startActivity(k);
            }
        });
        Button button6 = (Button) findViewById(R.id.btntanud);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity31m.class);
                startActivity(k);
            }
        });
        Button button7 = (Button) findViewById(R.id.btnkun);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity32m.class);
                startActivity(k);
            }
        });
        Button button8 = (Button) findViewById(R.id.btndon);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity33m.class);
                startActivity(k);
            }
        });
        Button button9 = (Button) findViewById(R.id.btndonkang);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity34m.class);
                startActivity(k);
            }
        });
        Button button10 = (Button) findViewById(R.id.btndonkoi);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity35m.class);
                startActivity(k);
            }
        });


    }
}//Mainclass
