package TD_PF_11_Octobre;

public class Paire<A,B> implements IPaire<A, B>{
	private  A _fst;
	private  B _snd;
	
	public Paire(A _fst,B _snd) {
		this._fst=_fst;
		this._snd=_snd;
	}
	
	public String toString() {
		String reponse="";
		reponse+="("+_fst+","+_snd+")"+" :: Paire["+_fst.getClass().getSimpleName()+","+_snd.getClass().getSimpleName()+"]";
				
		return reponse;
		
		
		
	}

	@Override
	public A fst() {
		// TODO Auto-generated method stub
		return _fst;
	}

	@Override
	public B snd() {
		// TODO Auto-generated method stub
		return _snd;
	}

	@Override
	public <C> IPaire<C, B> changeFst(C value) {
		
		Paire<C, B> a=new Paire<C, B>(value,this._snd);
		
		return a;
	}

	@Override
	public <C> IPaire<A, C> changeSnd(C value) {
			Paire<A, C> a=new Paire<A, C>(this._fst,value);
		
		return a;
	}

	public B get_snd() {
		return _snd;
	}

}
