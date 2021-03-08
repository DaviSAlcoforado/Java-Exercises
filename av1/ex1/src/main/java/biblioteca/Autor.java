package main.java.biblioteca;
import java.util.*;

public class Autor {
        private HashSet<String>obras  = new HashSet<String>();
        private String nome; 
        private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

        public void setObras(String obra) {
                if (this.obras.contains(tag) == false) {
                        obras.add(obra);
                }
        }
        public HashSet<String> getObras() {
                return obras;
        }     
}