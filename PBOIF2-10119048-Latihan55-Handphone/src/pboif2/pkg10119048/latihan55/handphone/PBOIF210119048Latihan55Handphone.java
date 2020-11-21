/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan55.handphone;

/**
 *
 * @author SystemOs
 */
public class PBOIF210119048Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android = new Android("Samsung","Android","Grand",3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());
        
        System.out.println();
        
        BlackBerry bb = new BlackBerry("BlackB","RIM","Curve",2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : " + bb.getPinBB());
        
        System.out.println();
        
        WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("PIN : " + wp.getWpKeyStore());
    }
    
}