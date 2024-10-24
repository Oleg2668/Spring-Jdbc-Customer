
Spring JDBC - це модуль в Spring Framework, який надає
спрощений спосіб взаємодії з базами даних за допомогою
JDBC (Java Database Connectivity).

Spring JDBC — легкий шар абстракції поверх JDBC.
Він спрощує доступ до бази даних, надаючи API вищого рівня
та вирішуючи багато типових завдань, наприклад керування
з’єднаннями та обробку винятків.

Spring JDBC допомагає зменшити кількість шаблонного коду,
який зазвичай потрібно писати при використанні чистого JDBC,
і полегшує роботу з базами даних у веб-додатках.

Завдяки Spring JDBC забезпечується інфраструктура для
виконання SQL-запитів, обробляється з’єднання з базою даних
і дозволяється виконувати SQL-запити за допомогою JdbcTemplates.
Це рішення розглядається доволі гнучким, оскільки маємо
повний контроль над виконуваними SQL-запитами.


------------------------

ТЕХСТЕК

JDK
https://www.oracle.com/java/technologies/downloads/
(якщо встановлена, то Apache Tomcat має підтягнути встановлену)

Apache Tomcat
https://tomcat.apache.org/
(якщо Apache Tomcat вже встановлено, то можна скористатися встановленим)

Spring Framework
https://spring.io/

MySQL 8
https://www.mysql.com/

Jackson
https://github.com/FasterXML/jackson

Lombok
https://projectlombok.org/

Apache Maven WAR Plugin
https://maven.apache.org/plugins/maven-war-plugin/index.html

------------------------

JAVA ПРОЕКТ

(1) Налаштовуємо БД ( INFO/SQLs.sql ).
(2) Створюємо Maven-проект.
(3) Додаємо залежності ( pom.xml ).
(4) Формуємо та відповідно структуруємо
необхідний контент ( src/main ).

------------------------

РОЗГОРТАННЯ (ДЕПЛОЙ) ПРОЕКТУ

Запустимо Apache Tomcat.
Створемо секцію Git Bash.
В IDE внизу

Terminal >  <іконка-випадаючого-списку>  > Git Bash

В секції буде шлях до директорії поточного проекту

<your-base-path>/<your-project-name>

Переходимо до директорії, де розташовані файли запуску
та припинення роботи Apache Tomcat

$ cd <your-base-path>/apache-tomcat-<version>/bin

Виконуємо команду

$ ./startup.bat

УВАГА.
Запуск Apache Tomcat: startup.bat - для Windows,
startup.sh - для MacOS/Linux.
Припинення Apache Tomcat: shutdown.bat - для Windows,
shutdown.sh - для MacOS/Linux.

Окремо з'явиться інформаційне вікно,
де відображається інформація про роботу
Apache Tomcat та програми.

Можемо згорнути його.

В IDE відкриваємо бокову праворуч вкладку Maven.
Через меню вкладки відкриваємо вікно команд,
де послідовно знаходимо та подвійним кліком
запускаємо відповідні Maven-команди

mvn clean

mvn install

mvn war:war

В директорії проекту target , знаходимо файл
Your-Project-Name-1.0-SNAPSHOT.war та копіюємо його
у відповідну директорію Apache Tomcat, в файловій системі
комп'ютера

<your-base-path>/apache-tomcat-<version>/webapps

Через декілька секунд, в цій директорії, має з'явитися
папка Your-Project-Name-1.0-SNAPSHOT.
Apache Tomcat розархівував архівний файл проекту.

Тестуємо функціонал програми.

------------------------

РЕСУРСИ

https://uk.wikipedia.org/wiki/Data_access_object
https://www.baeldung.com/java-dao-pattern
https://www.baeldung.com/java-dao-vs-repository
https://www.baeldung.com/jdbc-vs-r2dbc-vs-spring-jdbc-vs-spring-data-jdbc
https://docs.spring.io/spring-framework/reference/data-access.html
https://docs.spring.io/spring-framework/reference/data-access/jdbc.html
https://docs.spring.io/spring-framework/reference/data-access/jdbc/core.html
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/JdbcTemplate.html
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/package-summary.html
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/ResponseEntity.html
https://www.baeldung.com/spring-jdbc-jdbctemplate
https://www.baeldung.com/spring-response-entity
https://www.baeldung.com/spring-request-param
https://www.baeldung.com/maven-unused-dependencies
https://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration
https://www.baeldung.com/rest-versioning
https://www.baeldung.com/java-postman

