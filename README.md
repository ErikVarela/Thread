# 🚗 Simulação de Carro com Thread e Abastecimento em Java

Este repositório contém uma simulação de veículos rodando com consumo de combustível em tempo real, utilizando **Threads em Java**. O projeto é centrado na classe `Carro`, que roda continuamente enquanto consome combustível, interagindo com uma `BombaCombustivel` para abastecimento automático.

## 🎯 Objetivo

Demonstrar, de forma prática, o uso de **concorrência e multithreading** em Java, além da simulação de interação entre objetos (`Carro` e `BombaCombustivel`), com foco em:
- Gerenciamento de estado do combustível
- Ações baseadas em condições (ex: abastecer quando tanque <= 10L)
- Execução paralela com `Thread.sleep()` e `run()`

## 🧩 Componentes principais

### `Carro`
Classe que estende `Thread` e simula:
- Um veículo com consumo gradual de combustível
- Identificação por `modelo` e `idCar`
- Comportamento autônomo com chamadas à bomba de combustível quando o nível estiver baixo

### `BombaCombustivel` (não exibida aqui)
Responsável por reabastecer o carro quando solicitado. Deve conter lógica sincronizada para evitar conflitos de acesso caso múltiplos carros estejam rodando simultaneamente.

## 🔁 Lógica de Execução

1. O carro inicia com o tanque cheio (40 litros)
2. A cada 500ms, consome 1 litro
3. Quando atinge 10 litros ou menos, aciona o abastecimento automático
4. O processo continua até o combustível chegar a zero

## 💻 Tecnologias Utilizadas

- Java 8+
- Programação Orientada a Objetos (POO)
- Multithreading com `Thread`
- Controle de concorrência com `synchronized` (esperado na `BombaCombustivel`)

## 📌 Exemplo de Saída no Console

Fusca COMEÇOU A RODAR!  
Fusca - 1 - 40 l  
...  
Fusca PRECISA ABASTECER!  
Fusca abastecido com sucesso.  
...  
Fusca FICOU SEM COMBUSTÍVEL!

## 🚀 Como Executar

1. Compile o projeto com `javac *.java`
2. Execute a classe principal que instancia os objetos `Carro` e `BombaCombustivel`
3. Observe o comportamento dos veículos no console

## 🧠 Aprendizados

Este projeto reforça conhecimentos sobre:
- Criação e controle de threads em Java
- Simulação de comportamentos assíncronos
- Encapsulamento e comunicação entre objetos

## 📄 Licença

Este projeto é livre para fins educacionais e está sob a licença MIT.

---

**Autor:** [Erik Varela]  
**LinkedIn:** [https://linkein.com/in/erikvarela]  
**GitHub:** [https://github.com/ErikVarela]
