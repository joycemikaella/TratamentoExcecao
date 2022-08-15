package tratamentoexcecao;

import tratamentoexcecao.excecoes.MinhaExcecao;
import tratamentoexcecao.excecoes.CpfExcecao;
public class TratamentoExcecao {


	public static void main(String[] args) {
//		int a = 10;
//		int b = 0;
//		try {
//			int z = a/b;
//			System.out.println(z);
//		}catch(ArithmeticException e){
//			System.out.println(e.getMessage());
//		}
//		
////		Venda venda = new Venda();
////		venda.trataExcecao();
////		testaLancaExcecao();
//		System.out.println("acabou");
		
//		try {
//			minhaExcecao();
//		} catch (MinhaExcecao e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			cpf();
		} catch (CpfExcecao e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void cpf() throws CpfExcecao {
		String cpf = "412.332.145-67";
		if (cpf.contains("-") && cpf.contains(".") && cpf.length() != 14){
			throw new CpfExcecao("tamanho de cpf inválido");
		} else if (cpf.length() != 11 && cpf.length() != 14) {
			throw new CpfExcecao("tamanho de cpf inválido");
		}
	}
	
	public static void minhaExcecao() throws MinhaExcecao {
		int a = 10;
		int b = 0;
		if(b == 0) {
			throw new MinhaExcecao("divisão por zero");
		}
	}
	
	public static void testaLancaExcecao() {
		Venda venda = new Venda();
		try {
			venda.lancaExcecao();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
