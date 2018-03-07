package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Yearr extends Library {
    private Scanner input = new Scanner(System.in);
    private int year;


    // public Yearr() {


    //setYear() {

    //}


    public void setYear() {
        System.out.println("What is the year of the Car you would like to make?");
        try {
           setYear(input.nextInt());
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number for the year.");

            setYear();
        }
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}



























