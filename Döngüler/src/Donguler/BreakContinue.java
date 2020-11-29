package Donguler;

public class BreakContinue {

	public static void main(String[] args) {
		 /*
        break anahtar kelimesi
     
        Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karþýlaþtýðý zaman çalýþmasýný durdurur.
        Böylelikle döngü hiçbir koþula baðlý kalmadan sonlanmýþ olur.
        
        break ifadesi sadece ve sadece içinde bulunduðu döngüyü sonlandýrýr. Eðer iç içe döngüler varsa
        ve içteki döngüde break kullanýlmýþsa sadece içteki döngü sona erer.
     
        continue anahtar kelimesi 
        
        Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karþýlaþtýðý zaman geri kalan 
        iþlemlerini yapmadan direk döngü bloðunun baþýna döner.
    
        
        
    */
    /*Scanner scanner = new Scanner(System.in);
    
    while(true) {
        
        int islem = scanner.nextInt();
        
        if (islem == -1){
            System.out.println("Döngüden çýkýlýyor....");
            break;
        }
        System.out.println("Ýþlem :" + islem);
        
    }*/
    
    int i = 0;
    
    while (i < 10) {
        
        if (i == 3 || i == 5) {
           i++; //yazmak isek sonsuz döngüye girecektir.
            continue;
        }
        System.out.println("i = " + i );
        i++;
        
    }
    
            
	}

}
