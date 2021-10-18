package TD_PF_11_Octobre;

public class Chaine<T> implements Sommable<Chaine<T>>{
	private String valeur;
	
	public Chaine(String valeur) {
		this.valeur=valeur;
		
	}
	
	

	@Override
	public Chaine<T> sommer(Chaine<T> other) {
		// TODO Auto-generated method stub
		return new Chaine<T>(String.format("%s%s", this.valeur,other));
	}



	@Override
	public Chaine<T> compareTo(Chaine<T> other) {
		// TODO Auto-generated method stub
		return valeur.compareTo(other);
	}
	
	

}
