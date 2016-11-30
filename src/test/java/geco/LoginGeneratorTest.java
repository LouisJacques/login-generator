package geco;

/**
 * Created by 21506354 on 23/11/2016.
 */
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static junit.framework.TestCase.*;
public class LoginGeneratorTest {
    LoginGenerator aTester;
    @Before
    public void setup(){
        aTester = new LoginGenerator(new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"}));
    }

    @Test
    public void testGenerateLoginForNomAndPrenom(){
        assertEquals(aTester.generateLoginForNomAndPrenom("Durand","Paul"), "PDUR");


    }

    @Test
    public void testSuffix(){
        assertEquals(aTester.generateLoginForNomAndPrenom("Ralling","John"), "JRAL2");
    }

    @Test
    public void testNormalize(){
        assertEquals(aTester.generateLoginForNomAndPrenom("Dùrand","Paul"), "PDUR");
    }
    @Test
    public void testNum(){
        assertEquals(aTester.generateLoginForNomAndPrenom("Rowling","Jean"), "JROW");
        assertEquals(aTester.generateLoginForNomAndPrenom("Rowling","Jean"), "JROW1");
    }

    @Test
    public void testGen(){
        assertEquals(aTester.generateLoginForNomAndPrenom("Du","Paul"), "PDU");

    }


}
