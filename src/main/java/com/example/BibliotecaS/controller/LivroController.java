package com.example.BibliotecaS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BibliotecaS.model.Livro;
import com.example.BibliotecaS.service.LivroServices;

@RestController
@RequestMapping("/livros")
@CrossOrigin(origins = "*")
public class LivroController {
	@Autowired
	
	private final LivroServices livroServices;

	public LivroController(LivroServices livroServices) {
		this.livroServices = livroServices;
	}
@GetMapping
	public List<Livro> ListarTodos() {
		return livroServices.ListarTodos();
	}

@PostMapping
public Livro adicionar(@RequestBody Livro livro) {
    return livroServices.Adicionar(livro);
}


	@DeleteMapping("/{id}")
	public void Remover(@PathVariable Long id) {
		livroServices.Remover(id);
	}

	@GetMapping("/{id}")
	public Optional<Livro> buscar(@PathVariable Long id) {
		return livroServices.buscar(id);
	}

	@GetMapping("buscar/autor")
	public List<Livro> BuscarT(@RequestParam String autor) {
		return livroServices.BuscarT(autor);
	}
@GetMapping("buscar/titulo")
	public List<Livro> BuscarN(@RequestParam String titulo) {
		return livroServices.BuscarN(titulo);
	}
}
