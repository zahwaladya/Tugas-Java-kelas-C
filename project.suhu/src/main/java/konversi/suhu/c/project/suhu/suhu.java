/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi.suhu.c.project.suhu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class suhu {
   
    Scanner scan = new Scanner(System.in);
    public void kelvinkecelcius(float K, float C){
        System.out.print("masukan nilai kelvin : " );
        K = scan.nextFloat();
        C = (float) (K - 273.15);
        System.out.println("hasil : " + C);
    }  
    public void kelvinkefahrenheit (float K, float F){
        System.out.print("masukan nilai kelvin : " );
        K = scan.nextFloat();
        F = (float) (K * 1.8 - 459.67);
        System.out.println("hasil : " + F);
    }
    public void kelvinkereaumur (float K, float R){
        System.out.print("masukan nilai kelvin : " );
        K = scan.nextFloat();
        R = (float) ((K - 273.15) * 0.8);
        System.out.println("hasil : " + R);
    }
    
   public void celciuskekelvin (float C, float K){
       System.out.print("masukan nilai celcius : " );
       C = scan.nextFloat();
       K = (float) (C + 273.15);
       System.out.println("hasil : " + K);
   } 
   public void celciuskefahrenheit (float C, float F){
       System.out.print("masukan nilai celcius : " );
       C = scan.nextFloat();
       F = (float) (C * 1.8 + 32);
       System.out.println("hasil : " + F);
   }
   public void celciuskereaumur (float C, float R){
       System.out.print("masukan nilai celcius : ");
       C = scan.nextFloat();
       R = (float) (C * 0.8);
       System.out.println("hasil : " + R);
   }
   public void fahrenheitkekelvin (float F, float K){
       System.out.print("masukan nilai fahrenheit : " );
       F = scan.nextFloat();
       K = (float) ((F + 459.67) / 1.8);
       System.out.println("hasil : " + K);
   }
   public void fahrenheitkecelcius (float F, float C){
       System.out.print("masukan nilai fahrenheit : " );
       F = scan.nextFloat();
       C = (float) ((F - 32) / 1.8);
       System.out.println("hasil : " + C);
   }
   public void fahrenheitkereaumur (float F, float R){
       System.out.print("masukan nilai fahrenheit : " );
       F = scan.nextFloat();
       R = (float) ((F - 32) / 0.44);
       System.out.println("hasil : " + R);
   }
   
   public void reaumurkekelvin (float R, float K){
       System.out.print("masukan nilai reamur : " );
       R = scan.nextFloat();
       K = (float) (R / 0.8 + 273.15);
       System.out.println("hasil : " + K);
   }
   public void reamurkecelcius (float R, float C){
       System.out.print("masukan nilai reaumur : " );
       R = scan.nextFloat();
       C = (float) (R / 0.8);
       System.out.println("hasil : " +C);
   }
   public void reamurkefarenheit (float R,float F){
       System.out.print("masukan nilai reamur : ");
       R = scan.nextFloat();
       F = (float) (R * 2.25 + 32);
       System.out.println("hasil : " + F);
   }
    void kelvinkecelcius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
