class Date{

	//Attributs
	private int annee;
	private int mois;
	private int jour;

	//Constructeurs
	public Date(int j,int m,int a){
		annee = a;
		mois = m;
		jour = j;
	}
	public Date(){
		annee = 2016;
		mois = 01;
		jour = 01;
	}
    
    //Getters
	public int getAnnee(){return annee;}
	public int getMois(){return mois;}
	public int getJour(){return jour;}

	//Setters
	public void setAnnee(int a){annee = a;}
	public void setMois(int m){mois = m;}
	public void setJour(int j){mois = j;}

	public String toString(){
		return this.jour + "/" + this.mois + "/" + this.annee;
	}

	public void afficher(){
		System.out.println(jour + "/" + mois + "/" + annee);
	}
}