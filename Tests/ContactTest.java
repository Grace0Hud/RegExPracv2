import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest
{
    //const tests
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

    //first name tests
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

    //last name tests
    @Test
    void lastNameGetnSet()
    {
        Contact contact = new Contact();
        contact.setLastName("Tree");
        String expected = "Tree";
        assertEquals(expected, contact.getLastName());
    }
    @Test
    void lastNameStartsCap()
    {
        Contact contact = new Contact();
        contact.setLastName("tree");
        String expected = "invalid input";
        assertEquals(expected, contact.getLastName());
    }
    @Test
    void lastNameNoNums()
    {
        Contact contact = new Contact();
        contact.setLastName("T45646546");
        String expected = "invalid input";
        assertEquals(expected, contact.getLastName());
    }
    @Test
    void lastNameHyphen()
    {
        Contact contact = new Contact();
        contact.setLastName("Cool-Tree");
        String expected = "Cool-Tree";
        assertEquals(expected, contact.getLastName());
    }
    @Test
    void lastNameOneLetter()
    {
        Contact contact = new Contact();
        contact.setLastName("T");
        String expected = "invalid input";
        assertEquals(expected, contact.getLastName());
    }
    //number tests
    @Test
    void homeNumberGetnSet()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("(921)321-2324");
        String expected = "(921)321-2324";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void numberWrongLength()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("(921)321-232464");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void numberWrongLengthBeforeHyphen()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("(921)3215465-2324");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void numberNoParenth()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("921321-2324");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void numberNoHyphen()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("(921)3212324");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void numberJustNums()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("9213212324");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void numberLetters()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("nine");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void numberOtherSymbols()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("@951)234-2344");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void mobileNumberGetnSet()
    {
        Contact contact = new Contact();
        contact.setMobileNumber("(921)321-2324");
        String expected = "(921)321-2324";
        assertEquals(expected, contact.getMobileNumber());
    }

    //email tests
    @Test
    void emailGetnSet()
    {
        Contact contact = new Contact();
        contact.setEmail("djsla@jkldfaj.com");
        String expected = "djsla@jkldfaj.com";
        assertEquals(expected, contact.getEmail());
    }

    //address tests
    @Test
    void addressGetnSet()
    {
        Contact contact = new Contact();
        contact.setAddress("52368 Cool Adress Dr");
        String expected = "52368 Cool Adress Dr";
        assertEquals(expected, contact.getAddress());
    }

}