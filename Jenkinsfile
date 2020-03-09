      pipeline {
        agent none
        stages {
          stage("build & SonarQube analysis") {
            agent any
            steps {
              withSonarQubeEnv('jacek-sq') {
                sh 'mvn clean package sonar:sonar'
              }
            }
          }
        }
      }
