/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herenciaypolimorfismo;

public class CuentaAhorro extends CuentaBancaria {
   
    private double interes;

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }
    
    /*@Override
    public void deposito(double deposito){
        double interes=0;
        if(deposito<1000)
            interes=deposito*0.02;
        
        this.Saldo=this.Saldo+deposito+interes;    
    }*/

    @Override
    double getinteresDeposito() {
        return 0.01;
    }
    
    
}

