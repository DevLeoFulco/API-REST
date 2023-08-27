# API-Rest Tanque Cheio
#TanqueCheio - Controle de Abastecimento API REST

O projeto TanqueCheio é uma API REST para controle de abastecimento de veículos que retorna informações sobre o tipo de combustível abastecido, valor abastecido, endereço do posto e quantidade no tanque do veículo. Ele foi desenvolvido em Java utilizando o framework Spring Boot.

#Como Usar
##Pré-requisitos

Certifique-se de ter o Java 11 e o Spring Boot 2.5.4 instalados em seu ambiente de desenvolvimento.

##Configuração

1. Clone o repositório para o seu ambiente de desenvolvimento:
`git clone https://github.com/seu-usuario/TanqueCheio.git`

2.Abra o projeto em sua IDE favorita.

3.Execute a classe TanqueCheioApplication.java para iniciar o servidor.

#Rotas da API

Obter Informações de Abastecimento
**Endpoint:** /posto
**Método:** GET
**Descrição:** Retorna uma lista de informações de abastecimento, incluindo detalhes sobre o posto de combustível e o veículo.
**Exemplo de Resposta:**
```
[
  {
    "id": 1,
    "name": "Leandresson Fulco",
    "modeloVeiculo": "HRV",
    "valorAbastecido": 150.00,
    "qtdNoTanque": 50.5,
    "postocomb": {
      "id": 1,
      "nomePosto": "Posto Ipiranga",
      "endPosto": "Rua dos Navegantes, 5001 - Boa Viagem",
      "tipoCombustivel": "Gas Natural",
      "precoGasCom": 5.78,
      "precoGasAdtv": 5.89,
      "precoAlcool": 3.49,
      "precoDieselComum": 3.01,
      "precoDieselS10": 3.12,
      "precoGasNatural": 2.10
    }
  }
]
```

##Contribuindo
Sinta-se à vontade para contribuir com este projeto. Você pode abrir problemas (issues) ou enviar solicitações de pull request para melhorar a API ou adicionar novos recursos.


