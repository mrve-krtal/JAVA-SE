package constructor1;

public class Account {
	
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	public Account(){ //class ismi ile ayný Parametre almayan consturctor'imiz
	        
	        System.out.println("Kendi Yazdýðýmýz Consttructor....");
	        
	    }
	    public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo) {
	        //class ismi ile ayný birde fazla parametre alan constructorlarýmýz
	        
	    	this.hesapNo = hesapNo;
	        
	        this.bakiye =  bakiye;
	        this.isim = isim;
	        
	        this.email = email;
	        this.telefonNo = telefonNo;
	        
	    }
	
	public void ParaYatýr(double miktar) {
		
		bakiye+=miktar;
		System.out.println("Yeni bakiyeniz: "+bakiye);
	}
	
	public void ParaCekme(double miktar) {
		
		if(miktar>1500) {
			System.out.println("Bir günde 1500 TL'den fazla para çekemezsiniz..");
		}
		if (bakiye-miktar<0) {
			
			System.out.println("Yeterli bakiye yok.."+bakiye);
		}
		else {
			bakiye-=miktar;
			System.out.println("yeni bakiye: "+bakiye);
		}
		
	}
	
	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

}
