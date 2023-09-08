package br.com.alexandremarcelino.academia.application.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.alexandremarcelino.academia.domain.aluno.Aluno.Sexo;
import br.com.alexandremarcelino.academia.domain.aluno.Aluno.Situacao;
import br.com.alexandremarcelino.academia.domain.aluno.Estado;
import br.com.alexandremarcelino.academia.domain.aluno.EstadoRepository;

@Stateless
public class DataService {
	
	@EJB
	private EstadoRepository estadoRepository;

	public List<Estado> listEstados() {
		List<Estado> estados = estadoRepository.listEstados();
		return estados;
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
	
	public Situacao[] getSituacoes() {
		return Situacao.values();
	}
}