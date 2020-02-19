package metotHesapMakinesi;

import java.util.Scanner;

public class MetotluHesapMakinesi {

	 /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya �al���n.
    Toplama ve �arpma metodlar�n� 2 veya 3 parametre alacak �ekilde tasarlay�n.

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
        
        String islemler =  "1. Toplama ��lemi\n"
                           +"2. ��karma ��lemi\n"
                           + "3. �arpma ��lemi\n"
                           + "4. B�lme ��lemi\n"
                           + "��k�� i�in q'ya bas�n.";
        System.out.println("*****-------------******");
        System.out.println(islemler);
        System.out.println("*****-------------******");

        while (true) {
            System.out.print("��lemi Se�iniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan ��k�l�yor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("Ka� de�er toplayacaks�n�z ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen say�lar�n toplamlar� : " + (toplama(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen say�lar�n toplamlar� : " + (toplama(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun i�in uygun metod bulunmuyor...");
                }
                
                
            }
            else if (islem.equals("2")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Say�lar� Farklar� : " + cikarma(a, b));
                
            }
            else if (islem.equals("3")){
                System.out.print("Ka� de�er �arpacaks�n�z ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen say�lar�n �arp�mlar� : " + (carpma(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen say�lar�n �arp�mlar� : " + (carpma(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun i�in uygun metod bulunmuyor...");
                }
                
            }
            else if (islem.equals("4")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Say�lar�n B�l�m� : " + bolme(a, b));
                
            }
            else {
                System.out.println("Ge�ersiz ��lem...");
            }
            
            
            
        }
        
        
    }

}
