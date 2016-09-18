package com.gabriel.estudos.faturas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fatura {

	private String emailDevedor;
	private double valor;
	private LocalDate dataVencimento;
	public Fatura(String emailDevedor, double valor, LocalDate dataVencimento) {
	
		this.emailDevedor = emailDevedor;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	public String getEmailDevedor() {
		return emailDevedor;
	}
	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String resumo(){
		String data = this.dataVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return "Fatura para: " + this.emailDevedor + "\nValor: " + this.valor + "\nData de vencimento: " + data;
	}
	
}
