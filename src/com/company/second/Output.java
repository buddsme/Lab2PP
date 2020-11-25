package com.company.second;

import java.util.ArrayList;
import java.util.Scanner;

public class Output {
    private int timeLimit;
    private int lowerLimit;
    private int upperLimit;

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    static void showByCityTalkTime(ArrayList<Phone> Users, int time){
        if(time <= 0){
            System.out.println("Wrong time was entered...");
            return;
        }

        System.out.println("Users with city talk time more than " + time);
        for (Phone user : Users) {
            if (user.getCityTalkTime() > time) {
                System.out.println(user);
            }
        }
    }


    static void useLongDistanceCalls(ArrayList<Phone> Users){
        System.out.println("Users who had used long distance calls:");
        int count = 0;
        for (Phone user : Users) {
            if (user.getLongDistanceTalkTime() != 0) {
                System.out.println(user);
                count = count + 1;
            }
        }
        if(count == 0){
            System.out.println("Nobody had used long distance calls...");
        }
    }

    static void accNumbersIsInRange(ArrayList<Phone> Users, int lower, int upper, Scanner in){
        if(lower > upper){
            System.out.println("You entered wrong limits. Do you want to swap it?");
            System.out.println("1 - yes, 0 - no");
            int choose = in.nextInt();
            switch (choose){
                case 0:
                    System.out.println("Sorry, I can't do your task...");
                    return;
                case 1:
                    int tmp = upper;
                    upper = lower;
                    lower = tmp;
                    break;
                default:
                    System.out.println("Exception...");
            }

        }
        System.out.println("Users whose account number is in specified range:");
        for (Phone user : Users) {
            if ((user.getAccountNumber() <= upper) && (user.getAccountNumber() >= lower)) {
                System.out.println(user);
            }
        }
    }

    static void showAll(ArrayList<Phone> Users) {
        System.out.println("All records:");
        for (Phone user : Users) {
            System.out.println(user);
        }
    }
}
