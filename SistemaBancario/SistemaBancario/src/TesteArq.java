import br.ufc.br.poo.banco.conta.*;
import br.ufc.br.poo.banco.persistencia.ArquivoConta;

import java.io.*;

public class TesteArq {
	public static void main(String[] args) {
	ArquivoConta teste = new ArquivoConta();
	ContaAbstrata conta = new Conta("1");
	teste.inserir(conta);
	conta = new Conta("2");
	teste.inserir(conta);
	conta = new Conta("3");
	teste.inserir(conta);
	return;
	}
}
