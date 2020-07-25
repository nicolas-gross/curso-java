package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		/*
			POLIMORFISMO:
			POLI-> Vários/Muitos
			MORFISMO-> Formas
		*/
		
		Animal obj = new Cachorro();
		obj.som();
		obj.apresentar();

	}

}
