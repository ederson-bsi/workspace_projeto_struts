package br.com.projeto.action;

import com.opensymphony.xwork2.Action;

public class IndexAction implements Action{

	@Override
	public String execute() throws Exception {
	
		System.out.println("teste de commit");
		System.out.println("segundo teste atualizano do git");
		return SUCCESS;
	}

}
