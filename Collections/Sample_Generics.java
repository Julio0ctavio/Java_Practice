package Collections;

//Generic of Type called "T"
class Generic<T>{
	public Generic(T valor) {
		setValor(valor);
	}

	private T valor;

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
}

public class Sample_Generics {
	@SuppressWarnings("unchecked")
	public static void main(String [] args) {
		//The <String> parameter above will let us know that Generic class will receive a String parameter, so the parameter must be a String
		Generic<String> sample_generic = new Generic<>("Julio Lozano");
		System.out.println(sample_generic.getValor());
		
		//If I don't specify which generic I will use, this class would receive any kind type of data as a parameter.
		@SuppressWarnings({ "rawtypes" })
		Generic sample_generic_int = new Generic(23);
		System.out.println(sample_generic_int.getValor());
		
		@SuppressWarnings({ "rawtypes" })
		Generic sample_generic_boolean = new Generic(true);
		System.out.println(sample_generic_boolean.getValor());
	}
}
