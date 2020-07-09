package com.uniasselvi.samples.bootfaces;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "alunoController")
@ELBeanName(value = "alunoController")
@Join(path = "/aluno", to = "/aluno-form.jsf")

public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;

	private Aluno aluno = new Aluno();

	public String save() {
		alunoRepository.save(aluno);
		aluno = new Aluno();
		return "/aluno-list.xhtml?faces-redirect=true";
	}

	public Aluno getAluno() {
		return aluno;
	}
}
