public class UserRegistration {

    private static String nameFormat = "[A-Z][a-z]{2,}";
    private static String emailFormat = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
    private static String mobileFormat = "^[0-9]{1,2}[ ][0-9]{10}$";
    private static String passwordFormat = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$";

    public String checkFName(String fName) throws invalidDetailExceptions {
        try {
            if(fName.matches(nameFormat)){
                return "Success";
            }
            else {
                throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide valid format");
            }
        }catch (NullPointerException e) {
            throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }
    }

    public String checkLName(String lName) throws invalidDetailExceptions {
        try {
            if(lName.matches(nameFormat)){
                return "Success";
            }
            else {
                throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide valid formate");
            }
        }
        catch (NullPointerException e) {
            throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }

    }

    public String checkEmail(String emailId) throws invalidDetailExceptions {
        try {
            if (emailId.matches(emailFormat)) {
                return "Success";
            }
            else {
                throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide valid email");
            }
        }
        catch (NullPointerException e) {
            throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_NULL, "Don't provide null value");
        }
    }

    public String checkPhoneNumber(String phoneNo) throws invalidDetailExceptions {
        try {
            if(phoneNo.matches(mobileFormat)) {
                return "Success";
            }
            else {
                throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please provide valid phone number");
            }
        }
        catch (NullPointerException e) {
            throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_NULL, "Don't pass null value");
        }
    }
    public String checkPassword(String passcode) throws invalidDetailExceptions {
        try {
            if (passcode.matches(passwordFormat)) {
                return "Success";
            }
            else {
                throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, "Please Provide valid password");
            }
        }
        catch (NullPointerException e)
        {
            throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_NULL, "Don't provide null Value");
        }
    }


    public String moodAnalyse(String fName, String lName, String phoneNumber, String email, String password ) throws invalidDetailExceptions {
        try{
            if(checkFName(fName) == "Success" && checkLName(lName) == "Success" && checkEmail(email) == "Success" && checkPhoneNumber(phoneNumber) == "Success" && checkPassword(password) == "Success"){
                return "HAPPY";
            }
            else {
                return "SAD";
            }
        }
        catch (NullPointerException e)
        {
            throw new invalidDetailExceptions(invalidDetailExceptions.ExceptionType.ENTERED_NULL, "Dont pass null value");
        }

    }

}