Supriya Kapur cs362 file folder
ASSIGNMENT-1
DOMINION: 
mvn compile
java -cp ./target/classes org.cs362.dominion.PlayDominion
***Play dominion shows a simulations of a game through a set number of rounds

TESTING: 
mvn test
HTML of code coverage for all three classes (org.cs362.dominion.Card.html, org.cs362.dominion.Player.html, org.cs362.dominion.GameState.html) can be found under cobertura/ 

ASSIGNMENT-2
RANDOOP TOOL: 
The tool was run using the command java -ea -classpath ./Dominion_with_randoop/src/main/java/org/cs362/dominion:./randoop-3.0.9/randoop-all-3.0.9.jar randoop.main.Main gentests --classlist=./randoop-3.0.9/test_classes.txt --outputlimit=5000 --junit-output-dir=./Dominion/src/test/java --junit-package-name=cs362.dominion.Randoop

The tests genereted by the tool can be viewed at Dominion_with_randoop/src/test/java/org/362/dominion

RANDOM TESTER: 
the test can be run from Dominion_random_tester with: mvn test
Code coverage for the three classes (Card, GameState, Player) can be found under cobertura_
