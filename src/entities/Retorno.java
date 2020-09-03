package entities;

public class Retorno {
	
	private Double calculo;

	public Retorno() {
	}

	public Retorno(Double calculo) {
		this.calculo = calculo;
	}

	public Double getCalculo() {
		return calculo;
	}

	public void contMais(Double valor) {
		calculo = calculo * valor ;
	}
	
	/*@Override
	public String toString() {
	 return  String.format("%.2f" + calculo);	
	}*/
	
	

}
