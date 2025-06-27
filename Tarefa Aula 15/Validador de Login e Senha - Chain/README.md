# Validador de Login e Senha com Chain of Responsibility

Este projeto em Java implementa um sistema de validação de login e senha utilizando o padrão de projeto **Chain of Responsibility**.

## ✅ Funcionalidades

- Verifica se o login está entre os cadastrados.
- Verifica se a senha contém:
  - Letra maiúscula
  - Letra minúscula
  - Caractere especial (@#$%&*)
  - Número
  - Sem sequência de 3 números consecutivos
  - Tamanho entre 8 e 16 caracteres

## 🔗 Sobre o padrão Chain of Responsibility

Este padrão permite passar uma solicitação por uma cadeia de objetos, onde cada objeto decide se processa a solicitação ou a passa adiante.

## 🧱 Estrutura

Cada validação é feita por uma classe que herda de `Handler`. Todas as validações são encadeadas.

## ▶️ Como Executar

1. Compile o código:
```bash
javac ValidadorLoginSenha.java
```

2. Execute:
```bash
java ValidadorLoginSenha
```

3. Siga o prompt para digitar login e senha.

## 👥 Logins permitidos

- admin
- valdir
- usuario