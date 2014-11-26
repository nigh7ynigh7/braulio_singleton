/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba.braulio_singleton;

/**
 *
 * @author Administrator
 */
public class Singleton {
    private static Singleton instance;
    
    private Singleton()
    {
        
    }
    
    private static Singleton getinstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
