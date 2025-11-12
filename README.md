# Workshop-AddNum
## Aim:
To develop an Android application that accepts two numbers from the user and displays their sum.
## Algorithm:

1. Start the program.

2. Open Android Studio and create a new project.

3.Design the layout with:

  i)Two EditText fields for number input.

  ii)One Button to perform addition.

  iii)One TextView to display the result.

4. In the MainActivity.java file:

  i)Retrieve input values from the EditText fields.

  ii)Convert the inputs to integers.

  iii)Perform addition of the two numbers.

  iv)Display the result in the TextView.

5. Run the application on an emulator or real device.

6. Stop the program.

## Program:
```
Developed By: DHIVYAPRIYA R
Register Number: 212222230032
```
### MainActivity.java:
```
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
```

### activity_main.xml:
```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp">

    <EditText
        android:id="@+id/num_1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter first number"
        android:inputType="number" />

    <EditText
        android:id="@+id/num_2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter second number"
        android:inputType="number" />

    <Button
        android:id="@+id/add_btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Add Numbers"
        android:layout_marginTop="10dp" />

    <TextView
        android:id="@+id/result_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Result will appear here"
        android:textSize="18sp"
        android:paddingTop="10dp" />
</LinearLayout>
```
## Output:
<img width="1920" height="1080" alt="Screenshot (15)" src="https://github.com/user-attachments/assets/621b1a76-3653-4047-87c9-9ea4c8049bc0" />

## Result:
The Android application was successfully developed to accept two numbers from the user, perform their addition, and display the result on the screen.
