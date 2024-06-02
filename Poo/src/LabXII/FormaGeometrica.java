package LabXII;

public class FormaGeometrica {

	private String corDaLinha;
	private String corDoFundo;
	
	public FormaGeometrica(String corDaLinha, String corDoFundo) {
		this.corDaLinha = corDaLinha;
		this.corDoFundo = corDoFundo;
	}
	
	public FormaGeometrica() {
	}

	public String getCorDaLinha() {
		return corDaLinha;
	}

	public void setCorDaLinha(String corDaLinha) {
		this.corDaLinha = corDaLinha;
	}

	public String getCorDoFundo() {
		return corDoFundo;
	}

	public void setCorDoFundo(String corDoFundo) {
		this.corDoFundo = corDoFundo;
	}

	public double calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "FormaGeometrica [corDaLinha=" + corDaLinha + ", corDoFundo=" + corDoFundo + ", getClass()=" + getClass()
				+ "]";
	}
	
	
	
}
