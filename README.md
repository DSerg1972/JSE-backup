### **TASK MANAGER**
***
Учебный проект по курсу JAVA SPRING НЛМК

#### Используемые технологии

* Java 11
* Apache Maven

#### Требования к Software

* Open JDK 11.0.7
* Apache Maven 3.6.1
* Тестировалось под ОС Windows 10 64bit

#### Разработчик

Дежемесов Сергей    
электронная почта: [dezhemesov_sa@nlmk.com](<email:dezhemesov_sa@nlmk.com>)

#### Сборка проекта
```shell script
# очистка и сборка в локальный репозиторий
mvn clean package
```
```shell script
# построение javadoc
mvn javadoc:jar
```

#### Запуск:
```shell script
java -jar target/task-manager-1.0.0.jar [help|about|version]
```
Запуск с параметром выводит на экран соответствующую информацию и завершает выполнение. Запуск без параметра включает интерактивный режим исполнения команд. Выход и  завершение работы программы - команда `exit`

#### Зеркальный репозиторий

Для резервного копирования текущего репозитория настроено зеркалирование в репозиторий GitHub:

https://github.com/DSerg1972/JSE-backup
