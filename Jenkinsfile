pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                withSonarQubeEnv('scanserver') {
                    // Optionally use a Maven environment you've configured already
                    sh 'mvn -B clean package sonar:sonar'
        }
			}
				}
    stage('unittests'){
	steps{
	sh 'mvn test'
	}
post{always{ junit 'target/surefire-reports/*.xml'}}

	}

	
	
     }
}

