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
    private ISwingWeapon sw;
    private SingletonPlayer()
    {
        psm = new AboveLandState();
        sw = new HyperSwing();
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
    
    public void swing()
    {
        sw.specialSwing();
    }
    
    

    public StatePlayerMode getPsm() {
        return psm;
    }

    public void setPsm(StatePlayerMode psm) {
        this.psm = psm;
    }

    public ISwingWeapon getSw() {
        return sw;
    }

    public void setSw(ISwingWeapon sw) {
        this.sw = sw;
    }
    
    
}
