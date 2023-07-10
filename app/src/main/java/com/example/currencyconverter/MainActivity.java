package com.example.currencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText amountEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        amountEditText = findViewById(R.id.amountEditText);
        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Perform conversion when the convertButton is clicked
                convertCurrency();
            }
        });
    }

    private void convertCurrency() {
        // Get the amount entered by the user
        String amountString = amountEditText.getText().toString();
        double amount = Double.parseDouble(amountString);

        // Conversion rate from USD to EUR
        double conversionRate = 0.85;

        // Perform the currency conversion
        double convertedAmount = amount * conversionRate;

        // Display the converted amount
        resultTextView.setText(String.format("%.2f EUR", convertedAmount));
    }
}