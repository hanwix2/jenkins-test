pipeline {

    agent any

    tools {
        maven 'MAVEN_HOME'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests=true'
            }
            post {
                success {
                    echo 'Build Success!!!'
                }
            }
        }

        stage('Test') {
            steps {
                sh 'mvn surefire:test'
            }
            post {
                success {
                    echo 'Test Success!!!'
                }
            }
        }

    }
}
