package com.gabriel.estudos.faturas;

public class EmailSender {
	//aqui eu utilizaria alguma biblioteca para enviar e-mails
	public EmailSender(){
		System.out.println("Criou Enviador de e-mail!");
	}
	public void enviar(String to, String email){
		System.out.println("Enviando e-mail para: " + to + "\nConteúdo: " + email);
	}
}
