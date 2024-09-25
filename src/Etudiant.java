import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Etudiant {

	private String nom;
	private String prenom;
	private LocalDate date_naissance;
	private List<Note> list_note;
	
	public void ajouterNote (Note n) {
		list_note.add(n);
	}
	
	public float calculerMoyenne() {
		float sum = 0;
		for (int i = 0; i<list_note.size(); i++ ) {
			// on va recuperer chaque notes.
			sum += list_note.get(i).getValeur();
		}
		return sum/list_note.size();
	}
	
 	public int calculerAge() {
		// Faire la difference entre la date d'aujourd'hui 
		// et la date de naissance.
		
		return Period.between(date_naissance, LocalDate.now()).getYears();
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param date_naissance
	 */
	public Etudiant(String nom, String prenom, LocalDate date_naissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.list_note = new ArrayList();
	}
	
	public Etudiant (String nom,
			String prenom,
			int jour,
			int mois, 
			int annee) {
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = LocalDate.of(annee, mois, jour);
		this.list_note = new ArrayList();
			
	}
	public String toString() {
		return prenom + " " + nom + " "+ calculerAge() + " ans";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(LocalDate date_naissance) {
		this.date_naissance = date_naissance;
	}
	
	

}
