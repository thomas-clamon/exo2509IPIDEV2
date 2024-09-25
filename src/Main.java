import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("veuiller saisir votre nom");
		String nom = sc.next();
		
		System.out.println("veuiller saisir votre prenom");
		String prenom = sc.next();
		
		System.out.println("veuiller saisir le jour de votre naissance");
		int jour = sc.nextInt();
		
		System.out.println("veuiller saisir le mois de votre naissance");
		int mois = sc.nextInt();
		
		System.out.println("veuiller saisir le année de votre naissance");
		int annee = sc.nextInt();
		
		
		Etudiant p = new Etudiant(nom, prenom, jour, mois, annee);
		
		boolean continuer = true;
		
		while (continuer) {
			System.out.println("voulez vous saisir une note oui / non");
			String valeur = sc.next();
			if (valeur.equals("non"))
				continuer = false;
			else
			{
				// on saisie le nom de la matiere
				System.out.println("veuillez saisir le libelle");
				String matiere = sc.next();
				
				// on saisie la note
				System.out.println("veuillez saisir la valeur");
				float note = sc.nextFloat();
				
				// on saisie la type
				System.out.println("veuillez choisir un type 1 TP; 2 Oral; 3 Devoir");
				int choix = sc.nextInt();
				TypeEval type = null;
				switch (choix) {
				
				case 1:
					type = TypeEval.TP;
					break;
				case 2:
					type = TypeEval.Oral;
				case 3:
					type = TypeEval.Devoir;
				default :
					type = TypeEval.Devoir;
				
				}
				// on cree la note
				Note n = new Note(matiere, note, type);
				p.ajouterNote(n);	
			}
			
		}
		System.out.println("la moyenne est de :" + p.calculerMoyenne());
		
		
		
		
	}

}
