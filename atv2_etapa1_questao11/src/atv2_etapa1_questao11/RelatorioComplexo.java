package atv2_etapa1_questao11;

import java.util.Date;
import java.util.ArrayList;

public class RelatorioComplexo extends Relatorio {

	ArrayList<Conta> a;
	
	public RelatorioComplexo (ArrayList<Conta> a) {
		this.a = a;
	}
	
	
	
	@Override
	void gerarCabecalho() {
		System.out.println("\n############ Banco Rouba Nois ############");
		System.out.println("Endereço: Av.Castro, 03 - 4º ANDAR - Centro, São Luís - MA, 65065-221");
		System.out.println("Telefone: (11) 1111-1111\n");
	
	}

	@Override
	void gerarCorpo() {
		/* 
		 * Titular: Ana
		 * Agencia:1111-1111
		 * N Da Conta: 45.454-56
		 * Saldo: 666,66
		 */ 
		System.out.println("\n---------- Relatorio Complexo ----------\n");

		for (int i=0; i< a.size(); i++) {
			System.out.println("#" + (i+1)); 
			System.out.println("Titular: " + this.a.get(i).getNomeTitular());
			System.out.println("Agencia: " + this.a.get(i).getAgencia());
			System.out.println("Nº da Conta: " + this.a.get(i).getNumeroDaConta());
			System.out.println("Saldo: R$" + this.a.get(i).getSaldo() + "\n");
		}
	}

	@Override
	void gerarRodape() {
		System.out.println("\nE-mail: bancoroubanois@brn.com.br");
		
		Date data = new Date();
		System.out.println("Data: "+data);		
	}
	
	
	
}
