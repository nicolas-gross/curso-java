package exemplo;

public interface Padrao {

	/*
		Classe Abstrata: Contêm métodos obrigatórios, onde classes que herdam
		a classe Abstrata precisam seguir.
		Em uma classe abstrata você pode criar métodos não abstratos para 
		que sejam reutilizados.
		Classes abstratas podem ser herdadas apenas uma por classe.
		
		Interface: Contêm métodos obrigatórios, onde as classes "herdam".
		Não podemos criar métodos reutilizáveis.
		Interfaces podem ser herdadas múltiplas vezes pelas classes
	*/
	
	// Métodos
	public boolean validaUsuario(String email, String senha);
	public void alterarSenha(String senha, String novaSenha);
	public void listarProdutos();
	
}






