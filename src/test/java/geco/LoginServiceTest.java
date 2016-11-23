package geco;

/**
 * Created by 21506354 on 22/11/2016.
 */
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static junit.framework.TestCase.*;

public class LoginServiceTest  {
    private String []test = new String[3];

    private LoginService aTester;
    private List<String> liste;

    @Before
    public void setup(){
        test[0] ="login";
        test[1] ="alogin";
        test[2] ="blogin";
        liste = new ArrayList<String>();
        aTester = new LoginService(test);
    }

    @Test
    public void testLoginExists() throws NullPointerException {


        assertTrue(aTester.loginExists("login"));
    }

    @Test
    public void testAddLogin() throws NullPointerException {
       aTester.addLogin("newLog");
       assertTrue(aTester.loginExists("newLog"));

    }

    @Test
    public void testfindAllLoginsStartingWith() throws NullPointerException {
        ArrayList<String> res = new ArrayList<String>();
        res.add("alogin");
        assertEquals(aTester.findAllLoginsStartingWith("4"), liste);
        assertEquals(aTester.findAllLoginsStartingWith("a"), res);
    }

    @Test
    public void testFindAllLogins()throws NullPointerException{
    ArrayList<String> alllogin = new ArrayList<String>();
        alllogin.add("alogin");
        alllogin.add("blogin");
        alllogin.add("login");
        assertEquals(aTester.findAllLogins(), alllogin);
    }
}
