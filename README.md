# Consumindo API ViaCep - Spring, Feign e Gradle

Este serviço é uma integração com a API da ViaCep usando o Spring, Feign e Gradle.

O serviço conta com:
- Tratamento das exceções (CEP inválido, CEP não encontrado);
- Tratamento da entrada do cep - a API só aceita 8 caracteres e tem de ser dígitos.

&nbsp;
# Como rodar e testar o software
### OPÇÃO 1
&emsp;Run da própria IDE

### OPÇÃO 2

    $ ./gradlew bootRun

&emsp;** _Para parar o serviço usar o CTRL + C_

### OPÇÃO 3

    $ ./gradlew build

    $ java -jar build/libs/viaCep-0.0.1-SNAPSHOT.jar

&emsp;** _Para parar o serviço usar o CTRL + C_

### OPÇÃO 4

    $  ./gradlew run --args='br.com.octopus.viaCep.ViaCepApplication'


&emsp;** _Para parar o serviço usar o CTRL + C_

Lembrando que, para executar o último comando, o plugin application deve estar configurado no seu arquivo build.gradle. Aqui está um exemplo de como configurá-lo:

    plugins {
        id 'application
    }

    application {
        mainClass = 'br.com.octopus.viaCep.ViaCepApplication' 
    }

&nbsp;
# GET - consultaCep

  exibe as informações correspondentes ao cep informado;

    http://localhost:8080/cep/consulta/{cep}

EXEMPLO:

Request

    GET     localhost:8080/cep/consulta/81280-340

Response

    {
      "cep": "81280-340",
	  "logradouro": "Rua Deputado Heitor Alencar Furtado",
	  "bairro": "Cidade Industrial",
	  "localidade": "Curitiba",
	  "uf": "PR",
	  "ibge": "4106902",
	  "gia": "",
	  "ddd": "41",
	  "siafi": "7535"   
    }
