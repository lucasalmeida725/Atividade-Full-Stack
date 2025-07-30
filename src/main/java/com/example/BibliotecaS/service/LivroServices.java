package com.example.BibliotecaS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BibliotecaS.model.Livro;
import com.example.BibliotecaS.repository.LivroRepository;

@Service
public class LivroServices {

	private final LivroRepository livroRepository;

	@Autowired
	public LivroServices(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	public List<Livro> ListarTodos() {
		return livroRepository.findAll();
	}

	public Livro Adicionar(Livro livro) {
		return livroRepository.save(livro);
	}

	public Optional<Livro> buscar(Long id) {
		return livroRepository.findById(id);
	}

	public void Remover(Long id) {
		livroRepository.deleteAll();
	}

	public List<Livro> BuscarN(String titulo) {
		return livroRepository.findByTituloContainingIgnoreCase(titulo);
	}

	public List<Livro> BuscarT(String autor) {
		return livroRepository.findByAutorContainingIgnoreCase(autor);
	}

}
