
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
class MobilBaru implements Kendaraan {
    private final String garansi;

    public MobilBaru(String merek, String model, String garansi){
        super(merek, model);
        this.garansi = garansi;
    }

    MobilBaru(String toyota, String avanza, String _tahun) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getGaransi(){
        return garansi;
    }

    @Override
    public void info(){
         System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + "(Garansi: " + garansi + ")");
    }

    private String getMerek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}