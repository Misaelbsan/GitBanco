package Exercicios;	

import java.util.Calendar;
import java.util.Date;

public class UtilData {
	
	static final int DOMINGO = Calendar.SUNDAY;
	static final int SEGUNDA = Calendar.MONDAY;
	static final int TERÇA = Calendar.TUESDAY;
	static final int QUARTA = Calendar.WEDNESDAY;
	static final int QUINTA = Calendar.THURSDAY;
	static final int SEXTA = Calendar.FRIDAY;
	static final int SABADO = Calendar.SATURDAY;
	
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
	
	public static Date data(){
		return Calendar.getInstance().getTime();
	}
	
	public static Calendar data(int dia, int mes, int ano){
		return data(dia, mes, ano, 0, 0, 0);
	}
	public static Calendar data(int dia, int mes, int ano, int hora, int min, int seg){
		Calendar data = Calendar.getInstance();
		data.set(ano, --mes, dia, hora, min, seg);
		data.set(Calendar.MILLISECOND, 0);
		return data;
	}
	public static Calendar data(String data){
		return data(Integer.valueOf(data.split("/")[0]), 
					Integer.valueOf(data.split("/")[1]), 
					Integer.valueOf(data.split("/")[2]));
	}
	public static Date getDate(Calendar data){
		return data.getTime();
	}
	public static String DDMMAAAA(Date data){
		return new java.text.SimpleDateFormat("dd/MM/yyyy").format(data);
	}
	public static String DDMMAAAAHHMM(Date data){
		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
	}
	
	public static String agora(Date data){
		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
	}
	public int getAno(Date data){
		final Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		return calendario.get(Calendar.YEAR);
	}
	public int getMes(Date data){
		final Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		return calendario.get(Calendar.MONTH);
	}
	public int getDia(Date data){
		final Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		return calendario.get(Calendar.DAY_OF_MONTH);
	}
	public void somarDia(Date data, int numDias){
		final Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(Calendar.DAY_OF_MONTH, numDias);	
	}
	static {
		System.out.println("Entrando no Bloco Estatico");
		Date data = Calendar.getInstance().getTime();
		System.out.println("Saindo do metodo Estatico data = " + agora(data));
	}
	
}
