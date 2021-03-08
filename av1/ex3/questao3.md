# Questão 3

## O Java oferece quatro modificadores de acesso para métodos e atributos de classes. Explique a diferença e as aplicações de cada um deles.

## Resposta: 
Default: Usa-se quando não ocorre a definição de public, private ou protected. Quando utilizado, deixa com que qualquer classe, subclasse ou não-subclasse o acesse, contanto que esteja no mesmo pacote.

Public: É o modificador de acesso menos restritivo de todos. Basicamente, permite que o o método, atributo ou classe, seja acessado por qualquer outra classe, subclasse ou até não-subclasse dentro ou fora do mesmo pacote.

Protected: Qualquer classe, subclasse ou interface dentro do mesmo pacote, ou até mesmo qualquer classe que for derivada e esteja em outro pacote pode acessar o que está com o modificador protected.

Private: É o modificador de acesso mais restritivos de todos. Apenas os membros que estão na mesma classe podem acessar algo que está com o modificador private.
