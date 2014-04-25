package flpcostas.observer;

/**
 * Padrao Observer
 * *******************
 * 
 * O padrao Observer consiste basicamente em:
 * Existir um ou mais OBSERVADORES que desejem se registrar para serem notificados
 * sobre uma atualizacao de dados de um ASSUNTO.
 * Toda vez que um dado do ASSUNTO e atualizado, o OBSERVADOR recebe a mensagem.
 * 
 * O OBSERVADOR pode deixar de receber as atualizacoes do ASSUNTO no momemto que achar
 * conveniente.
 * 
 * Existe uma relacao de UM PARA MUITOS entre ASSUNTO e OBSERVADOR.
 * Existe um ASSUNTO para um ou mais OBSERVADORES.
 * 
 * 
 * @author Filipe
 *
 */
public class ProgramObserver {

	public static void main(String[] args) {
		
		String notificacao = "Minha notificacao!!!";
		
		Assunto assunto = new Assunto();
		new Observador(assunto);
		
		//ao atualizar um dado de um ASSUNTO, o OBSERVADOR ja recebe a notificacao
		//se estiver registrado...
		assunto.setNotificacao(notificacao);
	}
}
