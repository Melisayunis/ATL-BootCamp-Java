/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**

 */
public class PersonajeTest {
    
    public PersonajeTest() {
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
     * Test of getName method, of class Personaje.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Personaje instance = new PersonajeImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Personaje.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Personaje instance = new PersonajeImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLvl method, of class Personaje.
     */
    @Test
    public void testGetLvl() {
        System.out.println("getLvl");
        Personaje instance = new PersonajeImpl();
        int expResult = 0;
        int result = instance.getLvl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLvl method, of class Personaje.
     */
    @Test
    public void testSetLvl() {
        System.out.println("setLvl");
        int level = 0;
        Personaje instance = new PersonajeImpl();
        instance.setLvl(level);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLife method, of class Personaje.
     */
    @Test
    public void testGetLife() {
        System.out.println("getLife");
        Personaje instance = new PersonajeImpl();
        int expResult = 0;
        int result = instance.getLife();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLife method, of class Personaje.
     */
    @Test
    public void testSetLife() {
        System.out.println("setLife");
        int life = 0;
        Personaje instance = new PersonajeImpl();
        instance.setLife(life);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class Personaje.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        Personaje instance = new PersonajeImpl();
        List<Item> expResult = null;
        List<Item> result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItems method, of class Personaje.
     */
    @Test
    public void testSetItems() {
        System.out.println("setItems");
        List<Item> items = null;
        Personaje instance = new PersonajeImpl();
        instance.setItems(items);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeDamage method, of class Personaje.
     */
    @Test
    public void testTakeDamage() {
        System.out.println("takeDamage");
        int dmg = 0;
        Personaje instance = new PersonajeImpl();
        int expResult = 0;
        int result = instance.takeDamage(dmg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cureMe method, of class Personaje.
     */
    @Test
    public void testCureMe() {
        System.out.println("cureMe");
        int point = 0;
        Personaje instance = new PersonajeImpl();
        int expResult = 0;
        int result = instance.cureMe(point);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlive method, of class Personaje.
     */
    @Test
    public void testIsAlive() {
        System.out.println("isAlive");
        Personaje instance = new PersonajeImpl();
        boolean expResult = false;
        boolean result = instance.isAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of levelUp method, of class Personaje.
     */
    @Test
    public void testLevelUp() {
        System.out.println("levelUp");
        Personaje instance = new PersonajeImpl();
        instance.levelUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseExperience method, of class Personaje.
     */
    @Test
    public void testIncreaseExperience() {
        System.out.println("increaseExperience");
        int point = 0;
        Personaje instance = new PersonajeImpl();
        instance.increaseExperience(point);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDefence method, of class Personaje.
     */
    @Test
    public void testGetTotalDefence() {
        System.out.println("getTotalDefence");
        Personaje instance = new PersonajeImpl();
        int expResult = 0;
        int result = instance.getTotalDefence();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalAttack method, of class Personaje.
     */
    @Test
    public void testGetTotalAttack() {
        System.out.println("getTotalAttack");
        Personaje instance = new PersonajeImpl();
        int expResult = 0;
        int result = instance.getTotalAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonajeImpl extends Personaje {
    }
    
}
