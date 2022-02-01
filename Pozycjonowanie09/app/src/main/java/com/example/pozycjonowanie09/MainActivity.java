package com.example.pozycjonowanie09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    File file = new File(context.getFilesDir(), filename);

    String filename = "myfile";
    String fileContents = "Hello world!";
    try (FileOutputStream fos = context.openFileOutput(filename, Context.MODE_PRIVATE)) {
        fos.write(fileContents.toByteArray());
    }
    button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // Do something in response to button click
        }
    });
}