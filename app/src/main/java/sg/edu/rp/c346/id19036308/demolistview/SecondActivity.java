package sg.edu.rp.c346.id19036308.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvFood = (TextView) findViewById(R.id.textViewFood);

        Intent intent = getIntent();
        String textIntent = intent.getStringExtra("key");
        tvFood.setText(textIntent);
    }
}