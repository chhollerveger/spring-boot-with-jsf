package com.uniasselvi.samples.bootfaces;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String nome;

	@Column
	private String curso;

	protected Aluno() {
	}

	public Aluno(String nome, String curso) {
		this.nome = nome;
		this.curso = curso;
	}
}
