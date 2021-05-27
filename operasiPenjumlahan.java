/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modupraktikum5;

/**
 *
 * @author ASUS
 */
class operasiPenjumlahan extends operasiBilangan{
     @Override
    protected void setA(double a){
        this.a = a;
    }
    @Override
    protected void setB(double b){
        this.b = b;
    }
    @Override
    protected void setC(){
        this.c = c;
    }
    @Override
    protected double getA(){
        return a;
    }
    @Override
    protected double getB(){
        return b;
    }
    @Override
    protected double getC(){
        return c;
    }
    @Override
    protected void tampil(){
        this.c = a+b;
        System.out.println("|============= penjumlahan =============|");
        System.out.println("|    hasil penjumlahan "+this.a+" + "+this.b+" = "+this.c+"  |");
    }
}
