import java.util.Scanner;
class TestDate{
	public static void main(String[] args) {
		int j,m,a;
		String s;
		Scanner clavier = new Scanner(System.in)

		System.out.println("Entrez un jour, un mois et une année");
		j = clavier.nextInt();
		m = clavier.nextInt();
		a = clavier.nextInt();

		Date date1 = new Date();
		Date date2 = new Date(j,m,a)

		System.out.println("Test des Getters: ");
		System.out.println(date1.getJour());
		System.out.println(date1.getMois());
		System.out.println(date1.getAnnee());

		System.out.println("Test des Setters: ");
		System.out.print("Entrez de nouveau un jour: ")
		j = clavier.nextInt();
		System.out.println(date2.setJour(j));
		System.out.print("Entrez de nouveau un mois: ")
		m = clavier.nextInt();
		System.out.println(date2.setMois(m));
		System.out.print("Entrez de nouveau une annee: ")
		a = clavier.nextInt();
		System.out.println(date2.setAnnee(a));

		System.out.println("Test de la methode toString puis de l'affichage: ");
		s = date1.toString();
		System.out.println("La variable String s correspond a la chaine: " + s);
		date2.affichage();
	}
}