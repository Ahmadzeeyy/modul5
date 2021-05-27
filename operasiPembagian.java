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
class operasiPembagian extends operasiPenjumlahan{

    @Override
    protected void tampil(){
        this.c = a/b;
        System.out.println("|============== pembagian ==============|");
        System.out.println("|    hasil pembagian "+this.a+" / "+this.b+" = "+this.c+"   |");
        System.out.println("|=======================================|");
    }
}
