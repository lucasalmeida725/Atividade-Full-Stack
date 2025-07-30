package com.example.BibliotecaS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	private String titulo;
	private String autor;
	private String isbn;
	
	public Livro() {}
	
	public Livro(String titulo,String autor,String isbn) {
		this.autor=autor;
		this.isbn=isbn;
		this.titulo=titulo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
}
