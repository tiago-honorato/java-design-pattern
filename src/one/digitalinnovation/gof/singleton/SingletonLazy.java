package one.digitalinnovation.gof.singleton;

/*
 * Singleton "lento".
 * @author Tiago H
 * */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {}
	
	public static SingletonLazy getIntancia() {
		
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		
		return instancia;
	}
}
