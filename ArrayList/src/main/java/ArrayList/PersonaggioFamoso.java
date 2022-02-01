package ArrayList;

public class PersonaggioFamoso {
	
	public PersonaggioFamoso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonaggioFamoso(String nome, String cognome, int premi) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.premi = premi;
	}
	String nome= null;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getPremi() {
		return premi;
	}
	public void setPremi(int premi) {
		this.premi = premi;
	}
	String cognome= null;
	int premi=0;

}
