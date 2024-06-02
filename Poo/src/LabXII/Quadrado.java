package LabXII;

public class Quadrado extends FormaGeometrica {

	private Ponto vertice1;
	private Ponto vertice2;

	public Quadrado(String corDaLinha, String corDoFundo) {
		super(corDaLinha, corDoFundo);
		// TODO Auto-generated constructor stub
	}

	public Quadrado(String corDaLinha, String corDoFundo, Ponto vertice1, Ponto vertice2) {
		super(corDaLinha, corDoFundo);
		// TODO Auto-generated constructor stub
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
	}

	@Override
	public double calculaArea() {
		return  Math.pow(this.vertice1.calculaDistancia(vertice2), 2);
	}
	
	public Ponto getVertice1() {
		return vertice1;
	}

	public void setVertice1(Ponto vertice1) {
		this.vertice1 = vertice1;
	}

	public Ponto getVertice2() {
		return vertice2;
	}

	public void setVertice2(Ponto vertice2) {
		this.vertice2 = vertice2;
	}

	@Override
	public String toString() {
		return "Quadrado [vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", getCorDaLinha()=" + getCorDaLinha()
				+ ", getCorDoFundo()=" + getCorDoFundo() + ", getClass()=" + getClass() + "]";
	}
	
	
}
