package konversi.suhu.c.project.suhu;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float C = 0, K = 0, F = 0, R = 0;
        int pilih, pilihku;
       
        Scanner scan = new Scanner(System.in);
         suhu konversi = new suhu();
        System.out.print("Pilih Menu Konversi Suhu Berikut ini : "
                + "\n1. Kelvin"
                + "\n2. Celcius"
                + "\n3. Fahrenheit"
                + "\n4. Reamour "
                + "\n:");
        pilih = scan.nextInt();
        
        switch(pilih){
            
            case 1 :
                System.out.print("Pilih konversi dari Kelvin ke"
                        
                        + "\n1) Celcius"
                        + "\n2) Fahrenheit"
                        + "\n3) Reaumur"
                        + "\n:");
                pilihku = scan.nextInt();
               
                if (pilihku == 1){
                  konversi.kelvinkecelcius(K, C);  
                } else if (pilihku == 2){
                    konversi.kelvinkefahrenheit(K, F);
                } else if (pilihku == 3){
                    konversi.kelvinkereaumur(K, R);
                } else {
                    System.out.println("pilihan anda salah");
                } 
                break;
                
            case 2:
                System.out.print("Pilih konversi dari Celcius ke - "
                        
                        + "\n1. Kelvin"
                        + "\n2. Fahrenheit"
                        + "\n3. Reaumur"
                        + "\n:");
                
                pilihku = scan.nextInt();
                
                if (pilihku == 1 ) {
                    konversi.celciuskekelvin(C, K);
                    
                } else if (pilihku == 2 ){
                    konversi.celciuskefahrenheit(C, F);
                } else if (pilihku == 3 ){
                    konversi.celciuskereaumur(C, R);
                } else {
                    System.out.println("pilihan anda salah");
                }
                break;
                
            case 3 :
                 System.out.print("Pilih konversi dari Fahrenheit ke"
                        
                        + "\n1. Kelvin"
                        + "\n2. Celcius"
                        + "\n3. Reaumur"
                        + "\n:");
                 pilihku = scan.nextInt();
                 
                 if (pilihku == 1){
                     konversi.fahrenheitkekelvin(F, K);
                     
                 } else if (pilihku == 2){
                     konversi.fahrenheitkecelcius(F, C);
                 } else if (pilihku == 3){
                     konversi.fahrenheitkereaumur(F, R);
                 }
                break;
            
                case 4 :
                 System.out.print("Pilih konversi dari Reaumur ke"
                        
                        + "\n1. Kelvin"
                        + "\n2. Celcius"
                        + "\n3. Fahrenheit"
                        + "\n:");
                 pilihku = scan.nextInt();
                 
                 if (pilihku == 1){
                     konversi.reaumurkekelvin(R, K);
                 } else if (pilihku == 2){
                     konversi.reamurkecelcius(R, C);
                 } else if ( pilihku == 3) {
                     konversi.reamurkefarenheit(R, F);
                 } else {
                    System.out.println("pilihan anda salah");
                }
            default : System.out.println("Konversi suhu yang di masukan tidak tersedia");
        }
        
        
    }
    
}



