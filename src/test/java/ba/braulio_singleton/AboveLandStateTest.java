/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba.braulio_singleton;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Administrator
 */
public class AboveLandStateTest {
    AboveLandState als;
    @Before
    public void initialize()
    {
        als = new AboveLandState();
    }

    @Test
    public void testDecisionifTrue() {
        boolean expected = als.isCorrectDecision(true);
        assertFalse(expected);
    }
    
    @Test
    public void testDecisionifFalse() {
        boolean expected = als.isCorrectDecision(false);
        assertTrue(expected);
    }
    
    
}
