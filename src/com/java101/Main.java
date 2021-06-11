package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username = "hdurukan", password = "hd11";
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your username :");
        String enteredUsername = input.next();

        System.out.print("Please enter your password :");
        String enteredPassword = input.next();

        if ((enteredUsername.equals(username)) && (enteredPassword.equals(password))) {
            System.out.print("You successfully log in.");
        } else {
            System.out.print("Your username or password is wrong !\nDo you want to reset your password ? y for yes, n for n :");
            char resetRequested = input.next().charAt(0);
            if (resetRequested == 'y') {
                String newPassword = "";
                while ((password.equals(newPassword)) || newPassword.equals("")) {
                    System.out.print("Please enter your new password :");
                    newPassword = input.next();
                    if (password == newPassword) {
                        System.out.println("Your password can not be the same with previous one!");
                    }
                }
                System.out.print("Your password has been reset.");
            }
        }
    }
}
