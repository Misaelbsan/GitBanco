package Exercicios;

public class ExemploVariavelEstatica {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dia da Semana: " + UtilData.DOMINGO);
		System.out.println("Dia da Semana: " + UtilData.SEGUNDA);
		System.out.println("Dia da Semana: " + UtilData.QUARTA);
		System.out.println("Dia da Semana: " + UtilData.SABADO);
		System.out.println("");
		
		UtilData data = new UtilData();
		System.out.println("Mes do Ano: " + data.JANEIRO);
		System.out.println("Mes do Ano: " + data.FEVEREIRO);
		System.out.println("Mes do Ano: " + data.MARÇO);
		System.out.println("Mes do Ano: " + data.ABRIL);
		
		
		System.out.println("Dia da Semana: " + data.DiadaSemana);
		data.DiadaSemana = 3;
		System.out.println("Mudou dia da Samana: " + data.DiadaSemana);
		
		UtilData data2 = new UtilData();
		System.out.println("Instancia 1 dia do mes " + UtilData.DiadoMes);
		System.out.println("Instancia 2 dia do mes " + data2.DiadoMes);
		data2.DiadoMes = 20;
		System.out.println("Instancia 1 mudou dia do mes " + UtilData.DiadoMes);
		System.out.println("Instancia 2 mudou dia do mes " + data2.DiadoMes);
		
		System.out.println(data.JANEIRO);
		System.out.println(UtilData.FEVEREIRO);
		
		
		

	}

}
