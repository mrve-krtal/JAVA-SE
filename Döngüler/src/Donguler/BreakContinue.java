package Donguler;

public class BreakContinue {

	public static void main(String[] args) {
		 /*
        break anahtar kelimesi
     
        D�ng� herhangi bir yerde ve herhangi bir zamanda break ifadesiyle kar��la�t��� zaman �al��mas�n� durdurur.
        B�ylelikle d�ng� hi�bir ko�ula ba�l� kalmadan sonlanm�� olur.
        
        break ifadesi sadece ve sadece i�inde bulundu�u d�ng�y� sonland�r�r. E�er i� i�e d�ng�ler varsa
        ve i�teki d�ng�de break kullan�lm��sa sadece i�teki d�ng� sona erer.
     
        continue anahtar kelimesi 
        
        D�ng� herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle kar��la�t��� zaman geri kalan 
        i�lemlerini yapmadan direk d�ng� blo�unun ba��na d�ner.
    
        
        
    */
    /*Scanner scanner = new Scanner(System.in);
    
    while(true) {
        
        int islem = scanner.nextInt();
        
        if (islem == -1){
            System.out.println("D�ng�den ��k�l�yor....");
            break;
        }
        System.out.println("��lem :" + islem);
        
    }*/
    
    int i = 0;
    
    while (i < 10) {
        
        if (i == 3 || i == 5) {
           i++; //yazmak isek sonsuz d�ng�ye girecektir.
            continue;
        }
        System.out.println("i = " + i );
        i++;
        
    }
    
            
	}

}
