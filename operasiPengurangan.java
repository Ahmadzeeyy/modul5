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
class operasiPengurangan extends operasiPenjumlahan{
    @Override
    protected void tampil(){
        this.c = a-b;
        System.out.println("|============= pengurangan =============|");
        System.out.println("|    hasil pengurangan "+this.a+" - "+this.b+" = "+this.c+"  |");
    }
}
