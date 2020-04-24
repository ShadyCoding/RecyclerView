package com.shady.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private TextView dName, dDesc, dRating;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();

        dName = findViewById(R.id.dName);
        dDesc = findViewById(R.id.dDesc);
        dRating = findViewById(R.id.dRating);


        if (extras != null) {
            dName.setText(extras.getString("name"));
            dDesc.setText(extras.getString("desc"));
            dRating.setText(extras.getString("rating"));
        }

    }
}
