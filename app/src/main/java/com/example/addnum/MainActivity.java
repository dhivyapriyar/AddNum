package com.example.addnum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.addnum.R;

public class MainActivity extends AppCompatActivity {

    private EditText num_1, num_2;
    private Button add_btn;
    private TextView result_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);
        add_btn = findViewById(R.id.add_btn);
        result_text = findViewById(R.id.result_text);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Check for empty input
                if (num_1.getText().toString().isEmpty() || num_2.getText().toString().isEmpty()) {
                    result_text.setText("Please enter both numbers");
                    return;
                }

                int value_1 = Integer.parseInt(num_1.getText().toString());
                int value_2 = Integer.parseInt(num_2.getText().toString());
                int sum = value_1 + value_2;

                // Display result in TextView
                result_text.setText("Sum = " + sum);
            }
        });
    }
}
