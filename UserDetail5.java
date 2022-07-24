public class UserDetail5 {


    public static void main(String[] args) {
        UserDetail5 userDetail = new UserDetail5();
        System.out.println(userDetail.checkFName("Mohit"));
        System.out.println(userDetail.checkLName("Raj"));
        System.out.println(userDetail.checkEmail("rajmohit.129@gmail.com"));
        System.out.println(userDetail.checkMobileNumber("91 8083373213"));
        System.out.println(userDetail.checkPassword("Sanidev888@"));

    }

    //  This method is used to validate the First Name
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    //  This method is used to validate Last Name
    public boolean checkLName(String lastName) {
        return (lastName.matches("[A-Z][a-z]{3,}"));
    }

    //  This method is used to validate email Id
    public boolean checkEmail(String email) {
        return (email.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }

    //This method is used to validate Mobile Number
    public boolean checkMobileNumber(String mobileNumber){
        return (mobileNumber.matches("^[0-9]{1,2}[ ][0-9]{10}$"));
    }

    //this method is used to validate password
    public boolean checkPassword(String password) {
        return (password.matches("[0-9a-zA-Z]{8,}"));
    }
}

