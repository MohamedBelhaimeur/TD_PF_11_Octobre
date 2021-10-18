package TD_PF_11_Octobre;

import java.util.Set;

public class Feuille<T> implements Arbre<T>{
	private T val;
	public Feuille(T val) {
		this.val=val;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean contient(T val) {
		// TODO Auto-generated method stub
		return val.equals(val);
	}

	@Override
	public Set<T> valeurs() {
		// TODO Auto-generated method stub
		return Set.of(val);
	}



	@Override
	public boolean estTrie() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Integer somme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer max() {
		// TODO Auto-generated method stub
		return null;
	}



}
