package main.java.biblioteca;
import java.util.*;

public class Livro 
{
        private LinkedHashSet<String>autores  = new LinkedHashSet<String>();
        private HashSet<String>tags  = new HashSet<String>();
        private String titulo;
        private String isbn;

        public void setAutores(String autor) {
                autores.add(autor);
        }
        public LinkedHashSet<String> getAutores() {
                return autores;
        }        
        public void setTags(String tag) {
                if (this.tags.contains(tag) == false) {
                        tags.add(tag);
                }
        }
        public HashSet<String> getTags() {
                return tags;
        }     
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}