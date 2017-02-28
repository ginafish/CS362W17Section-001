## If you have any troubles please email me at dringb@oregonstate.edu or call at 541-510-5034 everything is working fine on my machine, and school server,I would hate to lose points for something so silly

### I have attached results of custom assert tests to main game look for ```Times passed custom asserts:``` When running the game
### Before you clean everything take a look at the cobertura report

### Clean maven files 
#### ```mvn clean```

### Compile all maven files 
#### ```mvn compile```

### Test my Junit tests && EvoSuite tests
#### ```mvn tests```

### Generate new Code report 
#### ``` mvn cobertura:cobertura```

### Play game 
#### ```cd src/main/java && java dominion/playDominion```
