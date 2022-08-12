# Rest application
## Сборка
```sh
mvn clean package && java -jar target/rest-service-initial-0.0.1-SNAPSHOT.jar
```

## Работа
Выполняя запрос по http://localhost:9090/greeting/someName на выходе получаете json вида:
```sh
{
"id":1,
"content":"Hello, someName!"
}
```
