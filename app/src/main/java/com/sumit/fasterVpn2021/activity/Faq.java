package com.sumit.fasterVpn2021.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sumit.fasterVpn2021.R;
import com.sumit.fasterVpn2021.adapter.AdmobAds;

public class Faq extends AppCompatActivity {

    ImageView backToActivity;
    TextView activity_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        AdmobAds.loadBanner(this);

        activity_name = findViewById(R.id.activity_name);
        backToActivity = findViewById(R.id.finish_activity);

        activity_name.setText(R.string.faq);

        backToActivity.setOnClickListener(view -> finish());
    }
}
