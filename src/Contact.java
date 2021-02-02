import java.util.Scanner;

public class Contact
{
    //variables
    private String firstName; //Must be all letter
    private String lastName;
    private String number;//in format (xxx)xxx-xxxx
    private String email;//in format (any amount of chars)@(any amount of chars).com/edu/net
    private final Scanner scan = new Scanner(System.in);
    //constructor
    public Contact(String firstName, String lastName, String number, String email)
    {
        this.firstName = checkFirstName(firstName);
        this.lastName = checkLastName(lastName);
        this.number = checkNumber(number);
        this.email = checkEmail(email);
    }//end constructor
    //getters/setters

    //getters
    public String getFirstName() { return firstName; }

    public String getLastName() {
        return lastName;
    }

    public String getNumber() { return number; }
    public String getEmail() { return email; }

    //setters


    public void setFirstName(String firstName) {
        this.firstName = checkFirstName(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = checkLastName(lastName);
    }

    public void setNumber(String number) {
        this.number = checkNumber(number);
    }

    public void setEmail(String email) {
        this.email = checkEmail(email);
    }
    //brain methods - validation

    //letters
    private String checkFirstName(String name)
    {
        while(!name.matches("[A-Z][A-Za-z]+"))
        {
            System.out.println("FIRSTNAME: Invalid input, try again");
            name = scan.next();
        }
        return name;
    }
    //letters
    private String checkLastName(String name)
    {
        while(!name.matches("[A-Z]([A-Za-z]|-)+"))
        {
            System.out.println("LASTNAME: Invalid input, try again");
            name = scan.next();
        }
        return name;
    }

    //numbers/special characters
    private String checkNumber(String num)
    {
        while(!num.matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"))
        {
            System.out.println("PHONE NUMBER: Invalid input, try again");
            num = scan.next();
        }
        return num;
    }//end checkNumber

    //letters/special characters
    private String checkEmail(String email)
    {
        while(!email.matches("[A-Za-z0-9]+@[a-z]+\\.(com|net|edu)"))
        {
            System.out.println("EMAIL: Invalid input, try again");
            email = scan.next();
        }
        return email;
    }//end checkEmail

    //tostring
    public String toString()
    {
        String output;
        output  = "NAME: " + firstName + " " + lastName;
        output += "\nNUMBER: " + number;
        output += "\nEMAIL: " + email;
        output += "\n-------------------------------";
        return output;
    }//end toString
}//end contacts class
