package br.ufc.br.poo.banco.persistencia;

import br.ufc.br.poo.banco.conta.ContaAbstrata;

import java.io.*;

public class ArquivoConta implements IRepositorioConta{
	
	
    private File diretorio;
	
	public ArquivoConta(){
		this.diretorio = new File("Repositorio Contas");
		diretorio.mkdir();
	}
	public void inserir(ContaAbstrata conta){
		File arconta = new File(diretorio,conta.getNumero()+".txt");
	    try {
	       PrintWriter gravador = new PrintWriter(arconta);
	        gravador.println("numero: " + conta.getNumero());
	        gravador.println("saldo: " + conta.getSaldo()+'\n');
	        gravador.close();
	      } catch (IOException ioe) {
	        ioe.printStackTrace();
	      }
	}

	public void remover(String numero){
		
	}

	public ContaAbstrata procurar(String numero){
		
	}

	public ContaAbstrata[] listar(){
		
	}

	public int tamanho(){
		
	}
	
}
