package kodBlogu;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		/*
        switch(op) {
            case durum1:
                islemler
                break
            case durum2:
                islemler
                
                break
                //
                //
            default:
                islemler
                break
        
        }
        
        */
        
        Scanner scanner = new Scanner(System.in);
        
        int islem = scanner.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("1.i�lem");
                
            case 2:
                System.out.println("2.i�lem");
                
            case 3:
                System.out.println("3.i�lem");
                
            case 4:
                System.out.println("4.i�lem");
                
            default:
                System.out.println("Ge�ersiz i�lem...");
                break;
            
            
            
        }

	}

}
