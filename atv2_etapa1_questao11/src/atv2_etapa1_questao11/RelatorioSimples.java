package atv2_etapa1_questao11;

import java.util.ArrayList;

public class RelatorioSimples extends Relatorio {
	
	ArrayList<Conta> a;
	
	public RelatorioSimples (ArrayList<Conta> a) {
		this.a = a;
	}

	@Override
	void gerarCabecalho() {
		System.out.println("\n############ Banco Rouba Nois ############\n" 
							+ "Telefone: (11) 1111-1111\n");
	}

	@Override
	void gerarCorpo() {
		/*
		 * Titular: Ana
		 * Saldo: 666,66
		 * ########
		 * Titular: João
		 * Saldo: 555,55
		 * 
		 */
		System.out.println("\n---------- Relatorio Simples ----------\n");
		for (int i=0; i< a.size(); i++) {
			System.out.println("#" + (i+1)); 
			System.out.println("Titular: " + this.a.get(i).getNomeTitular());
			System.out.println("Saldo: R$" + this.a.get(i).getSaldo() + "\n");
		}
	}

	@Override
	void gerarRodape() {
		System.out.println("\n############ Banco Rouba Nois ############\n" 
				+ "Telefone: (11) 1111-1111\n");
	}

}
