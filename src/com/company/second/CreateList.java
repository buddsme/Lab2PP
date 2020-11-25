package com.company.second;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateList {
    static ArrayList<Phone> createList(Scanner in){
        ArrayList<Phone> Users= new ArrayList<>();
        int exit = 1;
        while(exit != 0){
            Phone tmp = Input.input(in);
            Users.add(tmp);

            System.out.println("Enter 0 to exit...");
            exit = in.nextInt();
        }
        return Users;
    }
}
