package apprtc.thekop.automobilecheckpoint4;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Namtoey on 25/12/2558.
 */
public class MyActivity2 extends AppCompatActivity {

    //declarting Variable
    private Button btnMueg, btnPho, btnBan, btnPak, btnJom, btnWad, btnDum, btnSuan,
            btnBang, btnKing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my2);

        Button button = (Button) findViewById(R.id.btnMueg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity3.class);
                startActivity(i);
            }
        });

        Button btnPak = (Button) findViewById(R.id.btnPak);
        btnPak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity9t.class);
                startActivity(i);
            }
        });

        Button btnBan= (Button) findViewById(R.id.btnBan);
        btnBan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity6t.class);
                startActivity(i);
            }
        });

        Button btnbang = (Button) findViewById(R.id.btnBang);
        btnbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity10t.class);
                startActivity(i);
            }
        });

        Button btnking = (Button) findViewById(R.id.btnking);
        btnking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity12t.class);
                startActivity(i);
            }
        });

        Button btnjom = (Button) findViewById(R.id.btnJom);
        btnjom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity7t.class);
                startActivity(i);
            }
        });

        Button btnWad = (Button) findViewById(R.id.btnWad);
        btnWad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity11t.class);
                startActivity(i);
            }
        });

        Button btndum = (Button) findViewById(R.id.btndomneun);
        btndum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity4t.class);
                startActivity(i);
            }
        });

        Button btnSuan = (Button) findViewById(R.id.btnSuan);
        btnSuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity8t.class);
                startActivity(i);
            }
        });

        Button btnPho = (Button) findViewById(R.id.btnPho);
        btnPho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MyActivity5t.class);
                startActivity(i);
            }
        });


    }
}//MainClass