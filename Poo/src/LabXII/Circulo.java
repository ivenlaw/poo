package LabXII;

public class Circulo extends FormaGeometrica {
	
	private Ponto centro;
	private float raio;

	public Circulo(String corDaLinha, String corDoFundo, Ponto centro, float raio) {
		super(corDaLinha, corDoFundo);
		// TODO Auto-generated constructor stub
		this.centro = centro;
		this.raio = raio;
	}

	public Circulo(String corDaLinha, String corDoFundo) {
		super(corDaLinha, corDoFundo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double  calculaArea() {
		return Math.PI*Math.pow(raio,2);
	}
	
	public Ponto getCentro() {
		return centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", raio=" + raio + ", getCorDaLinha()=" + getCorDaLinha()
				+ ", getCorDoFundo()=" + getCorDoFundo() + ", toString()=" + super.toString() + "]";
	}

	
	
}
