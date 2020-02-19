package metotHesapMakinesi;

import java.util.Scanner;

public class MetotluHesapMakinesi {

	 /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya çalýþýn.
    Toplama ve Çarpma metodlarýný 2 veya 3 parametre alacak þekilde tasarlayýn.

    */   
    public static int cikarma(int a,int b) {
        
        return (a - b);
        
    }
    public static double bolme(int a,int b) {
        return ((double)a / b);
        
    }
    public static int toplama(int a,int b){
        
        return (a + b);
        
    }
    public static int toplama(int a,int b,int c) {
        
        return (a + b + c);
    }
    public static int carpma(int a,int b) {
        
        return a * b;
    }
    public static int carpma(int a,int b,int c) {
        return a * b * c;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String islemler =  "1. Toplama Ýþlemi\n"
                           +"2. Çýkarma Ýþlemi\n"
                           + "3. Çarpma Ýþlemi\n"
                           + "4. Bölme Ýþlemi\n"
                           + "Çýkýþ için q'ya basýn.";
        System.out.println("*****-------------******");
        System.out.println(islemler);
        System.out.println("*****-------------******");

        while (true) {
            System.out.print("Ýþlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan Çýkýlýyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("Kaç deðer toplayacaksýnýz ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayýlarýn toplamlarý : " + (toplama(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayýlarýn toplamlarý : " + (toplama(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                }
                
                
            }
            else if (islem.equals("2")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Sayýlarý Farklarý : " + cikarma(a, b));
                
            }
            else if (islem.equals("3")){
                System.out.print("Kaç deðer çarpacaksýnýz ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayýlarýn çarpýmlarý : " + (carpma(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayýlarýn çarpýmlarý : " + (carpma(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                }
                
            }
            else if (islem.equals("4")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Sayýlarýn Bölümü : " + bolme(a, b));
                
            }
            else {
                System.out.println("Geçersiz Ýþlem...");
            }
            
            
            
        }
        
        
    }

}
