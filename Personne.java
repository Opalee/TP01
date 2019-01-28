class Personne{

	//Attributs
	private String nom;
	private String prenom;
	private String civilite;
	private int age;
	private int poids;
	private StringBuffer taille;

	//Constructeurs
	public Personne (String n, String p, String c, int a, int po, StringBuffer t){
		nom=n;
		prenom=p;
		civilite=c;
		age=a;
		poids=po;
		taille=t;
	}

	public Personne(){
		nom="Smith";
		prenom="Jhon";
		civilite="M.";
		age=30;
		poids=65;
		taille= new StringBuffer("175");
	}

	//Getters
	public String getNom(){return nom;}
	public String getPrenom(){return prenom;}
	public String getCivilite(){return civilite;}
	public int getAge(){return age;}
	public int getPoids(){return poids;}
	public StringBuffer getTaille(){return taille;}

	//Setters
	public void setNom(String n){nom=n;}
	public void setPrenom(String p){prenom=p;}
	public void setCivilite(String c){civilite=c;}
	public void setAge(int a){age=a;}
	public void setPoids(int po){poids= po;}
	public void setTaille(StringBuffer t){taille=t;}

	//ToString
	public String toString(){
		this.prenom = this.prenom.substring(0,1).toUpperCase() + this.prenom.substring(1).toLowerCase();
		return this.civilite + " " + this.prenom + " " + this.nom.toUpperCase() + " : " +
		this.age + " ans, " + this.taille.insert(1,'m')+ ", " + this.poids +"kg";
	}

	//Affichage
	public void afficher(){
		System.out.println(this.toString());
	}
}
