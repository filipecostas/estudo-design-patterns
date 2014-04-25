package flpcostas.observer;

import java.util.Observable;
import java.util.Observer;

public class Observador implements Observer {

	private Observable observable;
	private String novaNotificacao;
	
	public Observador(Observable assunto) {
		observable = assunto;
		//este metodo registra o observador a ficar sabendo sobre atualizacoes
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		Assunto assunto = (Assunto)o;
		novaNotificacao = assunto.getNotificacao();	
		System.out.println(String.format("[Observador] Recebe notificacao... %s", novaNotificacao));
	}

}
