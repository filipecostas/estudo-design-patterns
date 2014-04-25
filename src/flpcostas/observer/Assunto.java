package flpcostas.observer;

import java.util.Observable;

public class Assunto extends Observable {
	
	private String notificacao;

	public String getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(String notificacao) {
		this.notificacao = notificacao;
		
		//usando o padrao do java, basta chamar setChanged() e notifyObservers()
		setChanged();
		notifyObservers();
	}
	
	
	
}
