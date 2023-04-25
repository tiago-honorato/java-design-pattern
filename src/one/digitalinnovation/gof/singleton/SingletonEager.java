package one.digitalinnovation.gof.singleton;


/*
 * Singleton "rapido".
 * @author Tiago H
 * */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getIntancia() {
		
		
		
		return instancia;
	}
}
