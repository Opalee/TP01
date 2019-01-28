import java.util.Scanner;

class TestPersonne{
  public static void main(String[] args) {
      String nom, prenom, civilite, t1;
      int age, poid;

      //L'utilisateur entre les valeurs de son objet Personne
      Scanner clavier = new Scanner(System.in);
      System.out.println("Entrez un nom et prenom: ");
      nom = clavier.nextLine();
      prenom = clavier.nextLine();
      System.out.println("Entrez votre civilite en tapant soit M. , Mme ou Mlle: ");
      civilite = clavier.nextLine();
      System.out.println("Entrez votre poids en kgs: ");
      poid = clavier.nextInt();
      System.out.println("Entrez votre age: ");
      age = clavier.nextInt();
      clavier.nextLine();
      System.out.println("Entrez votre taille en centimetres: ");
      t1 = clavier.nextLine();
      StringBuffer taille = new StringBuffer(t1);

      //Initialisation des objets
      Personne p1 = new Personne(nom, prenom, civilite, age, poid, taille),
      p2 = new Personne();

      //Affichage de p1
      p1.afficher();

      //Affichage de p2
      p2.afficher();
  }
}
