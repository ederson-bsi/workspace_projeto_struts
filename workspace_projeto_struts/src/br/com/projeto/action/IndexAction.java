package br.com.projeto.action;

import com.opensymphony.xwork2.Action;

public class IndexAction implements Action{

	@Override
	public String execute() throws Exception {
	
		System.out.println("teste de commit");
		System.out.println("segundo teste atualizano do git");
		System.out.println("terceiro teste agora clicando no push primeiro antes de cliclar no pull");
		System.out.println("novo teste");
		System.out.println("quarto teste");
		System.out.println("novo teste 2");
		return SUCCESS;
	}

}
