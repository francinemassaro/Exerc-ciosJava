package Exercicio5;

//5. Implemente a classe Operario como subclasse da classe Pessoa. Um determinado oper�rio
//tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorProducao
//(que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) e
//comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao
//vencimento base do oper�rio).

public class Pessoa {
	
//1-Criar a classe e criar atributos
public String nome;
public String setorDeTrabalho;

	
//2-Criar o construtor:
public Pessoa (String nome, String setorDeTrabalho)
{
	this.nome=nome;
	this.setorDeTrabalho=setorDeTrabalho;
}

//3-Criar m�todos	
//4-Trazer getters and setters


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getSetorDeTrabalho() {
	return setorDeTrabalho;
}


public void setSetorDeTrabalho(String setorDeTrabalho) {
	this.setorDeTrabalho = setorDeTrabalho;
}

	

}
