package mz.co.cmm.entidade;

public class Aluguer {
	
	private String estudante;
	private int celular, numeroQuarto;
	
	
	public Aluguer(String estudante, int celular, int numeroQuarto) {
		this.estudante = estudante;
		this.celular = celular;
		this.numeroQuarto = numeroQuarto;
	}


	@Override
	public String toString() {
		return "Quarto " + numeroQuarto + " - "+ estudante + ", " + celular;
	}


	public String getEstudante() {
		return estudante;
	}


	public void setEstudante(String estudante) {
		this.estudante = estudante;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public int getNumeroQuarto() {
		return numeroQuarto;
	}


	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}


}
