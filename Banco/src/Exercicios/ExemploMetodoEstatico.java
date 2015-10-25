package Exercicios;

import java.util.Date;

public class ExemploMetodoEstatico {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date data = new Date();
		
		System.out.println(UtilData.agora(data));
		
		UtilData idata = new UtilData();
		
		System.out.println(idata.agora(data));
		System.out.println(idata.DDMMAAAAHHMM(data));
		
		UtilData.DDMMAAAAHHMM(data);

	}

}
