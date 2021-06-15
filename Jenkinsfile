pipeline {
    agent any

    stages {
        stage ('Clean Stage') {

            steps {
                withMaven(maven : 'mavenLTS') {
                    sh 'mvn clean'
                }
            }
        }

        stage ('Install Stage') {

            steps {
                withMaven(maven : 'mavenLTS') {
                    sh 'mvn install'
                }
            }
        }


        stage ('Compile Stage') {
            steps {
                withMaven(maven : 'mavenLTS') {
                    sh 'mvn compile'
                }
            }
        }
    }
}
