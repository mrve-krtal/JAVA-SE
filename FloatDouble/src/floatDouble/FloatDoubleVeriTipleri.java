package floatDouble;

public class FloatDoubleVeriTipleri {

	public static void main(String[] args) {
		
		//double veri tipi 64 bit- 8 byte
		//float 32 bit - 4 byte 
		
		//otomatik dönüþtime int->float->double
		
			int x=22/7;
			float y=22f/7f;
			double z=22d/7d;
			
			System.out.println("x:"+x);
			System.out.println("y:"+y);
			System.out.println("z:"+z);
			
		    float m=(float)5.0;  
		    System.out.println(m);
			
		
		   double sayi1 = 70.25;
	       double sayi2 = 60d;
	       double sayi3 = 80.2;
	       
	       float a = 70.25f;
	       float b = 60f;
	       float c = 80.2f;
	        System.out.println("Ortalama: " + (sayi1 + sayi2 + sayi3) / 3 );
	        System.out.println("Ortalama2: " + (a + b + c) / 3 );
	        
	       
	}

}
