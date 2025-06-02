# Sistema de Venda de Pacote de Viagens (Padrão Facade)

Este projeto em Java simula a venda de pacotes de viagens utilizando o padrão de projeto **Facade**, centralizando a comunicação com os diversos subsistemas envolvidos.

## ✈️ Funcionalidades

- **Reserva de Passagens Aéreas** com escolha de classe e assento.
- **Reserva de Hotel** com cálculo por tipo de quarto e número de pessoas.
- **Aluguel de Carro** com diferentes categorias.
- **Sistema de Pagamento** com cálculo de desconto ou acréscimo baseado na forma escolhida.
- Impressão de todos os dados da compra e dos clientes.

## 🧱 Padrão Utilizado

- **Facade**: A classe `PacoteViagemFacade` centraliza as operações dos subsistemas: `PassagemAerea`, `ReservaHotel`, `AluguelCarro` e `Pagamento`.

## 🛠️ Tecnologias

- Java puro (sem dependências externas)
- Paradigma de Programação Orientada a Objetos (POO)