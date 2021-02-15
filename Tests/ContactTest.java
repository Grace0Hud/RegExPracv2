import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest
{
    @Test
    void constrToString()
    {
        Contact contact = new Contact("Harry", "Potter", "(951)453-2344", "potter@hogwarts.com");
        String expected = "NAME: Harry Potter\nNUMBER: (951)453-2344" +
                "\nEMAIL: potter@hogwarts.com\n-------------------------------";
        assertEquals(expected, contact.toString());
    }

    @Test
    void defaultConst()
    {
        Contact contact = new Contact();
        String expected = "NAME:  \nNUMBER: (xxx)xxx-xxxx" +
                "\nEMAIL: xxx@xxxx.com\n-------------------------------";
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
    void lastNameGetnSet()
    {
        Contact contact = new Contact();
        contact.setFirstName("Cedar");
        String expected = "Cedar";
        assertEquals(expected, contact.getFirstName());
    }

    @Test
    void numberGetnSet()
    {
        Contact contact = new Contact();
        contact.setNumber("(921)321-2324");
        String expected = "(921)321-2324";
        assertEquals(expected, contact.getNumber());
    }

    @Test
    void emailGetnSet()
    {
        Contact contact = new Contact();
        contact.setEmail("djsla@jkldfaj.com");
        String expected = "djsla@jkldfaj.com";
        assertEquals(expected, contact.getEmail());
    }
}