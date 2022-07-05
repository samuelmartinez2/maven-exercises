

import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeupCryptTest.version, 0);
        CodeupCryptTest.version = 1.2;
        assertEquals(1.2, CodeupCryptTest.version, 0);
    }

    @Test
    public void testHashPassword(){
        assertEquals("C0d39p", CodeupCryptTest.hashPassword("Codeup"));
        assertEquals("F3r", CodeupCryptTest.hashPassword("Fer"));
        assertEquals("123", CodeupCryptTest.hashPassword("123"));
        assertEquals("124", CodeupCryptTest.hashPassword("12a"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue("check password", CodeupCryptTest.checkPassword("fer", "f3r"));
        assertFalse("check password", CodeupCryptTest.checkPassword("fer", "fer"));
    }

}