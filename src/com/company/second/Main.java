package com.company.second;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Phone> Users = CreateList.createList(in);

        Output.showAll(Users);
        System.out.println("\n");

        System.out.println("Enter city talk time to find in records:");
        int time = in.nextInt();
        Output.showByCityTalkTime(Users, time);
        System.out.println("\n");

        Output.useLongDistanceCalls(Users);
        System.out.println("\n");

        System.out.println("Enter lower and upper limits of account numbers to find:");
        int lower = in.nextInt();
        int upper = in.nextInt();
        Output.accNumbersIsInRange(Users, lower, upper, in);
    }
}
