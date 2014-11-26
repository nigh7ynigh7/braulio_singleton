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
public class SingletonTest {
    private Singleton single;
    public SingletonTest() {
    }
    
    @Test
    public void testSingletonMethodIfSingletonNull() {
        Singleton esperado = Singleton.getinstance();
        assertEquals(esperado, Singleton.getinstance());
    }
    
    @Test
    public void testSingletonMethodIfNotNull()
    {
        single = Singleton.getinstance();
        assertEquals(single, Singleton.getinstance());
    }
    
}
