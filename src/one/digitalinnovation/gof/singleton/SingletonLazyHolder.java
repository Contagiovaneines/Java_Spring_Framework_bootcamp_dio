package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @author Giovane
 *
 */
public class SingletonLazyHolder {

	private static class InstanciaHolder {
	private static SingletonLazyHolder  instancia = new SingletonLazyHolder();
	}
	
	public SingletonLazyHolder() {
		super();
	}
	public static SingletonLazyHolder getInstancia() {
					
		return InstanciaHolder.instancia;
	}
}
