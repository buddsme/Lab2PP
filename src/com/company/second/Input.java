package com.company.second;

import java.util.Scanner;

public class Input {

    static Phone input(Scanner in){
        System.out.println("id: ");
        int id = in.nextInt();in.nextLine();
        System.out.println("Surname: ");
        String surname = in.nextLine();
        System.out.println("Name: ");
        String name = in.nextLine();
        System.out.println("Middle name: ");
        String middleName = in.nextLine();
        System.out.println("Account number: ");
        int accountNumber = in.nextInt();
        System.out.println("City talk time (minutes): ");
        int cityTalkTime = in.nextInt();
        System.out.println("Long distance talk time (minutes): ");
        int longDistanceTalkTime = in.nextInt();

        return new Phone(id, surname, name, middleName, accountNumber, cityTalkTime, longDistanceTalkTime);
    }
}
