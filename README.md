# Sincronização de Processos com Lock Mutex em Java
## Descrição

Este projeto implementa um exemplo de **controle de concorrência utilizando lock mutex** em Java, com o objetivo de evitar problemas de acesso simultâneo a um recurso compartilhado.

A aplicação simula uma **conta bancária**, onde múltiplas threads (clientes) tentam realizar saques ao mesmo tempo. Para garantir a integridade do saldo, foi utilizado o mecanismo de **lock (`ReentrantLock`)**, assegurando exclusão mútua.

---

## Estrutura do Projeto

```
sincronizacaodeprocessos/
│
├── src/
│   ├── model/
│   │   ├── Conta.java
│   │   └── ContaBancaria.java
│   │
│   ├── thread/
│   │   └── Cliente.java
│   │
│   └── Main.java
│
├── .gitignore
└── README.md
```

---

## Tecnologias Utilizadas

* Java
* `java.util.concurrent.locks`
* Programação Multithread

---

## Como Executar

### 1. Compilar os arquivos

Dentro da pasta `src`:

```bash
javac Main.java
```

---

### 2. Executar o programa

```bash
java Main
```

---

## Funcionamento

### Lógica da Aplicação

* Uma conta bancária é compartilhada entre várias threads
* Cada thread tenta sacar um valor do saldo
* O acesso ao saldo é controlado por um **lock mutex**

---

### Uso do Lock Mutex

* Antes de acessar o saldo:
  
  ```
  lock.lock();
  ```

* Após finalizar a operação:

  ```
  lock.unlock();
  ```

Isso garante que **apenas uma thread por vez** execute a região crítica.

---

## Exemplo de Execução

```
Thread-1 vai sacar 500
Thread-1 sacou. Saldo restante: 500
Thread-2 vai sacar 500
Thread-2 sacou. Saldo restante: 0
Thread-3 tentou sacar, mas saldo insuficiente.
```

---

## Problema Evitado

Sem o uso de lock mutex, poderia ocorrer:

* Condição de corrida (_race condition_)
* Saldo inconsistente
* Execução simultânea indevida

---

## Conceitos Aplicados

* Threads em Java
* Região crítica
* Exclusão mútua
* `ReentrantLock` (Mutex)
* Sincronização de processos

---
