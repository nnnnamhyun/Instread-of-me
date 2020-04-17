# Instead-of-me

## How to Run the Application

### Run Backend & Frontend
1. Build project using gradle
`./gradlew clean build`
2. Run the Jar file
`java -jar build/libs/insteadOfMe-0.0.1-SNAPSHOT.jar` then goto 'http://localhost:8080/index.html'

### Backend
`./gradlew clean build`
`http://localhost:8080`

### Frontend 
When you first run the codes, use command below to install the dependencies
1. Install dependency packages
`yarn install `
2. Build
`yarn build`
3. Run
`yarn start` then goto 'http://localhost:3000'

## IntelliJ Style Guide
Use intellij-java-google-style-guide

### How to apply the style guide ?
Go to `IntelliJ IDEA` - `Preferences` - `Editor` - `Code Style` - `Java` 
Import the file below
https://raw.githubusercontent.com/google/styleguide/gh-pages/intellij-java-google-style.xml 