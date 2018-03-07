package com.company;

import java.time.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Game  {
    protected String title;
    private String dueDate;
    private int date;
    private Scanner input = new Scanner(System.in);



















    public void title() {
    }


    public class title {

    }

    public Game(String title) {
        this.title = title;
        dueDate = "";

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


    //setDate() {

   // }

    // }


    public void setDate() {
        System.out.println("What is the year of the Car you would like to make?");
        try {
            setDate(input.nextInt());
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number for the year.");

            setDate();
        }
    }


    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;

    }


    }

















