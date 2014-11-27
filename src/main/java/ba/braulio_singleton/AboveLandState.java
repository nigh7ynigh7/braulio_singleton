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
public class AboveLandState implements StatePlayerMode{

    @Override
    public void walking() {
        System.out.println("Andando");
    }

    @Override
    public void running() {
        System.out.println("Correndo");
    }

    @Override
    public boolean isCorrectDecision(boolean b) {
        if(b)
        {
            return false;
        }
        return true;
    }
    
}
