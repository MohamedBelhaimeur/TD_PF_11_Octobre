package TD_PF_11_Octobre;

public class Entier<T> implements Sommable<Entier<T>> {
	
	private int valeur;
	
	public Entier(int valeur) {
		this.valeur=valeur;
		
	}

	@Override
	public Entier<T> sommer(Entier<T> other) {
		// TODO Auto-generated method stub
		
		return new Entier<T>(other+this.valeur);
	}

	@Override
	public Entier<T> compareTo(Entier<T> other) {
		// TODO Auto-generated method stub
		
	}
	
}
