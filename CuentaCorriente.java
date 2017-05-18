/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herenciaypolimorfismo;

public class CuentaCorriente extends CuentaBancaria {

    @Override
    double getinteresDeposito() {
        return 0.02;
    }
    
    /*@Override
    public void deposito(double deposito){
        double interes=0;
        if(deposito<1000)
            interes=deposito*0.01;
        
        this.Saldo=this.Saldo+deposito+interes;    
    }*/
    
}

