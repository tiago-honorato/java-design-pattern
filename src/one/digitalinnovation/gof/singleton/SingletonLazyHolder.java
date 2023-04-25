package one.digitalinnovation.gof.singleton;

/*
 * Singleton "Lazy holder".
 * @author Tiago H
 * */
public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		
	}
	
	private SingletonLazyHolder() {}
	
	public static SingletonLazyHolder getIntancia() {
		
		
		
		return InstanceHolder.instancia;
	}
}
