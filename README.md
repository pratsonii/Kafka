# Kafka
Integrating Apache Kafka(Producer and Consumer) with Springboot

**Start zoolkeeper :**
C:\Pratik\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

**Start Kafka :**
C:\Pratik\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

**Create topic:**
C:\Pratik\kafka>.\bin\windows\kafka-topics.bat  --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic pratik

**start consumer :**
C:\Pratik\kafka>.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic pratik --from-beginning

**Start Springboot app**
Go to :
GET http://localhost:8080/kafka/produce/FirstKafkaMsg

check consumer

Reference : 1) https://www.youtube.com/watch?v=3XjfYH5Z0f0
2) https://www.onlinetutorialspoint.com/spring-boot/spring-boot-kafka-producer-example.html
