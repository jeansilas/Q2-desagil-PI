package br.edu.insper.desagil.rede.social;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	
	public void postaVideos(Integer id, Produto produto) {
		Video video = new Video(id,this,produto);
		videos.add(video);
		
	}
	
	public Integer totalAvaliacoes() {
		Integer soma = 0;
		for( Video video: this.videos) {
			soma = soma + video.mediaAvaliacoes();
		}
		return soma;
	}
	
}
