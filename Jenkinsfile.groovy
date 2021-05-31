pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package -Dmaven.test.failure.ignore=true install'
            }
            post {
                success {
                    echo 'Build Success!!!'
                }
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                success {
                    echo 'Test Success!!!'
                }
            }
        }

    }
}
