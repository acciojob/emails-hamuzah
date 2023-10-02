package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

        if(oldPassword.equals(password)){
            if(isvalid(newPassword)){
                System.out.println("Password changed successfully!");
                this.password = newPassword;
            }else{
                System.out.println("The new Password is not valid!");
            }
        }else{
            System.out.println("The given password does not match current password!");
        }

    }

    private boolean isvalid(String newPassword){
        boolean upp = false;
        boolean low = false;
        boolean digit = false;
        boolean special = false;

        if(newPassword.length() < 8) return false;
        for(int i=0; i<newPassword.length(); i++){
            char var = newPassword.charAt(i);
            if (var >= 'A' && var <='Z'){
                upp = true;
            }else if(var >= 'a' && var <= 'z'){
                low = true;
            }else if(var >= 0 && var <= 9){
                digit = true;
            }else {
                special = true;
            }
        }
        if (upp && low && digit && special){
            return true;
        }
        return false;
    }

}
