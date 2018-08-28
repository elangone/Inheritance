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
public class pembeli {
    private String id, no, nama, alamat;
    
    public pembeli(String id, String no, String nama, String alamat){
        this.id = id;
        this.no = no;
        this.nama = nama;
        this.alamat = alamat;    
}
    //method
    public void ket(){
    System.out.println("DATA TRANSAKSI ANDA");
    System.out.println("=====================================================");
    System.out.println("ID Pembeli  = "+this.id);
    System.out.println("Nama        = "+this.nama);
    System.out.println("Alamat      = "+this.alamat);
    System.out.println("No Telpon   = "+this.no);
}
}
