package com.example.jeandersonbc.boardingpass;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jeandersonbc.boardingpass.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        BoardingPassInfo fakeData = BoardingPassInfo.newFakeData();
        displayBoardingPassInfo(fakeData);
    }

    private void displayBoardingPassInfo(BoardingPassInfo info) {
        mBinding.textViewPassengerName.setText(info.passengerName);
        mBinding.textViewOriginCode.setText(info.originCode);
        mBinding.textViewDestinyCode.setText(info.destinyCode);
        mBinding.textViewFlightCode.setText(info.flightCode);
        mBinding.textViewSeatNumber.setText(info.seatNumber);
        mBinding.textViewDepartureGate.setText(info.departureGate);
        mBinding.textViewTerminalNumber.setText(info.terminalNumber);

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a", Locale.getDefault());
        String boardingTime = formatter.format(info.boardingTime);
        String departureTime = formatter.format(info.departureTime);
        String arrivalTime = formatter.format(info.arrivalTime);

        mBinding.textViewBoardingTime.setText(boardingTime);
        mBinding.textViewDepartureTime.setText(departureTime);
        mBinding.textViewArrivalTime.setText(arrivalTime);

    }
}
