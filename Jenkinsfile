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
                withSonarQubeEnv('scansferver') {
                    // Optionally use a Maven environment you've configured already
                    sh 'mvn -B -DskipTests clean package'
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

