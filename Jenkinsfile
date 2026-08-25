node {
    stage('SCM') {
        checkout scm
    }

    stage('SonarQube Analysis') {
        def mvn = tool 'Maven3.9.16'

        withSonarQubeEnv('SonarQube') {
            bat "${mvn}\\bin\\mvn.cmd clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=mavensample -Dsonar.projectName=mavensample"
        }
    }
}