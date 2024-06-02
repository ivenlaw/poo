package LabXII;

public class Ponto {

	private float x;
	private float y;
	
	public Ponto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public double calculaDistancia(Ponto ponto) {
		return Math.sqrt(Math.pow(this.x-ponto.getX(), 2)+ Math.pow(this.y-ponto.getY(), 2));
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Ponto [x=" + x + ", y=" + y + ", getClass()=" + getClass() + "]";
	}
	
	
}
