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
public class SingletonPlayer {
    private static SingletonPlayer instance;
    private StatePlayerMode psm;
    private SingletonPlayer()
    {
        psm = new AboveLandState();
    }
    
    public static SingletonPlayer getinstance()
    {
        if(instance == null)
        {
            instance = new SingletonPlayer();
        }
        return instance;
    }
    
    public void run()
    {
        psm.running();
    }
    
    public void walk()
    {
        psm.walking();
    }
    
    public boolean choose(boolean b)
    {
        return psm.isCorrectDecision(b);
    }
}
