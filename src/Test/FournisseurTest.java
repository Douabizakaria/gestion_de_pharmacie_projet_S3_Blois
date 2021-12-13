
package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author HADDOUCH MOHAMMED
 */
public class FournisseurTest {

    public FournisseurTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Fournisseur.
     */
    @Test
    public void Fournisseurliste(){}
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fournisseur.main(args);
        Fournisseurliste();
        fail("The test case is a prototype.");
    }

}
