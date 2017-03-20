Randomly generated tests and RandomDominionTest.java can be found in:
src/test/java/dominion

To run tests:
mvn test

To run PITest:
mvn org.pitest:pitest-maven:mutationCoverage

All PITest coverage can be found in: target/pitestreports

To run a single, complete instance of the dominion game:
java -jar target/DOMINION-1.0-SNAPSHOT.jar

To produce html code coverage report:
mvn cobertura:cobertura

Code Coverage for unit tests by Cobertura can be found in:
target/site/cobertura/index.html


