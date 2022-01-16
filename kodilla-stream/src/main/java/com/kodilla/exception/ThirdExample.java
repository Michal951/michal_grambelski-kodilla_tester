package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
        } catch (AirportNotFoundExepction e) {

        }
        System.out.println("Vienna Status " + isViennaInUse);
        System.out.println("Thank you for using Kodilla Airports");
    }
}