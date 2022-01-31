package com.example.horizontalscrollbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        String name="Name : Rushikesh Narkhede\nAppName:- HorizontalscrollBar\nDate :- 31/01/2022\n";
        Log.d("Rushi", "This button is a working properly");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
                Log.d("Rushi", "This button is working properly");
                //log is use to print message on console.
            }
        });
    }
}