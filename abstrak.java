package modupraktikum5;
public class abstrak {
    public static void main(String[] args) {
    operasiPenjumlahan op = new operasiPenjumlahan();
    op.setA(6.5);
    op.setB(0.5);
    op.setC();
    op.tampil();
    operasiPengurangan kurang= new operasiPengurangan();
    kurang.setA(6.5);
    kurang.setB(0.5);
    kurang.setC();
    kurang.tampil();
    operasiPerkaian perkalian = new operasiPerkaian();
    perkalian.setA(6.5);
    perkalian.setB(0.5);
    perkalian.setC();
    perkalian.tampil();
    operasiPembagian pembagian= new operasiPembagian();
    pembagian.setA(6.5);
    pembagian.setB(0.5);
    pembagian.setC();
    pembagian.tampil();
    }
    
}
