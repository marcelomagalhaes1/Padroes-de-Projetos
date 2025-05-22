# Implementação do Padrão de Projeto Adapter - Sistema de Logística

## Visão Geral

A implementação do aplicação demonstrou o uso do padrão de projeto **Adapter** para integrar duas bibliotecas que não são compativéis: uma legada baseada em `String` e uma nova interface baseada em objetos `Vehicle`.

## Componentes

- `Vehicle`: classe que representa os dados de um veículo.
- `OldVehicleStorage`: classe legada que armazena dados como `String`.
- `IVehicleStorage`: nova interface orientada a objetos.
- `VehicleStorageAdapter`: adapta `IVehicleStorage` para funcionar com `OldVehicleStorage`.

## Funcionamento

O `VehicleStorageAdapter` implementa a interface `IVehicleStorage`, mas ao mesmo tempo internamente converte os dados do objeto `Vehicle` para uma `String` compatível com a classe legada `OldVehicleStorage`.

## Exemplo de uso

No método `main`, foi criado um objeto `Vehicle` e foi usado o adapter para salvar na biblioteca legada, demonstrando a compatibilidade obtida sem modificar a classe antiga.

## Desafios e Soluções

- **Desafio:** manter a compatibilidade com a biblioteca legada sem alterá-la.
- **Solução:** encapsular a lógica de conversão de dados no adapter.

## Conclusão

O padrão Adapter foi utilizado com sucesso para integrar duas bibliotecas de formatos diferentes, onde promoveu o uso de reusabilidade e aderência ao princípio de **aberto/fechado (OCP)**.
