
## If you have any troubles please email me at dringb@oregonstate.edu or call at 541-510-5034 everything is working fine on my machine, and school server,I would hate to lose points for something so silly

## Make sure all commands are ran from where pom.xml is


### If you must clean everything take a look at the pit reports first
#### In a pit-report called ```passing``` is a file showing complete and current mutation report

#### If you look in the target/pit-reports there are different reports generated from pitest via just EvoSuite, just my tests, both etc etc. Take a look at them 



### Generate a mutation test suite (Please remember print line statements)
#### ```mvn -DwithHistory org.pitest:pitest-maven:mutationCoverage```
#### (Generating tests may take FOREVER please be patient)


### Test my Junit tests 
#### ```mvn tests```

### Generate new Code report 
#### ``` mvn cobertura:cobertura```

### Clean maven files 
#### ```mvn clean```

### Compile all maven files 
#### ```mvn compile```

### Play game if it goes into an infinite loop please retry, crazy bug I can't find
#### ```cd src/main/java && java dominion/PlayDominion```
