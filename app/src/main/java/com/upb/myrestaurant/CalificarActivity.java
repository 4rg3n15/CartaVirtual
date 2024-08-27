package com.upb.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalificarActivity extends AppCompatActivity {

    private EditText reviewText;
    private RatingBar ratingBar;
    private Button submitButton;
    private Button backToMainButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificar);

        reviewText = findViewById(R.id.reviewText);
        ratingBar = findViewById(R.id.ratingBar);
        submitButton = findViewById(R.id.submitButton);
        backToMainButton = findViewById(R.id.backToMainButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String review = reviewText.getText().toString();
                float rating = ratingBar.getRating();


                Toast.makeText(CalificarActivity.this, "Reseña anónima enviada al Edén, Gracias!", Toast.LENGTH_LONG).show();


                reviewText.setText("");
                ratingBar.setRating(0);
            }
        });
        backToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para navegar a MainActivity
                Intent intent = new Intent(CalificarActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
