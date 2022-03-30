package com.bridgelabz.main;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistrationSystem user = new UserRegistrationSystem();
        System.out.println(user.userValidFirstName());
        System.out.println(user.userValidLastName());
        System.out.println(user.userValidMailID());
        System.out.println(user.userValidMobileNumber());
        System.out.println(user.userValidPassword());
    }
}