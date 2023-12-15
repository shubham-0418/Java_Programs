package com.exceptionHandling;

import java.util.Scanner;

class InvalidUsernamePassException extends Exception
{
    public InvalidUsernamePassException(String s)

    {
        super(s);
    }
}
class User
{
    private String username;

    private String password;

    public User(String username, String password)

    {
        super();

        this.username = username;

        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
 this.password = password;
    }
    @Override
    public String toString()
    {
        return "User [username=" + username + ", password=" + password + "]";
    }
}
public class DriverUsernameAndPassword {
    public static void main(String[] args) throws InvalidUsernamePassException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username :");
        String username = sc.next();
        boolean tempUsename = false;
        boolean tempPass = false;
        try {
            if (!((username.length() >= 6 && username.length() <= 30) && (username.matches(".*[_].*"))
                    && (username.matches(".*[a-z].*")) && (username.matches(".*[A-z].*"))
                    && (username.matches(".*[0-9].*")))) {
                throw new InvalidUsernamePassException("Invalid username.");
            }
            else
            {
                tempUsename=true;
            }
        }
        catch (InvalidUsernamePassException e)
        {
            System.out.println(e);
        }
        System.out.println("Enter the password :");
        String password = sc.next();
        try
        {
            if (!((password.length() >= 8) && (password.matches(".*[!@#$%^&*].*"))
                    && (password.matches(".*[a-z].*")) && (password.matches(".*[A-z].*"))
                    && (password.matches(".*[0-9].*")))) {
                throw new InvalidUsernamePassException("Invalid password.");
            }else {
                tempPass=true;
            }
        } catch (InvalidUsernamePassException e) {
            System.out.println(e);
        }
        if(tempUsename && tempPass) {
            System.out.println("Welcome to the world of Exceptions bro !!!");
        }
        User u = new User(username, password);
    }
}