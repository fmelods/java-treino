
public class Localizacao {

	public static void main (String [] args) {
		Endereco rua = new Endereco("Rua Ibiraiaras", "Avenida Paulista", "Rua Primavera");
		
		System.out.println(rua.getmeuEndereco());
		System.out.println(rua.getfiapEndereco());
		System.out.println(rua.getvoEndereco());
	}
	
}
