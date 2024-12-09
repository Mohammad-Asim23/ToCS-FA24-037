pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac Squarenumber.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java helloworld'
            }
        }
    }
}