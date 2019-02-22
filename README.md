# Conversor de Moedas

O padrão [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217#Active_codes) estipula códigos de três letras para representar moedas. Por exemplo:

- Reais brasileiros: `BRL`
- Dólares americanos: `USD`
- Euro: `EUR`
- Pesos Chilenos: `CLP`

Utilize esta convenção de três letras para este exercício.

### Primeira versão

Implemente um conversor de moeda que funcione via terminal.

Entrada:

```
USD100 BRL
```

Saída:
```
BRL374.70
```

__Regras de negócio__

- O conversor não precisa suportar todas as moedas existentes. Adicione apenas algumas.
- Caso o usuário utilize uma moeda não suportada pelo conversor, exiba uma mensagem de erro.

Você escolhe se quer utilizar taxas de cambio reais ou fictícias. Caso queira utilizar valores reais, pode encontrá-los [aqui](https://www.x-rates.com/table/?from=BRL&amount=1).

__Orientação a objetos__

Para tentar praticar um pouco mais de Java e Orientação a Objetos, pense em como implementar esta versão utilizando as seguintes classes:
- Main
- Conversor
- Enum moeda
- Taxa de cambio

_Esta ideia não é obrigatória, é apenas uma sugestão._


### Segunda Versão

Permite que o usuário converta um valor para múltiplas moedas ao mesmo tempo

Entrada:

```
USD100 BRL CLP
```

Saída:

```
BRL374.70 CLP65113.50
```

### Terceira versão

Transforme o conversor implementado nas versões anteriores em uma aplicação web, que possa ser utilizada através de um browser. Nesta versão, ainda não precisamos pensar em formulários ou páginas HTML.

Implemente esta versão usando Spring.

Crie uma rota que recebe os seguintes parâmetros:
- `valor`: valor a ser convertido
- `para`: moedas para as quaus se quer converter o valor

Exemplo de uso:

Quando o usuário acessar no browser a url `localhost:8080/converter?valor=USD100&moedas=BRL,CLP`

A aplicação deve mostrar no browser os resultados das conversões:

```
BRL374.70
CLP65113.50
```

Não é necessário usar HTML, basta exibir o valor em texto simples.
