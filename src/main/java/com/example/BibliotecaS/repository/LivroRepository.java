package com.example.BibliotecaS.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BibliotecaS.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long> {
	 List<Livro> findByTituloContainingIgnoreCase(String titulo);
	 List<Livro> findByAutorContainingIgnoreCase(String autor);
	 
}
