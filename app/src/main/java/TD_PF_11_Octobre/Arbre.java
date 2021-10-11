package TD_PF_11_Octobre;

import java.util.Set;

public interface Arbre {
	
	int taille(); // nombre de valeurs
	  boolean contient(final Integer val); // vrai si val est contenue dans l'arbre,faux sinon
	  Set<Integer> valeurs(); // ensemble des valeurs diff�rentes dans l'arbre
	  Integer somme(); // somme des valeurs
	  Integer min(); // valeur minimale
	  Integer max(); // valeur maximale
	  boolean estTrie(); // vrai si l'arbre est tri�, faux sinon


}
