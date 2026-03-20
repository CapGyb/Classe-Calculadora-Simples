![Build Status](https://github.com/CapGyb/Classe-Calculadora-Simples/actions/workflows/actions.yaml/badge.svg)
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

---

## 🚀 Melhorias Implementadas

O projeto foi evoluído para seguir boas práticas de desenvolvimento e qualidade de software, incluindo:

- Estrutura padrão de projetos Java utilizando Maven:
  - `src/main/java`
  - `src/test/java`
- Separação entre código principal e testes
- Implementação de testes automatizados com JUnit 5
- Validação de operações através de testes unitários
- Pipeline de Integração Contínua (CI) com GitHub Actions
- Execução automática de testes a cada push no repositório
- Organização do projeto seguindo padrões de mercado

---

## 🧪 Testes Automatizados

Os testes foram implementados utilizando JUnit e cobrem os seguintes cenários:

- Operações básicas (soma, subtração, multiplicação e divisão)
- Validação de divisão por zero
- Resultados negativos
- Validação de comportamento esperado do sistema

Para executar os testes localmente (caso o Maven esteja instalado):

```bash
mvn clean test
```

---

## ⚙️ Integração Contínua (CI)

O projeto utiliza GitHub Actions para garantir a qualidade do código de forma automatizada.

A cada alteração enviada ao repositório:

- O ambiente é configurado automaticamente
- O projeto é compilado
- Os testes unitários são executados

Esse processo garante que o sistema esteja sempre funcional e ajuda a identificar erros rapidamente, evitando regressões no código.

O workflow está configurado para rodar automaticamente a cada `push`, validando o projeto sem necessidade de execução manual.

---

## 📁 Estrutura do Projeto

O projeto segue a estrutura padrão de aplicações Java utilizando Maven:
```
Classe-Calculadora-Simples/
├── .github/workflows/ # Configuração do GitHub Actions (CI)
├── src/
│ ├── main/java/com/calculadora/ # Código principal da aplicação
│ └── test/java/com/calculadora/ # Testes automatizados (JUnit)
├── pom.xml # Gerenciador de dependências e build (Maven)
└── README.md # Documentação do projeto
```

Essa organização facilita a manutenção, execução de testes e integração com ferramentas de automação, seguindo padrões amplamente utilizados no mercado.
