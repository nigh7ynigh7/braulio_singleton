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
public class SingletonPlayerTest {
    private SingletonPlayer single;
    public SingletonPlayerTest() {
    }
    
    @Test
    public void testSingletonMethodIfSingletonNull() {
        SingletonPlayer esperado = SingletonPlayer.getinstance();
        assertEquals(esperado, SingletonPlayer.getinstance());
    }
    
    @Test
    public void testSingletonMethodIfNotNull()
    {
        single = SingletonPlayer.getinstance();
        assertEquals(single, SingletonPlayer.getinstance());
    }
    
    
    @Test
    public void testDecisionifTrue() {
        SingletonPlayer s = SingletonPlayer.getinstance();
        boolean expected = s.choose(true);
        assertFalse(expected);
    }
    
    @Test
    public void testDecisionifFalse() {
        SingletonPlayer s = SingletonPlayer.getinstance();
        boolean expected = s.choose(false);
        assertTrue(expected);
    }
    
    @Test
    public void testGetSetPMS()
    {
        single = SingletonPlayer.getinstance();
        StatePlayerMode spm = new AboveLandState();
        single.setPsm(spm);
        assertSame(spm, single.getPsm());
    }
    
    @Test
    public void testGetSetSW()
    {
        single = SingletonPlayer.getinstance();
        ISwingWeapon spm = new UltraHyperSwing();
        single.setSw(spm);
        assertSame(spm, single.getSw());
    }
    
}
