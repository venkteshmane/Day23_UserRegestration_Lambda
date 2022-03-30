package com.bridgelabz.main;
import com.bridgelabz.UserInformation;
import com.bridgelabz.UserRegistrationException;

import java.util.Scanner;

public class UserRegistrationSystem {

    Scanner sc = new Scanner(System.in);
    UserInformation userValidInfo = new UserInformation();

    public String userValidFirstName() throws UserRegistrationException {
        System.out.println("Enter First Name::");
        String firstName = sc.nextLine();
        return userValidInfo.firstName(firstName);
    }

    public String userValidLastName() throws UserRegistrationException {
        System.out.println("Enter Last Name::");
        String lastName = sc.nextLine();
        return userValidInfo.lastName(lastName);
    }

    public String userValidMailID() throws UserRegistrationException {
        System.out.println("Enter Mail ID::");
        String mailID = sc.nextLine();
        return userValidInfo.mailId(mailID);
    }

    public String userValidMobileNumber() throws UserRegistrationException {
        System.out.println("Enter Mobile Number::");
        String mobileNumber = sc.nextLine();
        return userValidInfo.mobileNumber(mobileNumber);
    }

    public String userValidPassword() throws UserRegistrationException {
        System.out.println("Enter Password::");
        String password = sc.nextLine();
        return userValidInfo.passWord(password);
    }
}