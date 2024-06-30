
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dealerakbar;

/**
 *
 * @author D-4
 */
public class MobilBekas implements Kendaraan {
    private final int tahun;
    private final double harga;

    public MobilBekas(String merek, String model, int tahun, double harga){
        super(merek, model);
        this.tahun = tahun;
        this.harga = harga;
   }

    MobilBekas(String honda, String civic, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getTahun() {
        return tahun;
    }

    public double getHarga(){
        return harga;
    }

    @Override
    public void info() {
        System.out.println("Mobil Bekas: " + getMerek() + " " + getModel() + " ("
    + tahun + ")");
    }

    private String getMerek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}