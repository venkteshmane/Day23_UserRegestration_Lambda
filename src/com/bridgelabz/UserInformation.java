package com.bridgelabz;
import com.bridgelabz.main.UserValidation;

import java.util.regex.Pattern;

public class UserInformation {

    private static final Pattern FIRST_NAME = Pattern.compile("[A-Z]{1}[a-z]{2,}$");
    private static final Pattern LAST_NAME = Pattern.compile("[A-Z]{1}[a-z]{2,}$");
    private static final Pattern EMAIL_ID = Pattern.compile("^[a-zA-z]{1}([.]{0,1}[a-zA-z0-9+-]{1,}){0,}[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-z]{2,3}([.]{1}[a-z]{2}){0,1}");
//  private static final Pattern EMAIL_ID = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    private static final Pattern MOBILE_NUMBER =Pattern.compile("^[0-9]{1,3}-[0-9]{10}$");
    private static  final Pattern PASSWORD = Pattern.compile("^[a-z](=?.@[A-Z])(=?.@[0-9])(=?.@[*%$#^&-=]).{8,}$");

    public String firstName(String userFirstName) throws UserRegistrationException{
          /* Pattern pattern = Pattern.compile(FIRST_NAME);
            Matcher matcher = pattern.matcher(LAST_NAME);*/
        try {
            Pattern pattern = FIRST_NAME;

            if(userFirstName.isEmpty())
                throw new UserRegistrationException("Enter a Valid First Name", UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME);

            UserValidation validateFirstName = (firstName) -> pattern.matcher(firstName).matches()?  "Happy-Registration Success" : "Sad-Registration Failed";
            return validateFirstName.validate(userFirstName);

        } catch(Exception e) {
            throw new UserRegistrationException("Enter a Valid First Name", UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME);
        }
    }

    public String lastName(String userLastName) throws UserRegistrationException{
        try {
            Pattern pattern = LAST_NAME;

            if(userLastName.isEmpty())
                throw new UserRegistrationException("Enter a Valid Last Name", UserRegistrationException.ExceptionType.INVALID_USER_LAST_NAME);

            UserValidation validateLastName = (lastName) -> pattern.matcher(lastName).matches()? "Happy-Registration Success" : "Sad-Registration Failed";
            return validateLastName.validate(userLastName);

        } catch(Exception e) {
            throw new UserRegistrationException("Enter a Valid Last Name", UserRegistrationException.ExceptionType.INVALID_USER_LAST_NAME);
        }
    }

    public String mailId(String userMailID) throws UserRegistrationException {
        try{
            Pattern pattern = EMAIL_ID;

            if(userMailID.isEmpty())
                throw new UserRegistrationException("Enter a Valid MAIL ID", UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID);

            UserValidation validateMailID = (mailID) -> EMAIL_ID.matcher(mailID).matches()? "Happy-Registration Success" : "Sad-Registration Failed";
            return validateMailID.validate(userMailID);

        } catch(Exception e) {
            throw new UserRegistrationException("Enter a Valid MAIL ID", UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID);
        }
    }

    public String mobileNumber(String userMobileNum) throws UserRegistrationException {
        try {
            Pattern pattern = MOBILE_NUMBER;

            if(userMobileNum.isEmpty())
                throw new UserRegistrationException("Enter a Valid Mobile Number", UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER);

            UserValidation validateMobNum = (mobNum) -> pattern.matcher(mobNum).matches()? "Happy-Registration Success" : "Sad-Registration Failed";
            return validateMobNum.validate(userMobileNum);

        } catch(Exception e) {
            throw new UserRegistrationException("Enter a Valid Mobile Number", UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER);
        }
    }

    public String passWord(String userPassword) throws UserRegistrationException {
        try {
            Pattern pattern = PASSWORD;

            if(userPassword.isEmpty())
                throw new UserRegistrationException("Enter a Valid Password", UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD);

            UserValidation validatePassword = (password) -> PASSWORD.matcher(password).matches()? "Happy-Registration Success" : "Sad-Registration Failed";
            return validatePassword.validate(userPassword);

        } catch(Exception e) {
            throw new UserRegistrationException("Enter a Valid Password", UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD);
        }
    }
}