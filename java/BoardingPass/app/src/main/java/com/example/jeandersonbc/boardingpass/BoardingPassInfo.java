package com.example.jeandersonbc.boardingpass;

import java.sql.Timestamp;

public class BoardingPassInfo {

    public String passengerName;
    public String flightCode;
    public String originCode;
    public String destinyCode;

    public String terminalNumber;
    public String departureGate;
    public String seatNumber;

    public Timestamp boardingTime;
    public Timestamp arrivalTime;
    public Timestamp departureTime;

    public static BoardingPassInfo newFakeData() {
        BoardingPassInfo info = new BoardingPassInfo();
        info.passengerName = "Mr. Les Paul";
        info.flightCode = "JCM 800";
        info.originCode = "IBZ";
        info.destinyCode = "GIB";

        info.boardingTime = Timestamp.valueOf("2018-03-10 21:30:00");
        info.arrivalTime = Timestamp.valueOf("2018-03-10 23:40:00");
        info.departureTime = Timestamp.valueOf("2018-03-11 22:00:00");

        info.departureGate = "58B";
        info.terminalNumber = "2";
        info.seatNumber = "11A";

        return info;
    }
}
