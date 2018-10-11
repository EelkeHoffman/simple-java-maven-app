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
                sh 'mvn -B -DskipTests clean package'
            }
        }
stage('SonarQube analysis') {
    withSonarQubeEnv('scanner') {
      // requires SonarQube Scanner for Maven 3.2+
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
    }
  }
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

