# Questão 2

## Identifique cada uma das coleções usadas na questão anterior e a razao para adotá-la em detrimento das outras opções.

### Livro.autores:
LinkedHashSet, uma vez que mantém sempre a ordem de armazenamento.

### Livro.tags: 
HashSet, cujo a ordem não tem muita importância, mas a partir da minha checagem não permito que duplicadas entrem.

### Autor.obras:
HashSet, cujo a ordem não tem muita importância, mas a partir da minha checagem não permito que duplicadas entrem. 

### Catalogo.livros:
Map, pois, mapeio tudo que a classe tem, e a partir do isbn, usando o .get posso retorno o livro em questão.

