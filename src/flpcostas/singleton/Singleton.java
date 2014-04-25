package flpcostas.singleton;

public class Singleton {

	private static Singleton uniqueInstance;
	
	private Singleton(){
		
	}
	
	/**
	 * Utilizar synchronized para garantir que existira uma unica instancia.
	 * @see : Observar que quando a instancia for muito requerida nao deve utilizar 
	 * o synchronized
	 * 
	 * @return : Singleton
	 */
	public static synchronized Singleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
