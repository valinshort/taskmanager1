package com.company;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;


public class Library {


    private Menu menu;

    private List<Game> gamelibrary = new ArrayList<Game>();
    private List<Game> completedTasks = new ArrayList<Game>();
    Scanner input = new Scanner(System.in);

    public Library() {

        menu = new Menu(this);


    }


    protected void addGame(Game game) {
        gamelibrary.add(game);


    }


    protected void removeGame(int gameIndex) {
        gameIndex--;
        gamelibrary.remove(gameIndex);
        System.out.println("This task has been removed from your task manager");
        menu.startMenu();
    }


    protected void completeTask(int gameIndex) {
        gameIndex--;
        Game remove = gamelibrary.get(gameIndex);
        completedTasks.add(remove);
        gamelibrary.remove(gameIndex);

        System.out.println("this task has been completed");
        menu.startMenu();
        //System.out.println(remove);
    }

    public Library(List<Game> completedTasks) {
        this.completedTasks = completedTasks;
    }

    public List<Game> getCompletedTasks() {

        return completedTasks;
    }

    public void setCompletedTasks(List<Game> completedTasks) {
        this.completedTasks = completedTasks;
    }

    public List<Game> getGamelibrary() {
        return gamelibrary;

    }


    protected void checkInGame(int gameIndex) {

        gameIndex += gameIndex;
        gamelibrary.remove(gameIndex);
        Game game = gamelibrary.get(gameIndex);


    }


    public void startMenu() {
        menu.startMenu();
    }




    public void editTask(int gameIndex) {
        gameIndex--;
        Game game = gamelibrary.get(gameIndex);
      //  System.out.println(game.getTitle());
        System.out.println("what is the name of the new task");


        game.setTitle(input.nextLine());
        gamelibrary.add(game);
        gamelibrary.remove(gameIndex);
    }
    }














