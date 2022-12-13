package com.example.a1234;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PostActivity extends AppCompatActivity {
    private EditText title, platform, peoplenum, leastmoney, exo, link, year, month, day, hour, minute;
    private Button button;
    private ImageView back;

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        title = (EditText) findViewById(R.id.edit1);
        platform = (EditText) findViewById(R.id.edit2);
        peoplenum = (EditText) findViewById(R.id.edit3);
        leastmoney = (EditText) findViewById(R.id.edit4);
        exo = (EditText) findViewById(R.id.edit5);
        link = (EditText) findViewById(R.id.linkedit);
        year = (EditText) findViewById(R.id.IntDeadline_year);
        month = (EditText) findViewById(R.id.IntDeadline_month);
        day = (EditText) findViewById(R.id.IntDeadline_day);
        hour = (EditText) findViewById(R.id.IntDeadline_hour);
        minute = (EditText) findViewById(R.id.IntDeadline_minute);
        button = (Button) findViewById(R.id.postbutton);
        back = (ImageView) findViewById(R.id.back5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adddatabase(title.getText().toString(),platform.getText().toString(),peoplenum.getText().toString(),
                        leastmoney.getText().toString(),exo.getText().toString(),link.getText().toString(),year.getText().toString(),
                        month.getText().toString(),day.getText().toString(),hour.getText().toString(),minute.getText().toString());
                Intent intent = new Intent(PostActivity.this, HomeActivity1.class);
                startActivity(intent);
            }
        });

        back = (ImageView) findViewById(R.id.back5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, HomeActivity1.class);
                startActivity(intent);
            }
        });
    }

    public void adddatabase(String title, String platform, String peoplenum, String leastmoney, String exo, String link, String year, String month, String day, String hour, String minute){
        database database = new database(title, platform, peoplenum, leastmoney, exo, link,  year, month, day, hour, minute);
        databaseReference.child("text").child(title).setValue(database);
    }
}
//42323