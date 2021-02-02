public class Driver
{
    public static void main(String[] args)
    {
        Contact potter = new Contact("Harry", "Potter", "(808)452-8456", "misc@hogwarts.net");
        System.out.println(potter.toString());

        /*
        //testing first name validation
        System.out.println("Tried setting FIRST NAME to: ");
        System.out.println("\"ginny\"");
        potter.setFirstName("ginny");
        System.out.println("\"G\"");
        potter.setFirstName("G");
        System.out.println("\"123456\"");
        potter.setFirstName("123456");
        System.out.println("FIRST NAME set to: " + potter.getFirstName());
        System.out.println("------------------------------");

         */

        /*
        //testing last name validation
        System.out.println("Tried setting LAST NAME to: ");
        System.out.println("\"potter\"");
        potter.setLastName("potter");
        System.out.println("\"P\"");
        potter.setLastName("P");
        System.out.println("\"123456\"");
        potter.setLastName("123456");
        System.out.println("LAST NAME set to: " + potter.getLastName());
        System.out.println("------------------------------");

         */

        //testing phone numbers
        System.out.println("Tried setting NUMBER to: ");
        System.out.println("\"9514851718\"");
        potter.setNumber("9514851718");
        System.out.println("\"(951)4851718\"");
        potter.setNumber("(951)4851718");
        System.out.println("\"nine\"");
        potter.setNumber("nine");
        System.out.println("NUMBER set to: " + potter.getNumber());
        System.out.println("------------------------------");
    }//end main
}//end class driver
