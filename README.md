# spring-elastic

## Objetivo
- Essa aplicação  foi feita com o intuito de facilitar o entendimento de como utilizar o Elasticsearch juntamente com o Spring.

## Estrutura
Utilizamos nesse projeto uma estrutura de pastas bem comum ao desenvolver a aplicação como vai ser descrita abaixo:
- Repositories: É a camada da aplicação onde temos acesso a camada de comunicação com o elastic, como uma abstração usando o SpringData
- Documents: São as definições das entidades que iremos usar dentro do projeto
- Services: É a camada onde criaremos a lógica, e utilizamos tanto as definições do repository para ter acesso ao elastic como a classe definida em Documents
- Controller: É a camada onde receberemos as requisições  http e chamaremos os serviços  para executar determinada função.

## Como rodar?
- Para executar esse projeto é necessário ter o Docker e o docker-compose instalado, após a instalação basta rodar o comando abaixo:
```
docker-compose up

## Como testar a aplicação
- `POST`localhost:8080/api/audio
Body
```
{
	"name": "audio2",
	"duration": "2:20",
	"author":"Igor",
	"url":"url",
	"format":"mp4",
	"metaData":
	{
        "nb_streams": 1,
        "nb_programs": 0,
        "format_long_name": "MP2/3 (MPEG audio layer 2/3)",
        "start_time": "0.025057",
        "size": "12868682",
        "bit_rate": "192011",
        "probe_score": 51,
        "tags": {
            "major_brand": "dash",
            "minor_version": "0",
            "compatible_brands": "iso6mp41",
            "encoder": "Lavf57.56.101"
        }
    }
}
