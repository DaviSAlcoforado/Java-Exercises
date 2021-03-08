package main.java.biblioteca;
import java.util.*;

public class Catalogo extends Livro {
        private Map<Livro>livros = new Map<Livro>();

	public Livro getLivros(String isbn) {
		return livros;
	}

	public Livro getLivrosbyIsbn(String isbn) {
		return livros.get(isbn);
	}

	public void setLivros(Livro l1) {
		livros.put(l1);
	}

         
}