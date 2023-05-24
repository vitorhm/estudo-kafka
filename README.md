## Infográfico
https://whimsical.com/kafka-AHDxnMNhmP9Yxmc8z688p5

## Introdução
Projeto criado para testar a integração do Kafka com o Spring-boot e validar alguns conceitos e funcionamentos do Kafka.

## Schema Registry
Utilizado schema registry + Avro, sendo assim é definido um schema para serialização e desserialização das mensagens.

O schema está definido em src/main/resources e as classes são geradas durante a compilação do projeto. Durante o envio da mensagem, é construído a classe schema com os dados recebidos pelo DTO na request.

