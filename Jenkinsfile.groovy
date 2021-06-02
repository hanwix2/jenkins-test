pipeline {

    agent any

    tools {
        maven 'MAVEN_HOME'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package -Dmaven.test.skip=true'
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

    post {
        success {
            slackSend(channel: '#프로젝트', color: '#00FF00', message: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
        }
        failure {
            slackSend(channel: '#프로젝트', color: '#FF0000', message: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
        }
    }

}
