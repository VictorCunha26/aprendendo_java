<h1 align="center">Primeiros Exercícios Java</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven"/>
  <img src="https://img.shields.io/badge/STATUS-CONCLUÍDO-2ea44f?style=for-the-badge" alt="Status: Concluído"/>
</p>

<p align="center">
  Projeto de estudos com exercícios iniciais em Java, focado na prática de lógica de programação, entrada de dados e operações matemáticas.
</p>

---

## Sobre o projeto

O **aprendendo_java** é um repositório desenvolvido com foco na prática dos fundamentos da linguagem Java.

O projeto reúne exercícios simples executados via terminal, utilizando conceitos como variáveis, tipos de dados e leitura com `Scanner`.

Este repositório também serve como base de estudos para fixar lógica de programação e organização de classes independentes.

## Objetivos

- Praticar **fundamentos da linguagem Java**
- Trabalhar com **variáveis e tipos de dados**
- Utilizar **entrada de dados pelo terminal**
- Aplicar **operações matemáticas**
- Desenvolver **raciocínio lógico**
- Organizar exercícios em **classes separadas**

## Exercícios do projeto

| Classe | Descrição |
|---|---|
| `soma.java` | Lê dois números inteiros e exibe a soma. |
| `calculadoraSimples.java` | Lê dois números decimais e calcula soma, subtração, multiplicação, divisão e resto da divisão (com tratamento de divisão por zero). |
| `operacoesMatematicas.java` | Lê dois números decimais e calcula soma, subtração, multiplicação e divisão (com tratamento de divisão por zero). |
| `areaRetangulo.java` | Calcula a área de um retângulo a partir da base e da altura. |
| `perimetroRetangulo.java` | Calcula o perímetro de um retângulo a partir da base e da altura. |
| `conversaoTemperatura.java` | Converte uma temperatura de Celsius para Fahrenheit. |
| `conversaoIdade.java` | Converte a idade em anos para meses e dias. |
| `calculoSalario.java` | Calcula o salário bruto a partir do valor da hora e das horas trabalhadas. |
| `descontoEmProduto.java` | Calcula o valor do desconto e o valor final de um produto a partir de um percentual de desconto. |
| `mediaAritmetica.java` | Calcula a média aritmética de três notas. |
| `conumoMedio.java` | Calcula o consumo médio de combustível (km/l) a partir da distância percorrida e dos litros utilizados. |

## Tecnologias utilizadas

- **Java 17** (`maven.compiler.source` / `maven.compiler.target` definidos em `pom.xml`)
- **Maven** (gerenciamento de build e dependências)

## Estrutura do projeto

```
aprendendo_java-main/
└── exercicios/
    ├── pom.xml
    ├── src/
    │   └── main/
    │       └── java/
    │           └── br/
    │               └── senai/
    │                   ├── areaRetangulo.java
    │                   ├── calculadoraSimples.java
    │                   ├── calculoSalario.java
    │                   ├── conumoMedio.java
    │                   ├── conversaoIdade.java
    │                   ├── conversaoTemperatura.java
    │                   ├── descontoEmProduto.java
    │                   ├── mediaAritmetica.java
    │                   ├── operacoesMatematicas.java
    │                   ├── perimetroRetangulo.java
    │                   └── soma.java
    └── target/
        └── classes/          # Arquivos .class compilados
```

## Pré-requisitos

- JDK 17 ou superior
- Maven instalado

## Instalação

```bash
git clone <url-do-repositorio>
cd aprendendo_java-main/exercicios
```

## Como executar

Compile o projeto com Maven:

```bash
mvn compile
```

Execute uma classe específica (substitua `<NomeDaClasse>` pelo exercício desejado, por exemplo `soma`):

```bash
mvn exec:java -Dexec.mainClass="br.senai.<NomeDaClasse>"
```

Alternativamente, compile e execute diretamente com o JDK:

```bash
javac -d target/classes src/main/java/br/senai/<NomeDaClasse>.java
java -cp target/classes br.senai.<NomeDaClasse>
```

Cada programa solicita os dados via terminal (`Scanner`) e imprime o resultado do cálculo correspondente.

## Status do projeto

**Concluído**
