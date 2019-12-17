package com.senati.numero;

public class Numero {
	
	public double valor;

	public Numero() {
		super();
	}

	public Numero(double num) {
		super();
		valor = num;
	}
	
	public String Primo() {
		String res;
		int a=0;
		for(double i=1;i<=valor;i++) {
			if (valor % i  == 0) {
				a++;
			}
		}
		if (a==2) {
			res="Número es primo";
		}else {
			res="Número no es primo";
		}		
		return res;
	}
	
	public String Perfecto() {
		String res;
		double a=0;
		for (double i=1;i<valor;i++) {
			if (valor % i == 0) {
				a = a + i;
			}
		}
		if (a==valor) {
			res="Número es perfecto";
		}
		else {
			res="Número no es perfecto";
		}
		return res;
	}
	

	public double Factorial() {
		double fac=1;
		double val = this.valor;
		while (val != 0) {
			fac = fac * val;
			val--;
		}
		return fac;
	}
	
	public String Fibonacci() {
		
		String r="";
		
		//0,1,1,2,3,5,8,13,21 ...
		double n1=0;
		double n2=1;
		
		int i=1;
		
		while(true) 
		{
			if(this.valor==n1) {
				r="ES un Fibonacci";
				break;
			}

			if(this.valor==n2) {
				r="ES un Fibonacci";
				break;
			}
			
			if(this.valor<n2) {
				r="NO es un Fibonacci";
				break;
			}
			
			double tmp = n2;
			n2 = n1 + n2;
			n1 = tmp;
			
			i=i+1;
		}
		
		
		return r;
	}
	public String numeroToTexto() {
		int iNumero = (int) this.valor;
		
		String sTexto="";
		int iUnidad = iNumero%10;
		int iDecena = iNumero%10;
		iNumero = iNumero/10;
		 
		if ((iUnidad==0) && (iDecena>0))
			sTexto = decenaEnTexto(iDecena);
		else if (iDecena==1)
			sTexto = decenas(10+iUnidad);
		else if (iDecena > 1)
			sTexto = decenaEnTexto(iDecena) + " y " + sTexto;
		
		return sTexto;
	}
	
	private String unidadEnTexto(int iNumero){
	
		 switch(iNumero){
			case 1:
				return "uno";
			case 2:
				return "dos";
			case 3:
				return "tres";
			case 4:
				return "cuatro";
			case 5:
				return "cinco";
			case 6:
				return "seis";
			case 7:
				return "siete";
			case 8:
				return "ocho";
			case 9:
				return "nueve";
			case 0:
				return "cero";
			default:
				return "";
		 }
	}

	private String decenaEnTexto(int iDecena)
	{
		  switch (iDecena){
			case 1:
				return "diez";
			case 2:
				return "veinte";
			case 3:
				return "treinta";
			case 4:
				return "cuarenta";
			case 5:
				return "cincuenta";
			case 6:
				return "sesenta";
			case 7:
				return "setenta";
			case 8:
				return "ochenta";
			case 9:
				return "noventa";		
			default:
				return "";
		  }
	}
	private String decenas(int iDecena)
	{
		  switch (iDecena){
			case 11:
				return "once";
			case 12:
				return "doce";
			case 13:
				return "trece";
			case 14:
				return "catorce";
			case 15:
				return "quince";
			case 16:
				return "dieciseis";
			case 17:
				return "diecisiete";
			case 18:
				return "dieciocho";
			case 19:
				return "diecinueve";		
			default:
				return "";
		  }
	}
	private String centenaEnTexto(int iCentena){
		  switch (iCentena){
			case 1:
				return "ciento";
			case 5:
				return "quinientos";
			case 9:
				return "novecientos";				
			default:
				return "";
		  }
	}
}
