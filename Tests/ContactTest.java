import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest
{
    @Test
    void constrToString()
    {
        Contact contact = new Contact("Harry", "Potter", "(951)453-2344",
                "(951)546-2344", "potter@hogwarts.com", "25445 Cool Address Dr");
        String expected = "NAME: Harry Potter\nHOME NUMBER: (951)453-2344" +
                "\nMOBILE NUMBER: (951)546-2344\nEMAIL: potter@hogwarts.com\nADDRESS: 25445 Cool Address Dr" +
                "\n-------------------------------";
        assertEquals(expected, contact.toString());
    }

    @Test
    void defaultConst()
    {
        Contact contact = new Contact();
        String expected = "NAME:  \nHOME NUMBER: " +
                "\nMOBILE NUMBER: \nEMAIL: \nADDRESS: " +
                "\n-------------------------------";
        assertEquals(expected, contact.toString());
    }

    @Test
    void firstNameGetnSet()
    {
        Contact contact = new Contact();
        contact.setFirstName("Cedar");
        String expected = "Cedar";
        assertEquals(expected, contact.getFirstName());
    }

    @Test
    void firstNameLowerCase()
    {
        Contact contact = new Contact();
        contact.setFirstName("cedar");
        String expected = "invalid input";
        assertEquals(expected, contact.getFirstName());
    }

    @Test
    void firstNameNumbers()
    {
        Contact contact = new Contact();
        contact.setFirstName("C23685");
        String expected = "invalid input";
        assertEquals(expected, contact.getFirstName());
    }
    @Test
    void firstNameOneLetter()
    {
        Contact contact = new Contact();
        contact.setFirstName("C");
        String expected = "invalid input";
        assertEquals(expected, contact.getFirstName());
    }

    @Test
    void firstNameCapAfterStart()
    {
        Contact contact = new Contact();
        contact.setFirstName("CeDar");
        String expected = "CeDar";
        assertEquals(expected, contact.getFirstName());
    }
    @Test
    void lastNameGetnSet()
    {
        Contact contact = new Contact();
        contact.setLastName("Cedar");
        String expected = "Cedar";
        assertEquals(expected, contact.getLastName());
    }

    @Test
    void homeNumberGetnSet()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("(921)321-2324");
        String expected = "(921)321-2324";
        assertEquals(expected, contact.getHomeNumber());
    }

    @Test
    void emailGetnSet()
    {
        Contact contact = new Contact();
        contact.setEmail("djsla@jkldfaj.com");
        String expected = "djsla@jkldfaj.com";
        assertEquals(expected, contact.getEmail());
    }

    @Test
    void addressGetnSet()
    {
        Contact contact = new Contact();
        contact.setAddress("52368 Cool Adress Dr");
        String expected = "52368 Cool Adress Dr";
        assertEquals(expected, contact.getAddress());
    }

    @Test
    void mobileNumberGetnSet()
    {
        Contact contact = new Contact();
        contact.setMobileNumber("(921)321-2324");
        String expected = "(921)321-2324";
        assertEquals(expected, contact.getMobileNumber());
    }
}