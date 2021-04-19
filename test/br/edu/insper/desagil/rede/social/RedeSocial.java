package br.edu.insper.desagil.rede.social;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RedeSocial {

	@Test
	public void test1() {
		Produto produto  = new Produto ("geladeira",1000.00);
		Usuario usuario = new Usuario ("Jean");
		
		usuario.postaVideos(0,produto);
		
		
		Video video = new Video(0,usuario,produto);
		
		video.adicionaAvaliacao(usuario, 0);
		video.adicionaAvaliacao(usuario, 6);
		
		assertEquals(0,video.mediaAvaliacoes());

		
	
		
		
	}
	public void test2() {
		Produto produto  = new Produto ("geladeira",1000.00);
		Usuario usuario = new Usuario ("Jean");
		Usuario usuario2 = new Usuario ("Joyce");
		
		usuario.postaVideos(1,produto);
		
		
		Video video = new Video(1,usuario,produto);
		
		video.adicionaAvaliacao(usuario2, 1);
		
		assertEquals(1,video.mediaAvaliacoes());
	}
	
	public void test3() {
		
		Produto produto  = new Produto ("geladeira",1000.00);
		Usuario usuario = new Usuario ("Jean");
		Usuario usuario2 = new Usuario ("Joyce");
		Usuario usuario3 = new Usuario ("Cintia");
		
		usuario.postaVideos(1,produto);
		
		
		Video video = new Video(1,usuario,produto);
		
		video.adicionaAvaliacao(usuario2, 1);
		video.adicionaAvaliacao(usuario3, 2);
		
		assertEquals(2,video.mediaAvaliacoes());
	}
	
	public void test4() {
		
		Produto produto  = new Produto ("geladeira",1000.00);
		Usuario usuario = new Usuario ("Jean");
		Usuario usuario2 = new Usuario ("Joyce");
		Usuario usuario3 = new Usuario ("Cintia");
		Usuario usuario4 = new Usuario ("Juninho");
		
		usuario.postaVideos(1,produto);
		
		
		Video video = new Video(1,usuario,produto);
		
		video.adicionaAvaliacao(usuario2, 1);
		video.adicionaAvaliacao(usuario3, 2);
		video.adicionaAvaliacao(usuario4, 2);
		
		assertEquals(2,video.mediaAvaliacoes());
	}
	
	public void test5() {
		Produto produto  = new Produto ("geladeira",1000.00);
		Usuario usuario = new Usuario ("Jean");
		Usuario usuario2 = new Usuario ("Joyce");
		Usuario usuario3 = new Usuario ("Cintia");
		Usuario usuario4 = new Usuario ("Juninho");
		
		usuario.postaVideos(1,produto);
		usuario.postaVideos(2,produto);
		
		
		Video video1 = new Video(1,usuario,produto);
		Video video2 = new Video(2,usuario,produto);
		
		video1.adicionaAvaliacao(usuario2, 1);
		video1.adicionaAvaliacao(usuario3, 2);
		video2.adicionaAvaliacao(usuario4, 2);
		
		assertEquals(4,usuario.totalAvaliacoes());
	}
}
