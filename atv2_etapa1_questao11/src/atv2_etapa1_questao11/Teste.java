package atv2_etapa1_questao11;

import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> listaContas = new ArrayList<Conta>();
		
		listaContas.add(new Conta("Dylan", 11111, 1111111, 11.11));
		listaContas.add(new Conta("Kiara", 22222, 2222222, 22.22));
		listaContas.add(new Conta("Pedro", 33333, 3333333, 33.33));
		listaContas.add(new Conta("Arlet", 44444, 4444444, 44.44));
		listaContas.add(new Conta("Danna", 55555, 5555555, 55.55));
		listaContas.add(new Conta("Saori", 66666, 6666666, 66.66));
		listaContas.add(new Conta("Maddi", 77777, 7777777, 77.77));
		listaContas.add(new Conta("Dasha", 88888, 8888888, 88.88));
		listaContas.add(new Conta("Itzae", 99999, 9999999, 99.99));
		listaContas.add(new Conta("Keyla", 11111, 1111111, 11.11));
		
		//RelatorioSimples simples = new RelatorioSimples(listaContas);
		//simples.gerarRelatorio();
		
		
		RelatorioComplexo complexo = new RelatorioComplexo(listaContas);
		complexo.gerarRelatorio();
	}
}
