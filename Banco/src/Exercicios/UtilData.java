package Exercicios;

import java.util.Calendar;
import java.util.Date;

public class UtilData {
	
	static int DOMINGO = Calendar.SUNDAY;
	static int SEGUNDA = Calendar.MONDAY;
	static int TERÇA = Calendar.TUESDAY;
	static int QUARTA = Calendar.WEDNESDAY;
	static int QUINTA = Calendar.THURSDAY;
	static int SEXTA = Calendar.FRIDAY;
	static int SABADO = Calendar.SATURDAY;
	
	static int JANEIRO = Calendar.JANUARY;
	static int FEVEREIRO = Calendar.FEBRUARY;
	static int MARÇO = Calendar.MARCH;
	static int ABRIL = Calendar.APRIL;
	static int MAIO = Calendar.MAY;
	static int JUNHO = Calendar.JUNE;
	static int JULHO = Calendar.JULY;
	static int AGOSTO = Calendar.AUGUST;
	static int SETEMBRO = Calendar.SEPTEMBER;
	static int OUTUBRO = Calendar.OCTOBER;
	static int NOVEMBRO = Calendar.NOVEMBER;
	static int DEZEMBRO = Calendar.DECEMBER;
	
	static int DiadoMes = Calendar.DAY_OF_MONTH;
	static int DiadaSemana = Calendar.DAY_OF_WEEK;
	
	static {
		System.out.println("Entrando no Bloco Estatico");
		Date data = Calendar.getInstance().getTime();
		System.out.println("Saindo do metodo Estatico data = " + agora(data));
	}

	static String agora(Date data) {
		// TODO Auto-generated method stub
		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:S").format(data);
	}
	static String DDMMAAAAHHMM(Date data){
		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:S").format(data);
	}
}
