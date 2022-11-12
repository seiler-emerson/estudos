package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso permitirAcesso) {
		this.permitirAcesso = permitirAcesso;
	}
}
