# Java Password Validator

Validador de senhas desenvolvido em Java, criado como exercício de estruturas condicionais e de repetição. O programa recebe uma senha do usuário, verifica se ela atende a critérios mínimos de segurança e calcula uma pontuação que classifica sua força em 5 níveis, retornando um feedback detalhado sobre quais regras não foram cumpridas.

## Funcionalidades

- Verificação de comprimento mínimo (8 caracteres)
- Verificação de presença de letra maiúscula
- Verificação de presença de letra minúscula
- Verificação de presença de número
- Verificação de presença de caractere especial
- Retorno de mensagem detalhada informando exatamente quais critérios não foram atendidos
- Sistema de pontuação que avalia a força da senha com base na quantidade de cada tipo de caractere
- Classificação da força da senha em 5 níveis: Fraca, Moderada, Forte, Muito forte e Excelente

## Regras de validação

Uma senha é considerada válida quando contém, ao mesmo tempo:

| Critério | Regra |
|---|---|
| Comprimento | Mínimo de 8 caracteres |
| Letra maiúscula | Pelo menos 1 (A-Z) |
| Letra minúscula | Pelo menos 1 (a-z) |
| Número | Pelo menos 1 (0-9) |
| Caractere especial | Pelo menos 1 (ex: !@#$%&*) |

## Sistema de pontuação

Além da validação básica, o programa calcula uma pontuação com base na quantidade de cada tipo de caractere presente na senha:

| Quantidade | Maiúsculas | Minúsculas | Números | Especiais |
|---|---|---|---|---|
| Nível 1 | 2 → 1 ponto | 7 → 1 ponto | 2 a 3 → 1 ponto | 2 → 1 ponto |
| Nível 2 | 3 → 2 pontos | 8 → 2 pontos | — | 3 → 2 pontos |
| Nível 3 | 4+ → 4 pontos | 9+ → 4 pontos | 4+ → 4 pontos | 4+ → 4 pontos |

A soma desses pontos define a força final da senha:

| Pontuação | Classificação |
|---|---|
| 0 a 2 | Fraca |
| 3 a 5 | Moderada |
| 6 a 9 | Forte |
| 10 a 12 | Muito forte |
| 13 a 16 | Excelente |

## Como executar

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

Sua senha precisa de ao menos uma letra maiúscula !
Sua senha precisa de ao menos um caractere especial ! (Ex: @, #, _, &).
Senha invalida, não atende os requisitos de segurãnça.
Senha Fraca
``` 