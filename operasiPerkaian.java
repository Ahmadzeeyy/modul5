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
class operasiPerkaian extends operasiPenjumlahan{
    @Override
    protected void tampil(){
        this.c = a-b;
        System.out.println("|============== perkalian ==============|");
System.out.println("|    hasil perkalian "+this.a+" x "+this.b+" = "+this.c+"    |");
    }
}
