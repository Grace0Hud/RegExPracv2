import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest
{
    //const tests
    @Test
    void constrToString()
    {
        Contact contact = new Contact("Harry", "Potter", "(951)453-2344",
                "(951)546-2344", "potter@hogwarts.com", "25445 Cool Address Dr", "Cool scar");
        String expected = "NAME: Harry Potter\nHOME NUMBER: (951)453-2344" +
                "\nMOBILE NUMBER: (951)546-2344\nEMAIL: potter@hogwarts.com\nADDRESS: 25445 Cool Address Dr\nNOTES: Cool scar" +
                "\n-------------------------------";
        assertEquals(expected, contact.toString());
    }
    @Test
    void invalidConstr()
    {
        Contact contact = new Contact("harry", "potter", "(951453-2344",
                "(51)546-2344", "potterhogwarts.com", "2544 Cool Address Dr", "012345678901234567890123456789012345678901234567890123456789");
        String expected = "NAME: invalid input invalid input\nHOME NUMBER: invalid input" +
                "\nMOBILE NUMBER: invalid input\nEMAIL: invalid input\nADDRESS: invalid input\nNOTES: 01234567890123456789012345678901234567890123456789" +
                "\n-------------------------------";
        assertEquals(expected, contact.toString());
    }
    @Test
    void constrInvalidFirstName()
    {
        Contact contact = new Contact("arry", "Potter", "(951)453-2344",
                "(951)546-2344", "potter@hogwarts.com", "25445 Cool Address Dr", "cool scar");
        String expected = "NAME: invalid input Potter\nHOME NUMBER: (951)453-2344" +
                "\nMOBILE NUMBER: (951)546-2344\nEMAIL: potter@hogwarts.com\nADDRESS: 25445 Cool Address Dr\nNOTES: cool scar" +
                "\n-------------------------------";
        assertEquals(expected, contact.toString());
    }
    @Test
    void defaultConst()
    {
        Contact contact = new Contact();
        String expected = "NAME:  \nHOME NUMBER: " +
                "\nMOBILE NUMBER: \nEMAIL: \nADDRESS: \nNOTES: " +
                "\n-------------------------------";
        assertEquals(expected, contact.toString());
    }
    //notes
    @Test
    void notesGetNSet()
    {
        Contact contact = new Contact();
        contact.setNotes("cool scar");
        String expected = "cool scar";
        assertEquals(expected, contact.getNotes());
    }
    @Test
    void notesToLong()
    {
        Contact contact = new Contact();
        contact.setNotes("012345678901234567890123456789012345678901234567890123456789");
        String expected = "01234567890123456789012345678901234567890123456789";
        assertEquals(expected, contact.getNotes());
    }
    @Test
    void notesLength50()
    {
        Contact contact = new Contact();
        contact.setNotes("01234567890123456789012345678901234567890123456789");
        String expected = "01234567890123456789012345678901234567890123456789";
        assertEquals(expected, contact.getNotes());
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
    void homeNumberWrongLength()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("(921)321-232464");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void homeNumberWrongLengthBeforeHyphen()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("(921)3215465-2324");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void homeNumberNoParenth()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("921321-2324");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void homeNumberNoHyphen()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("(921)3212324");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void homeNumberJustNums()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("9213212324");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void homeNumberLetters()
    {
        Contact contact = new Contact();
        contact.setHomeNumber("nine");
        String expected = "invalid input";
        assertEquals(expected, contact.getHomeNumber());
    }
    @Test
    void homeNumberOtherSymbols()
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
    @Test
    void mobileNumberWrongLength()
    {
        Contact contact = new Contact();
        contact.setMobileNumber("(921)321-232464");
        String expected = "invalid input";
        assertEquals(expected, contact.getMobileNumber());
    }
    @Test
    void mobileNumberWrongLengthBeforeHyphen()
    {
        Contact contact = new Contact();
        contact.setMobileNumber("(921)3215465-2324");
        String expected = "invalid input";
        assertEquals(expected, contact.getMobileNumber());
    }
    @Test
    void mobileNumberNoParenth()
    {
        Contact contact = new Contact();
        contact.setMobileNumber("921321-2324");
        String expected = "invalid input";
        assertEquals(expected, contact.getMobileNumber());
    }
    @Test
    void mobileNumberNoHyphen()
    {
        Contact contact = new Contact();
        contact.setMobileNumber("(921)3212324");
        String expected = "invalid input";
        assertEquals(expected, contact.getMobileNumber());
    }
    @Test
    void mobileNumberJustNums()
    {
        Contact contact = new Contact();
        contact.setMobileNumber("9213212324");
        String expected = "invalid input";
        assertEquals(expected, contact.getMobileNumber());
    }
    @Test
    void mobileNumberLetters()
    {
        Contact contact = new Contact();
        contact.setMobileNumber("nine");
        String expected = "invalid input";
        assertEquals(expected, contact.getMobileNumber());
    }
    @Test
    void mobileNumberOtherSymbols()
    {
        Contact contact = new Contact();
        contact.setMobileNumber("@951)234-2344");
        String expected = "invalid input";
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
    @Test
    void emailNoAt()
    {
        Contact contact = new Contact();
        contact.setEmail("djslajkldfaj.com");
        String expected = "invalid input";
        assertEquals(expected, contact.getEmail());
    }
    @Test
    void emailNoDot()
    {
        Contact contact = new Contact();
        contact.setEmail("djsla@jkldfajcom");
        String expected = "invalid input";
        assertEquals(expected, contact.getEmail());
    }
    @Test
    void emailNotValidDot()
    {
        Contact contact = new Contact();
        contact.setEmail("djsla@jkldfaj.djk");
        String expected = "invalid input";
        assertEquals(expected, contact.getEmail());
    }
    @Test
    void emailLettersAndNums()
    {
        Contact contact = new Contact();
        contact.setEmail("potter3@jkldfaj.com");
        String expected = "potter3@jkldfaj.com";
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
    @Test
    void addressFirst5Nums()
    {
        Contact contact = new Contact();
        contact.setAddress("hjkkl Cool Adress Dr");
        String expected = "invalid input";
        assertEquals(expected, contact.getAddress());
    }

    @Test
    void addressNumsInStName()
    {
        Contact contact = new Contact();
        contact.setAddress("25648 Co0l Adress Dr");
        String expected = "invalid input";
        assertEquals(expected, contact.getAddress());
    }

    @Test
    void addressNoStreet()
    {
        Contact contact = new Contact();
        contact.setAddress("45648");
        String expected = "invalid input";
        assertEquals(expected, contact.getAddress());
    }

    @Test
    void addressSymbols()
    {
        Contact contact = new Contact();
        contact.setAddress("21548 Cool Adre$$ Dr");
        String expected = "invalid input";
        assertEquals(expected, contact.getAddress());
    }

    @Test
    void addressNotEnoughNums()
    {
        Contact contact = new Contact();
        contact.setAddress("25 Cool Adress Dr");
        String expected = "invalid input";
        assertEquals(expected, contact.getAddress());
    }


}