
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'if not exist out mkdir out'
                bat '"C:\\Program Files\\Eclipse Adoptium\\jdk-25.0.5.8-hotspot\\bin\\javac.exe" -d out HelloWorld.java'
            }
        }

        stage('Run Application') {
            steps {
                bat '"C:\\Program Files\\Eclipse Adoptium\\jdk-25.0.5.8-hotspot\\bin\\java.exe" -cp out HelloWorld'
            }
        }
    }
}
