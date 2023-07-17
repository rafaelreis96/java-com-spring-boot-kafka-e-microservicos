# Java com Spring Boot, Kafka e Microserviços

Conteúdo prático do curso

https://www.udemy.com/course/java-spring-boot-kafka-microservicos

## Exemplos para execução
<b>Criar Owner</b>
<pre>
http://localhost:8085/owner</pre>
<pre>
{
    "name": "Rafael",
    "type": "Profissional",
    "contactNumber": "999-888-999"
}
  </pre>

</br>Criar Post</b>
<pre>
http://localhost:8085/api/car/post
</pre>
<pre>
{
    "model": "Corolla",
    "brand": "Toyota",
    "price": "100000",
    "description": "semi-novo",
    "engineVersion": "2.0",
    "city": "Sao Paulo",
    "createdDate": "",
    "ownerId": "1",
    "ownerName": "Rafael",
    "ownerType": "Professional",
    "contact": "999-888-999"
}
</pre>
