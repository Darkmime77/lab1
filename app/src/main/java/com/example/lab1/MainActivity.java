package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textViewFio, textViewGroup;
    private ImageButton imageButton;
    Boolean result = false;

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
        imageButton = findViewById(R.id.imageButton);

//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(result = false) {
//                    textViewFio.setVisibility(View.INVISIBLE);
//                    textViewGroup.setVisibility(View.INVISIBLE);
//                    result = true;
//                }
//                else{
//                    textViewFio.setVisibility(View.VISIBLE);
//                    textViewGroup.setVisibility(View.VISIBLE);
//                    result = false;
//                }
//            }
//        });
    }


}