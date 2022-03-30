package com.bridgelabz.main;

import java.util.regex.Pattern;


public class UserRegistration {

    private static final Pattern FIRST_NAME_PATTERN = Pattern.compile("[A-Z]{1}[a-z]{2,}");
    private static final Pattern LAST_NAME_PATTERN = Pattern.compile("[A-Z]{1}[a-z]{2,}");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-z]{1}([.]{0,1}[a-zA-z0-9+-]{1,}){0,}[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-z]{2,3}([.]{1}[a-z]{2}){0,1}");
    private static final Pattern MOBILE_NUMBER_PATTERN =Pattern.compile("(\\d{1,2}[\\s]?)?(\\d?)\\d{10}");
    private static  final Pattern PASSWORD_PATTERN = Pattern.compile("^([a-zA-Z0-9]{8})$");


    public boolean checkFirstName(String firstName) {
        return FIRST_NAME_PATTERN.matcher(firstName).matches();
    }

    public boolean checkLastName(String lastName) {
        return LAST_NAME_PATTERN.matcher(lastName).matches();
    }


    public boolean checkEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public boolean checkMobileNumber(String mobileNumber){
        return MOBILE_NUMBER_PATTERN.matcher(mobileNumber).matches();
    }

    public boolean checkPassword(String password){
        return PASSWORD_PATTERN.matcher(password).matches();
    }
}