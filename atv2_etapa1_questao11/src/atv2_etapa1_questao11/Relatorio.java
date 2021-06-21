package atv2_etapa1_questao11;

abstract class Relatorio {

	
	final void gerarRelatorio() {
		gerarCabecalho();
		gerarCorpo();
		gerarRodape();
	}
	
	abstract void gerarCabecalho();
	abstract void gerarCorpo();
	abstract void gerarRodape();

	
}
