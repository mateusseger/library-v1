package exception;

public class ExistingAuthorException extends Exception {
	private static final long serialVersionUID = 1L;
	private String name, originCountry;
	
	public ExistingAuthorException(String name, String originCountry) {
		this.name = name;
		this.originCountry = originCountry;
	}
	
	@Override
	public String toString() {
		return "OCORREU UM ERRO!\n" + 
				"Autor(a) " + this.name + " natural do(a) " + this.originCountry + ", já existe na lista de autores cadastrados.\n" +
				"Favor informar um autor diferente!\n";
	}
}