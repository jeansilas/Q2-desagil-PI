package br.edu.insper.desagil.rede.social;

import java.util.HashMap;

public class Video {
	private Integer id;
	private Usuario usuario;
	private Produto produto;
	private HashMap<String,Integer> avaliacoes;
	
	public Video(Integer id, Usuario usuario, Produto produto) {

		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}

	public Integer getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void adicionaAvaliacao(Usuario usuario, Integer id) {
		String nome = usuario.getNome();
		String nomePropietario = this.usuario.getNome();
		
		if (nomePropietario != nome & id >= 1 & id <= 5) {
			this.avaliacoes.put(nome, id);
		}
	
		
	}
	
	public Integer mediaAvaliacoes( ) {
		Double soma = 0.0;
		for (Integer id: this.avaliacoes.values()) {
			soma = id + soma;
		}
		double media = (double) soma/this.avaliacoes.size();
		int media2 = (int) Math.round(media);
		return (Integer) media2;
	}	
}
