class Date{

	//Attributs
	private int annee;
	private int mois;
	private int jour;

	//variable
	static int test=0;

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
	public void setJour(int j){jour = j;}

	public String toString(){
		return this.jour + "/" + this.mois + "/" + this.annee;
	}

	public void afficher(){
		System.out.println(jour + "/" + mois + "/" + annee);
	}

	public boolean estBissextile(int annee){
		boolean verif=false;
		if(annee%4==0 && annee%100!=0){
			verif =true;
		}
		return verif;
	}

	public int compteJours(){
		int jour=0;
		if(this.getMois()==2){
			if(this.estBissextile(this.getAnnee())){
				jour=29;
			}
			else{jour=28;}}
		else{
			if(this.getMois()>7){
				if (this.getMois()%2==0) {
					jour=31;
				}
				else{
					jour=30;
				}
			}
			else{
				if (this.getMois()%2!=0) {
					jour=31;
				}
				else{
					jour=30;
				}
			}
		}
		return jour;
	}

	public boolean estValide(){
		boolean verif=false;

		if(this.getMois() > 0 && this.getMois() < 13){
			test++;
		}
		if(this.compteJours()==this.getJour()){
			test++
		}
		return verif;
	}

	//Cette methode est privee car il s'agit d'une methode de classe (justification oubliee sur le site)
	private void corrige(){
		if(test == 0){
			this.setMois(1);
		}
		else if(test == 1){
			this.setJour(1);
		}
	}
}
