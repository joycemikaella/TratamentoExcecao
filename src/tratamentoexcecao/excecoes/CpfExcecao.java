package tratamentoexcecao.excecoes;

public class CpfExcecao extends Exception{
	
	private static final long serialVersionUID = 1L;

	public CpfExcecao(String texto) {
		super(texto);
	}

}
