package com.example.a1234;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;


public class ChatActivity extends AppCompatActivity {

    private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";
    private NotificationManager mNotificationManager;
    private static final int NOTIFICATION_ID = 0;

    private TextView logout, sold;
    private ImageView alarm, chatbutton;

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_chat);

        logout = (TextView) findViewById(R.id.logout2);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        alarm = (ImageView) findViewById(R.id.alarm2);
        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, AlarmActivity.class);
                startActivity(intent);
            }
        });

        sold = (TextView) findViewById(R.id.sold);
        sold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChatActivity.this, "송금을 완료했다는 알림을 방장에게 보냈습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        chatbutton = (ImageView) findViewById(R.id.chatchain);
        chatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, ChattingActivity.class);
                startActivity(intent);
            }
        });


    }

}
