package TD_PF_11_Octobre;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Noeud implements Arbre{
	private final List<Arbre>fils;
	
	private Noeud(List<Arbre>abr) {
		this.fils=abr;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		int cpt=0;
		for (final Arbre a: this.fils) {
			cpt=cpt+a.taille();
			
		}
		return cpt;
	}

	@Override
	public boolean contient(Integer val) {
		// TODO Auto-generated method stub
		for (final Arbre a: this.fils) {
			if(a.contient(val)) {
				return true;
			}
			
		}
		return false;
	}

	@Override
	public Set<Integer> valeurs() {
		// TODO Auto-generated method stub
		Set<Integer>valeurs = new TreeSet<>();
		for (final Arbre a: this.fils) {
			valeurs.addAll(a.valeurs());
		}
		return valeurs;
	}

	@Override
	public Integer somme() {
		int somme=0;
		// TODO Auto-generated method stub
		for (final Arbre a: this.fils) {
			somme=somme+a.somme();
		}
		return somme;
	}

	@Override
	public Integer min() {
		// TODO Auto-generated method stub
		TreeSet<Integer>valeurs = new TreeSet<>();
		for (final Arbre a: this.fils) {
			valeurs.add(a.min());
		}
		return valeurs.first();
	}

	@Override
	public Integer max() {
		// TODO Auto-generated method stub
		TreeSet<Integer>valeurs = new TreeSet<>();
		for (final Arbre a: this.fils) {
			valeurs.add(a.max());
		}
		return valeurs.last();
	}

	@Override
	public boolean estTrie() {
		// TODO Auto-generated method stub
		for (final Arbre a: this.fils) {
			if(a.estTrie()==false) {
				return false;
			}
		}
		return true;
	}

	

}
