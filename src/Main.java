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
		System.out.println(p.calculerMoyenne());
		
		
	}

}
