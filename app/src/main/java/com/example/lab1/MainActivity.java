package com.example.lab1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textViewFio, textViewGroup;
    private ImageButton imageButton;
    private Button button;
    private ImageView imageView;
    Boolean result = false;
    Boolean resultIm = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textViewFio = findViewById(R.id.textView);
        textViewGroup = findViewById(R.id.textView2);
        imageView = findViewById(R.id.imageView);
        imageButton = findViewById(R.id.imageButton);
        button = findViewById(R.id.button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result == false) {
                    textViewFio.setVisibility(View.GONE);
                    textViewGroup.setVisibility(View.GONE);
                    result = true;
                }
                else{
                    textViewFio.setVisibility(View.VISIBLE);
                    textViewGroup.setVisibility(View.VISIBLE);
                    result = false;
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultIm == false) {
                    imageView.setVisibility(View.GONE);
                    resultIm = true;
                }
                else{
                    imageView.setVisibility(View.VISIBLE);
                    resultIm = false;
                }
            }
        });
    }


}