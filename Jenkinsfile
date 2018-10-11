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
                    withMaven(maven:'Maven 3.5') {
                        sh 'mvn clean package sonar:sonar'
            }
        }}}
    stage('deploy'){
	 steps{ echo 'zout op'}

        }
    stage('test'){
	steps{
	sh 'mvn test'
	}
post{always{ junit 'target/surefire-reports/*.xml'}
}

	}

	
	
     }
}

