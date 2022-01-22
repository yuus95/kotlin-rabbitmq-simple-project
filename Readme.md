# Kotlin RabbitMq 연동



## 도커로 RabbitMq설치

```
docker run -d --hostname localhost --name my-rabbitmq  -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```

## yml 설정
```bash
spring:
  rabbitmq:
    host: localhost
    port: 5672
    username: guest
    password: guest
    template:
      reply-timeout: 30000
```