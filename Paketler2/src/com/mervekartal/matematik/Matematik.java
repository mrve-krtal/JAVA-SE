package com.mervekartal.matematik;

public class Matematik implements IMatematik {

	@Override
	public void toplama(int a, int b) {
		
		System.out.println("Toplama Sonucu: "+(a+b));
		
	}

	@Override
	public void cikarma(int a, int b) {
		System.out.println("��karma Sonucu: "+(a-b));
		
	}

	@Override
	public void carpma(int a, int b) {
		System.out.println("Carpma Sonucu: "+(a*b));
		
	}

	@Override
	public void b�lme(int a, int b) {
		System.out.println("B�lme Sonucu: "+((double)a/b));
		
	}

}
