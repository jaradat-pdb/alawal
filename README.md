# alawal
> Alawal Enterprise Application Suite Platform

The first of its kind in enterprise application suite platforms :moneybag::heavy_exclamation_mark:

***

## Common Commands
### Application
```sh
java -jar ${jar-file-name}.jar --spring.profiles.active=dev[,local,windows,etc]
```
```sh
mvn spring-boot:run -Dspring-boot.run.profiles=dev -Dhttps.protocols=TLSv1.2 -X
```

### cURL
The following cURL command will retrieve the [Neo4j APOC Library](http://neo4j.com/developer/neo4j-apoc/), v4.1.0.2-all:
```sh
curl -L https://github.com/neo4j-contrib/neo4j-apoc-procedures/releases/download/4.1.0.2/apoc-4.1.0.2-all.jar -O
```

### Docker
```sh
docker run -p 7474:7474 -p 7687:7687 --volume=/workspace/docker/pdbneo/data:/var/lib/neo4j/data --volume=/workspace/docker/pdbneo/plugins:/var/lib/neo4j/plugins -e NEO4J_AUTH=neo4j/admin --env NEO4J_dbms_security_procedures_unrestricted=apoc.* --name pdbneo -d neo4j:latest
```

***

## Useful Links
[Spring Data Neo4j RX Testing Documentation](https://neo4j.github.io/sdn-rx/master/#testing)
