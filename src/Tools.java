
/**
 * Classe utilitaire
 * @author marvin
 */
public class Tools {
	
	// Méthode statique
	public static void saluer() {
		System.out.println("Wesh alors !");
	}
	
	// Méthode non statique
	public void remercier() {
		System.out.println("Merki");
	}
	
	// Appel des deux méthodes depuis une méthode non statique
	public void saluerEtRemercier() {
		saluer();
		remercier();
	}

}
