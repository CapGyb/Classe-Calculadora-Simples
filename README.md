# Calculadora em Java

## Descrição
Este projeto consiste em uma calculadora simples desenvolvida em Java, capaz de realizar operações matemáticas básicas:

- Soma
- Subtração
- Multiplicação
- Divisão

O programa foi desenvolvido utilizando conceitos de Programação Orientada a Objetos (POO), com encapsulamento, controle de fluxo e tratamento de exceções.  
Ele funciona através de um menu interativo no terminal, onde o usuário escolhe a operação desejada.

---

## Funcionalidades

O programa possui as seguintes funcionalidades:

- Realizar soma entre dois números
- Realizar subtração entre dois números
- Realizar multiplicação entre dois números
- Realizar divisão entre dois números
- Verificação de divisão por zero
- Tratamento de erros de entrada
- Menu interativo com repetição
- Opção para encerrar o programa

---

## Estrutura do Projeto

O projeto possui duas classes principais:

### Classe Calculadora
Responsável por armazenar os números e realizar as operações matemáticas.

Atributos privados:
- numero1
- numero2

Métodos disponíveis:
- setNumero1(double numero1)
- setNumero2(double numero2)
- somar()
- subtrair()
- multiplicar()
- dividir()

A operação de divisão possui validação para impedir divisão por zero, lançando uma exceção quando necessário.

---

### Classe Main
Responsável pela execução do programa e interação com o usuário.

Principais recursos utilizados:
- Scanner para leitura de dados
- while para manter o programa em execução
- switch para seleção das operações
- try-catch para tratamento de erros

---

## Menu do Programa

Ao executar o programa, o seguinte menu será exibido:

===== CALCULADORA =====

1 - Soma

2 - Subtração

3 - Multiplicação

4 - Divisão

5 - Sair


O usuário escolhe uma opção e informa dois números para realizar o cálculo.

---

## Tratamento de Erros

O programa possui validações para evitar falhas durante a execução.

Divisão por zero:
Caso o usuário tente dividir por zero, o sistema exibirá a mensagem:

Erro: divisão por zero não é permitida.

Entrada inválida:
Caso o usuário digite um valor que não seja numérico, o sistema exibirá:

Erro: entrada inválida.

---

## Exemplo de Execução

===== CALCULADORA =====

1 - Soma

2 - Subtração

3 - Multiplicação

4 - Divisão

5 - Sair

Escolha uma opção: 1  
Digite o primeiro número: 10  
Digite o segundo número: 5  

Resultado: 15

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Tratamento de exceções (try-catch)
- Estruturas de controle (while e switch)

---

## Possíveis Testes (QA)

Caso de teste 1  
Entrada: 10 + 5  
Resultado esperado: 15

Caso de teste 2  
Entrada: 5 - 10  
Resultado esperado: -5

Caso de teste 3  
Entrada: 7 * 0  
Resultado esperado: 0

Caso de teste 4  
Entrada: 10 / 2  
Resultado esperado: 5

Caso de teste 5  
Entrada: 10 / 0  
Resultado esperado: erro de divisão por zero

Caso de teste 6  
Entrada: abc  
Resultado esperado: erro de entrada inválida

---

Projeto desenvolvido para atividade acadêmica relacionada a testes de software (QA) e programação em Java.
