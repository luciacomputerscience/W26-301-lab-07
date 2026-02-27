package com.example.androiduitesting;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.androiduitesting.databinding.ActivityShowBinding;

import org.w3c.dom.Text;

public class ShowActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityShowBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameText = findViewById(R.id.show_city_clicked);
        String cityName = getIntent().getStringExtra("city_name");
        cityNameText.setText(cityName);

        final Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> finish());
    }
}