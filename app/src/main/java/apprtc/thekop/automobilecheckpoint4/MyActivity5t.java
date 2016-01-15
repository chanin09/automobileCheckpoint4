package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity5t extends AppCompatActivity {
    private Button btntao,btnpho,bntdonk,btnnong,btnban,btncum,btnsoifa,btntanod
            ,btntakod,btnbankog,btnsing,btndonsai,btnjed,btntapol,btnkaew,btnchajum,btntamma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity5t);
        Button button1 = (Button) findViewById(R.id.btnpho);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity36m.class);
                startActivity(k);
            }
        });
        Button button2 = (Button) findViewById(R.id.btndonk);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity37m.class);
                startActivity(k);
            }
        });
        Button button3 = (Button) findViewById(R.id.btnnong);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity38m.class);
                startActivity(k);
            }
        });
        Button button4 = (Button) findViewById(R.id.btnban);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity39m.class);
                startActivity(k);
            }
        });
        Button button5 = (Button) findViewById(R.id.btntakod);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity40m.class);
                startActivity(k);
            }
        });
        Button button6 = (Button) findViewById(R.id.btnbankog);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity41m.class);
                startActivity(k);
            }
        });
        Button button7 = (Button) findViewById(R.id.btnsing);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity42m.class);
                startActivity(k);
            }
        });
        Button button8 = (Button) findViewById(R.id.btndonsai);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity43m.class);
                startActivity(k);
            }
        });
        Button button9 = (Button) findViewById(R.id.btnjed);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity44m.class);
                startActivity(k);
            }
        });
        Button button10 = (Button) findViewById(R.id.btnsoifa);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity45m.class);
                startActivity(k);
            }
        });
        Button button11 = (Button) findViewById(R.id.btntapol);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity46m.class);
                startActivity(k);
            }
        });
        Button button12 = (Button) findViewById(R.id.btntao);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity47m.class);
                startActivity(k);
            }
        });
        Button button13 = (Button) findViewById(R.id.btnkaew);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity48m.class);
                startActivity(k);
            }
        });
        Button button14 = (Button) findViewById(R.id.btntamma);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity49m.class);
                startActivity(k);
            }
        });
        Button button15 = (Button) findViewById(R.id.btnchajum);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), MyActivity50m.class);
                startActivity(k);
            }
        });

    }
} //Mainclass
