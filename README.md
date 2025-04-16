# Desafio Controle de Fluxo

Este repositório contém a solução para o **Desafio de Controle de Fluxo** proposto durante o módulo de Java da Digital Innovation One (DIO). O objetivo é aplicar os conceitos de estruturas condicionais, repetição e tratamento de exceções em Java.

## 📋 Descrição do Desafio

Implemente um sistema que receba **dois números inteiros como parâmetros via terminal**. A aplicação deve:

1. Validar se o **primeiro número** é **menor** que o **segundo número**.
2. Se a validação for bem-sucedida, o sistema deverá imprimir uma contagem no console de `1` até a **diferença entre os números**, como por exemplo:

Imprimindo o número 1 Imprimindo o número 2 ...


3. Caso o **primeiro número** seja **maior ou igual** ao segundo, o sistema deverá lançar uma **exceção customizada** chamada `ParametrosInvalidosException` com a seguinte mensagem:

O segundo parâmetro deve ser maior que o primeiro


## 🛠 Estrutura do Projeto

```
DesafioControleFluxo/
├── src/
│   ├── Contador.java
│   └── ParametrosInvalidosException.java
├── .gitignore
├── README.md
└── DesafioControleFluxo.iml
```

* Contador.java : Classe principal que contém o método main e a lógica da contagem.

* ParametrosInvalidosException.java: Classe de exceção customizada.

* README.md: Instruções e descrição do projeto.

## ▶️ Como Executar
1. Clone este repositório:

```
git clone https://github.com/LuizhBrandao/DesafioControleFluxo.git
cd DesafioControleFluxo
```

2. Compile o projeto (via terminal ou IDE):

```
javac src/*.java
```

3. Execute a aplicação passando dois parâmetros inteiros:

```
java src/Contador 5 10
```

Saída esperada:
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```

## 🧠 Conceitos Utilizados
* Estrutura de repetição for
* Condicionais if/else
* Tratamento de exceções
* Criação de exceções customizadas
* Entrada de dados via argumentos de linha de comando

## 👨‍💻 Desenvolvido por Luiz Brandão como parte dos estudos em Java com a DIO.


