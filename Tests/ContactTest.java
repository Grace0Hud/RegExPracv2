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


}