Cloud Computing HW 1
======

Link to the application repository which is being used:
[Botnak repo](https://github.com/Gocnak/Botnak)

# How to run the project
1. Copy the repo clone "https://sankul@bitbucket.org/sankul/sankul_rawat_hw1.git".
2. Open intelliJ.
3. In intellij, open project using version control -> git.
4. Follow on screen instructions to clone and import project.
5. Once the project is open, open terminal window inside intellij.
6. To run using gradle, execute following command `gradle build` in terminal, this will build the project and run tests.
7. To run the tests again execute `gradle clean test` in terminal again.
8. To run using sbt, execute following command `sbt clean compile test` in terminal, this will compile and run the tests.    

# Location of tests
1. The junit tests are present on path `sankul_Rawat_hw1/src/test/java/` .
2. build.gradle and build.sbt files are present in the root directory of the project.

# Requirements
You will need the latest version of Java 8 to run tests. [Download it here.](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)

You will also require intellij ide. [Download it here.](https://www.jetbrains.com/idea/download/#section=windows)

Junit and other dependencies will be automatically added using gradle and sbt.

# Testing of application

Following monitoring tools were used to test the application [Tools list](https://docs.oracle.com/javase/8/docs/technotes/guides/troubleshoot/tooldescr025.html) 

#####JConsole
We use JConsole to monitor performance and resource consumption of java applications that are running.

Screenshots of JConsole output for this application:
![alt text](https://bitbucket.org/sankul/sankul_rawat_hw1/src/1e590084f1c63f6f4c0db8f4567ae1057a1c566e/screenshots/jconsole1.png?at=master&fileviewer=file-view-default)