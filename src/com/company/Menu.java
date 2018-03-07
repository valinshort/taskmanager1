package com.company;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.InputMismatchException;


// Valin Short


public class Menu {
    private final Library library;


    // Menu to prompt user for task options
    private Scanner input = new Scanner(System.in);
    protected Scanner title = new Scanner(System.in);

    Scanner scan = new Scanner(System.in);
    Scanner date2 = new Scanner(System.in);
    Scanner date3 = new Scanner(System.in);
    Scanner date4 = new Scanner(System.in);
    Scanner newInput = new Scanner(System.in);


    public Menu(Library library) {
        this.library = library;
    }

    public void startMenu() {


        System.out.println(" Welcome to the task manager what would you like to do ?  \n" +
                "1.add a task\n" +
                "2.delete a task\n" +
                "3.view a task\n" +
                "4.edit a task\n" +
                "5.Ccomplete a task\n" +
                "6.View the uncompleted tasks\n" +
                "7.View the completed tasks\n" +
                "8.Exit the program");

        try {
            switch (input.nextInt()) {
                case 1:
                    // add a task
                    System.out.println("you have chosen to add a task, what task would you like to add?");
                    input.nextLine();
                    Game game1 = new Game(input.nextLine());
                    System.out.println("You are adding the task of " + game1.getTitle() + " to your task manager , when do you want to have this task done by? " +
                            "pick the year, day, then month" + " YYYY/MM/DD ");

                    LocalDate date1 = LocalDate.of(date2.nextInt(), date3.nextInt(), date4.nextInt());

                    System.out.println(date1 + " is the duedate for the task " + game1.getTitle());


                    library.addGame(game1);

                    library.startMenu();
                    break;


                case 2:
                    // remove the task
                    System.out.println("you've chosen to delete a task\n here is a list of tasks you can delete\n pick the number of the task !");
                    for (Game game : library.getGamelibrary()) {
                        System.out.println(game.getTitle());
                    }
                    library.removeGame(input.nextInt());

                    break;


                case 3:
                    //view the library
                    System.out.println("you have chosen to view a task \n here is the list of your tasks");
                    for (Game game : library.getGamelibrary()) {
                        System.out.println((game.getTitle()));


                    }
                    library.startMenu();
                    break;


                case 4:

                    System.out.println("you have chosen to edit a task");
                    System.out.println("here are the tasks you can edit");


                    for (Game game : library.getGamelibrary()) {

                        System.out.println(game.getTitle());


                    }
                    System.out.println("pick the number of the task you want to edit");

                    library.editTask(input.nextInt());
                    library.startMenu();
                    break;


                case 5:

                    System.out.println("You want to complete a task select the number of the task you want to complete.\n here are the list of yur tasks that you can complete ");
                    for (Game game : library.getGamelibrary()) {
                        System.out.println(game.getTitle());


                    }
                    library.completeTask(input.nextInt());

                {


                }

                library.startMenu();

                break;


                case 6:

                    System.out.println("here are  the uncompleted tasks");
                    for (Game game : library.getGamelibrary()) {
                        System.out.println(game.getTitle());

                    }
                    library.startMenu();
                    break;


                case 7:

                    System.out.println("here are  the completed tasks");
                    for (Game game : library.getCompletedTasks()) {
                        System.out.println(game.getTitle());

                    }
                    library.startMenu();
                    break;


                case 8:
                    // exiting program
                    System.out.println("you have exited the program");
                    System.exit(0);
                    // library.startMenu();

                    break;
                default:

                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please select a number that is 1 through 7 \n or If you are working with the date enter a number that correspondes correctly with the date");

            startMenu(); //calls upon the start Menu method to run again after in the try catch.


        }

    }
}
