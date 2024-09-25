import java.time.LocalDate;

public class Note {
	
	private String matiere;
	private float valeur;
	private LocalDate date;
	private TypeEval type;
	/**
	 * @param matiere
	 * @param valeur
	 * @param date
	 * @param type
	 */
	public Note(String matiere, float valeur, LocalDate date, TypeEval type) {
		super();
		this.matiere = matiere;
		this.valeur = valeur;
		this.date = date;
		this.type = type;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public float getValeur() {
		return valeur;
	}
	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public TypeEval getType() {
		return type;
	}
	public void setType(TypeEval type) {
		this.type = type;
	}
	
	
	
	
	

}
