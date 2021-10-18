package TD_PF_11_Octobre;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T>> implements Arbre<T>{

    private final List<Arbre<T>> fils;

    public Noeud(final List<Arbre<T>> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre<T> a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T val) {
        boolean rtr = false;
        for (final Arbre<T> a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }


    @Override
    public T somme() {
      if(fils==null) {
    	  return null;
      }
      if (fils.size()==0) {
    	  return null;
      }
      else {
    	  T v=fils.get(0).somme();
    	  for (int i=0;i<fils.size();i++) {
    		  v=v.sommer(fils.get(i).somme());
    	  }
      }
      return null;
    }

	@Override
	public T min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean estTrie() {
		// TODO Auto-generated method stub
		return false;
	}

  /*  @Override
    public T min() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = fils.get(0).min();
        for (int i = 1; i < fils.size(); i++) {
            int min = fils.get(i).min();
            if (min < rtr) {
                rtr = min;
            }
        }
        return rtr;
    }

    @Override
    public T max() {
        if (fils == null || fils.size() == 0)
            return null;
        int rtr = fils.get(0).max();
        for (int i = 1; i < fils.size(); i++) {
            int max = fils.get(i).max();
            if (max > rtr) {
                rtr = max;
            }
        }
        return rtr;
    }

    /**
     * un noeud de fils f1 ... fi ... fn est tri� ssi
     * <ol>
     * <li>&forall; i &in; 1..n, fi est tri�</li>
     * <li>&forall; i &in; 1..n-1, max(fi)<= min(fi+1)</li>
     * </ol>
     */
  /*  @Override
    public boolean estTrie() {
        return conditionTrie1() && conditionTrie2();
    }

    private boolean conditionTrie1() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            if (!fi.estTrie())
                return false;
        }
        return rtr;
    }

    private boolean conditionTrie2() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre<T>fi = fils.get(i);
            final Arbre<T> fj = fils.get(i+1);
                if (fi.max() > fj.min())
                    return false;
        }
        return rtr;
    }*/

	
    

    
}