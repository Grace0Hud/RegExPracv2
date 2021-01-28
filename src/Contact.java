public class Contact
{
    //variables
    private String name; //Must be all letters
    private String number;//in format (xxx)xxx-xxxx
    private String email;//in format (any amount of chars)@(any amount of chars).com
    //constructor
    public Contact(String name, String number, String email)
    {
        this.name = name;
        this.number = number;
        this.email = email;
    }//end constructor
    //getters/setters

    //brain methods - validation

    //tostring
    public String toString()
    {
        String output;
        output  = "NAME: " + name;
        output += "\nNUMBER: " + number;
        output += "\nEMAIL: " + email;
        output += "\n-------------------------------";
        return output;
    }//end toString
}//end contacts class
