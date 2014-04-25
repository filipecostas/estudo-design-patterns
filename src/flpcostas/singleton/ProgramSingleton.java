package flpcostas.singleton;

/**
 * Padrao Singleton
 * *******************
 * 
 * O padrao Singleton permite criar objetos unicos 
 * para os quais há apenas uma instancia.
 * 
 * 
 * @author Filipe
 *
 */
public class ProgramSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}

