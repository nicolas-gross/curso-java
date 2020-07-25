package exemplo;

public interface Padrao {

	/*
		Classe Abstrata: Cont�m m�todos obrigat�rios, onde classes que herdam
		a classe Abstrata precisam seguir.
		Em uma classe abstrata voc� pode criar m�todos n�o abstratos para 
		que sejam reutilizados.
		Classes abstratas podem ser herdadas apenas uma por classe.
		
		Interface: Cont�m m�todos obrigat�rios, onde as classes "herdam".
		N�o podemos criar m�todos reutiliz�veis.
		Interfaces podem ser herdadas m�ltiplas vezes pelas classes
	*/
	
	// M�todos
	public boolean validaUsuario(String email, String senha);
	public void alterarSenha(String senha, String novaSenha);
	public void listarProdutos();
	
}






