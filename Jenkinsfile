pipeline {
    agent any

    stages {
        stage ('Clean Stage') {

            steps {
                withMaven(maven : 'AutoMaven') {
                    sh 'echo After 30 sec , Maven Clean '
                    sh 'sleep 30'
                    sh 'mvn clean'
                }
            }
        }

        stage ('Install Stage') {

            steps {
                withMaven(maven : 'AutoMaven') {
                    sh 'echo After 30 sec , Maven Install '
                    sh 'sleep 30'
                    sh 'mvn install'
                }
            }
        }


        stage ('Compile Stage') {
            steps {
                withMaven(maven : 'AutoMaven') {
                    sh 'echo After 30 sec , Maven Compile '
                    sh 'sleep 30'
                    sh 'mvn compile'
                }
            }
        }
        
        stage ('Test Stage') {
            steps {
                withMaven(maven : 'AutoMaven') {
                    sh 'echo After 30 sec , Maven Test '
                    sh 'sleep 30'
                    sh 'mvn test'
                }
            }
        }
    }
}
