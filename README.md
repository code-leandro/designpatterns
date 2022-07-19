# Design Patterns - exemplos com Java
Este projeto tem como objetivo exibir exemplos de implementação de design patterns.

## Decorator pattern
É um padrão do tipo estrutural. Também conhecido como Wrapper, Envoltório, Decorador.

Com ele é possível acoplar novos comportamentos a um tipo de objeto sem alterar sua estrutura.

Podem ser adicionas novas funcionalidades através da decoração "em cascata" de um objeto.

Na implementação, é possível ver que no início temos Shape (forma) como interface, e depois as implementações de círculo e retangulo.

Posteriormente, deseja-se sem alterar as estrutura dessa classe, fornecer novos comportamentos a ela.

O ponto central da implementação é criar uma classe (que pode ser abstrata) que implementa a interface Shape e que possui um objeto do tipo Shape (na implementação chamei de `ShapeDecorator`).

Dessa forma, uma classe que estende `ShapeDecorator` será um decorador e irá referenciar o objeto que está envolvido em seu atributo.

Borda vermelha (RedShapeDecorator) que é uma nova característica (um novo comportamento) e implementa `ShapeDecorator`.

Preenchimento verde (`GreenFillDecorator`) é um outro comportamento que pode ser agregado.

Assim, é possível ter círculo com "comportamento" borda vermelha. E um retângulo com "comportamento" borda vermelha e também preenchimento verde.

Nesse último exemplo citado, a implementação ficou (ver na class Client.java):

```java
Shape circle = new Circle();
Shape circleBorderRed = new RedShapeDecorator(circle);
Shape circleBorderRedAndFillGreen = new GreenFillDecorator(circleBorderRed);
System.out.println("Circle with border red and filled green");
circleBorderRedAndFillGreen.draw();
```

Resultado:
```
Circle with border red and filled green
Shape: circle
Border Color: Red
Fill color: Green
```

## Facade pattern

É natural em alguns sistemas termos um determinado desafio a resolver: a partir de uma operação, é necessário realizar 
uma sequência de passos que envolvem a chamada de diversos services ou de até mesmo subsistemas para concluir tal operação.

Uma forma de padrão de projeto pra resolver esse problema é utilizando o pattern `Facade`.

É um padrão de projeto estrutural que fornece uma simplificação ou encapsulamento para chamada de 
bibliotecas, frameworks, ou qualquer conjunto complexo de classes.


Referências:
https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
