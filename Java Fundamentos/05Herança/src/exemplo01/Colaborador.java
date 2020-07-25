package exemplo01;

public class Colaborador extends Pessoa{

	// Atributos
	private String cargo;
	private double salario;
	
	// Construtor
	public Colaborador(String nome, String endereco, int idade, String cargo, double salario) {
		super(nome, endereco, idade);
		
		this.cargo = cargo;
		this.salario = salario;
		
		listarP();
		listarC();
	}

	// Listar dados colaborador
	private void listarC() {
		System.out.println("Cargo "+cargo);
		System.out.println("Sal�rio "+salario);
	}
}
