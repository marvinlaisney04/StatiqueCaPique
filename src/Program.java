
/**
 * Classe externe
 * @author marvin
 *
 */
public class Program {
	// Membre non statique
	int number = 10;
	
	// Membre statique
	static String nature = "Je suis un aigle royal !";
	
	/**
	 * Appel des membres depuis une méthode non statique
	 */
	public void showMembers() {
		System.out.println(number);
		System.out.println(nature);
	}

	/**
	 * Méthode main statique, invoqué automatiquement par Java
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Affichage de la variable non-statique number - ne fonctionne pas
//		System.out.println(number);
		
		// Possible mais inutile (détecté en warning)
		Tools outil = new Tools();
		outil.saluer();
		
		// Bonne utilisation des méthodes statiques de la classe Tools
		Tools.saluer();
		
		// Ne fonctionne pas, pourquoi ?
//		Tools.remercier();
		
		// Appel possible par instanciation
		outil.remercier();
		
		// Combinaison des méthodes statiques et non statiques en une.
		outil.saluerEtRemercier();
		
		// Appel de la méthode statique de la classe interne statique
		nestedClass.printNature();
		
	}
	
	/**
	 * Classe interne imbriquée
	 * @author marvin
	 *
	 */
	public static class nestedClass{
        public static void printNature() {
        	// Ne fontionne pas, impossible d'appeler un membre non statique de la classe externe depuis la classe interne
//            System.out.println(number);
            System.out.println(nature);
        }
	}

}
