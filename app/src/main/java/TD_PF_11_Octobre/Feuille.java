package TD_PF_11_Octobre;

import java.util.Set;

public class Feuille implements Arbre{
	private int val;
	public Feuille(int val) {
		this.val=val;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean contient(Integer val) {
		// TODO Auto-generated method stub
		return val.equals(val);
	}

	@Override
	public Set<Integer> valeurs() {
		// TODO Auto-generated method stub
		return Set.of(val);
	}

	@Override
	public Integer somme() {
		// TODO Auto-generated method stub
		return val;
	}

	@Override
	public Integer min() {
		// TODO Auto-generated method stub
		return val;
	}

	@Override
	public Integer max() {
		// TODO Auto-generated method stub
		return val;
	}

	@Override
	public boolean estTrie() {
		// TODO Auto-generated method stub
		return true;
	}



}
