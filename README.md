<<<<<<< HEAD
<<<<<<< HEAD
## Getting Started
=======
# Java Password Validator
>>>>>>> 82ae3089d160370fca69099776b1af8ec89875eb

Validador de senhas desenvolvido em Java, criado como exercício de estruturas condicionais e de repetição. O programa recebe uma senha do usuário e verifica se ela atende a critérios mínimos de segurança, retornando um feedback detalhado sobre quais regras não foram cumpridas.

## Funcionalidades

- Verificação de comprimento mínimo (8 caracteres)
- Verificação de presença de letra maiúscula
- Verificação de presença de letra minúscula
- Verificação de presença de número
- Verificação de presença de caractere especial
- Retorno de mensagem detalhada informando exatamente quais critérios não foram atendidos

## Regras de validação

Uma senha é considerada válida quando contém, ao mesmo tempo:

| Critério | Regra |
|---|---|
| Comprimento | Mínimo de 8 caracteres |
| Letra maiúscula | Pelo menos 1 (A-Z) |
| Letra minúscula | Pelo menos 1 (a-z) |
| Número | Pelo menos 1 (0-9) |
| Caractere especial | Pelo menos 1 (ex: !@#$%&*) |

## Como executar

<<<<<<< HEAD
The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
=======
# java-password-validator
>>>>>>> 1a7e211d0116a52e0022b6e4914ffdf162f097f0
=======
Pré-requisito: [JDK](https://www.oracle.com/java/technologies/downloads/) instalado (versão 8 ou superior).

```bash
# Clone o repositório
git clone https://github.com/matheuscrzs/java-password-validator.git
cd java-password-validator

# Compile
javac App.java

# Execute
java App
```

## Exemplo de uso

```
Digite sua Senha:
abc123

Sua senha é inválida pelos seguintes motivos:
- Falta pelo menos uma letra maiúscula.
- Falta pelo menos um caractere especial.
```

```
Digite sua Senha:
Senha@2026

Sua senha segue os padrões!
```

## Tecnologias utilizadas


- Java
- `java.util.Scanner` para entrada de dados
- Estruturas condicionais (`if`/`else`) e de repetição (`for`)

## O que aprendi com este projeto

- Manipulação de strings caractere por caractere (`toCharArray()`, `Character.isUpperCase()`, `Character.isDigit()`, etc.)
- Boas práticas de retorno antecipado (early return)
- Diferença entre variáveis de instância e variáveis locais
- Organização de mensagens de erro para melhorar a experiência do usuário

## Autor

Desenvolvido por [Matheus da Cruz da Silva](https://github.com/matheuscrzs).
>>>>>>> 82ae3089d160370fca69099776b1af8ec89875eb
