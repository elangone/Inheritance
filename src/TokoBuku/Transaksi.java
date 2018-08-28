/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBuku;

/**
 *
 * @author Taka
 */
public class Transaksi 
{
    private String kasir, tgl, tot;
    
    //method kasir
    public void setKasir (String namka){
        kasir = namka;
    }
    public String getKasir()
    {
        return kasir;
    }
    //method tanggal
    public void setTgl (String tanggal){
        tgl = tanggal;
    }
    public String getTgl(){
        return tgl;
    }
    //method total
    public void setTotal (String total){
        tot = total;
    }
    public String getTotal(){
        return tot;
    }

public void namaKasir(){
    System.out.println("Nama Kasir    = "+getKasir());
}
public void tglTran(){
    System.out.println("Tgl Transaksi = "+getTgl());
     System.out.println("=====================================================");
}
public void TotalTran(){
    System.out.println("Total Harga   = "+getTotal());
    
}
    
    public static void main(String[] args) {
        barang elang = new barang("W54JD","Elang","Blitar","082131265447","23F","The Beast","Buku","Rp. 50.000");
        elang.ket();
        
        Transaksi kasir = new Transaksi();
        kasir.setKasir("Rakha");
        kasir.setTgl("12/12/2018");
        kasir.setTotal("Rp. 50.0000");
        kasir.TotalTran();
        kasir.namaKasir();
        kasir.tglTran();
    }
}
