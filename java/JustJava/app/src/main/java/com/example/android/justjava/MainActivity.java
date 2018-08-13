package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        int quantity = getCurrentQuantity();
        displayPrice(quantity * 5);
    }

    public void increment(View view) {
        int quantity = getCurrentQuantity();
        displayQuantity(quantity + 1);
    }

    public void decrement(View view) {
        int quantity = getCurrentQuantity();
        if (quantity > 0) {
            displayQuantity(quantity - 1);
        }
    }

    private int getCurrentQuantity() {
        TextView textViewQuantity = findViewById(R.id.tv_quantity);
        return Integer.parseInt(textViewQuantity.getText().toString());
    }

    private void displayQuantity(int value) {
        TextView textViewQuantity = findViewById(R.id.tv_quantity);
        textViewQuantity.setText(String.valueOf(value));
    }

    private void displayPrice(int value) {
        TextView priceTextView = findViewById(R.id.tv_price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(value));
    }

}
