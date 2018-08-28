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
public class barang extends pembeli{
    public String idbar, barang, harga, merk;
    
    public barang(String id, String nama, String alamat, String no, String idbar, String barang, String merk, String harga){
        super(id, no, nama, alamat);
        this.idbar = idbar;
        this.barang = barang;
        this.harga = harga;
        this.merk = merk;
    }
    
    //override
    public void ket(){
        super.ket();
            System.out.println("ID Barang   = "+this.idbar);
            System.out.println("Nama Barang = "+this.barang);
            System.out.println("Merk        = "+this.merk);
            System.out.println("Harga       = "+this.harga);
            System.out.println("==============================");
    }
}
