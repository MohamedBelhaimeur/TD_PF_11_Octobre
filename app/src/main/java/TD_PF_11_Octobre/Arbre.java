package TD_PF_11_Octobre;

import java.util.Set;

public interface Arbre<T> {
	
	int taille(); // nombre de valeurs
	  boolean contient(T val); // vrai si val est contenue dans l'arbre,faux sinon
	  Set<T> valeurs(); // ensemble des valeurs différentes dans l'arbre
	 T somme(); // somme des valeurs
	  T min(); // valeur minimale
	  T max(); // valeur maximale
	  boolean estTrie(); // vrai si l'arbre est trié, faux sinon


}
