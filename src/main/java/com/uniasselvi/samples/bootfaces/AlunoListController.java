package com.uniasselvi.samples.bootfaces;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope (value = "session")
@Component (value = "alunoList")
@ELBeanName(value = "alunoList")
@Join(path = "/", to = "/aluno-list.jsf")

public class AlunoListController {

	@Autowired
	private AlunoRepository alunoRepository;

	private List<Aluno> alunos;

	@Deferred
	@RequestAction
	@IgnorePostback
	public void loadData() {
		alunos = alunoRepository.findAll();
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
}
