pipeline {
    agent any
    stages {
        stage('Check out') {
            steps {
                git 'https://github.com/quyennt44/testNGExample.git'
            }
        }
        stage('Test') {
            steps {
                sh "mvn clean test -DTestNG-FILE-NAME=src/test/resources/testng.xml"	
                sh "pwd"
            }
        }     
    }
    post {
        always {
             step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
        }     
    }
}
