import java.util.Scanner;

public class Contact
{
    //variables
    private String firstName; //Must be all letter
    private String lastName;
    private String number;//in format (xxx)xxx-xxxx
    private String email;//in format (any amount of chars)@(any amount of chars).com
    //constructor
    public Contact(String firstName, String lastName, String number, String email)
    {
        this.firstName = checkFirstName(firstName);
        this.lastName = lastName;
        this.number = number;
        this.email = email;
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
        this.lastName = lastName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //brain methods - validation

    private String checkFirstName(String name)
    {
        Scanner scan = new Scanner(System.in);
        while(!name.matches("[A-Z][a-z]+"))
        {
            System.out.println("Invalid input, try again");
            name = scan.next();
        }
        return name;
    }

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
