import java.util.Scanner;

public class Contact
{
    //variables
    private String firstName; //Must be all letter
    private String lastName;
    private String homeNumber;//in format (xxx)xxx-xxxx
    private String mobileNumber;
    private String email;//in format (any amount of chars)@(any amount of chars).com/edu/net
    private String address; //xxxxx (chars)
    private final Scanner scan = new Scanner(System.in);
    //constructor
    public Contact(String firstName, String lastName, String homeNumber, String mobileNumber, String email, String address)
    {
        this.firstName = checkFirstName(firstName);
        this.lastName = checkLastName(lastName);
        this.homeNumber = checkNumber(homeNumber);
        this.mobileNumber = checkNumber(mobileNumber);
        this.email = checkEmail(email);
        this.address = checkAddress(address);
    }//end constructor
    public Contact()
    {
        this. firstName = "";
        this.lastName = "";
        this.homeNumber = "";
        this.mobileNumber = "";
        this.email = "";
        this.address = "";
    }

    //getters/setters

    //getters
    public String getFirstName() { return firstName; }

    public String getLastName() {
        return lastName;
    }

    public String getHomeNumber() { return homeNumber; }
    public String getEmail() { return email; }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
    //setters


    public void setFirstName(String firstName) {
        this.firstName = checkFirstName(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = checkLastName(lastName);
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = checkNumber(homeNumber);
    }

    public void setEmail(String email) {
        this.email = checkEmail(email);
    }

    public void setAddress(String address) {
        this.address = checkAddress(address);
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    //brain methods - validation

    //letters
    private String checkFirstName(String name)
    {
        if(!name.matches("[A-Z][A-Za-z]+"))
        {
            name = "invalid input";
        }
        return name;
    }
    //letters
    private String checkLastName(String name)
    {
        if(!name.matches("[A-Z]([A-Za-z]|-)+"))
        {
           name = "invalid input";
        }
        return name;
    }

    //numbers/special characters
    private String checkNumber(String num)
    {
        if(!num.matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"))
        {
            num = "invalid input";
        }
        return num;
    }//end checkNumber

    //letters/special characters
    private String checkEmail(String email)
    {
        if(!email.matches("[A-Za-z0-9]+@[a-z]+\\.(com|net|edu)"))
        {
            email = "invalid input";
        }
        return email;
    }//end checkEmail

    private String checkAddress(String address)
    {
        if(!address.matches("[0-9]{5}\\s([A-Za-z]|\\s)+"))
        {
            address = "invalid input";
        }
        return address;
    }
    //tostring
    public String toString()
    {
        String output;
        output  = "NAME: " + firstName + " " + lastName;
        output += "\nHOME NUMBER: " + homeNumber;
        output += "\nMOBILE NUMBER: " + mobileNumber;
        output += "\nEMAIL: " + email;
        output += "\nADDRESS: " + address;
        output += "\n-------------------------------";
        return output;
    }//end toString
}//end contacts class
