pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build and Code Quality Test') {
            steps {
                withSonarQubeEnv('scanserver') {
                    // Optionally use a Maven environment you've configured already
                    sh 'mvn -B -DskipTests clean package '
        }
			}
				}
    stage('unittests'){
	steps{
	sh 'mvn test'
	junit 'target/surefire-reports/*.xml'
	}

	}
	stage('upload artifacts'){
	steps { script{ def server = Artifactory.newServer url: 'http://192.168.50.129:8081', username: 'admin', password: 'password'
	def uploadSpec = """{
  "files": [
    {
      "pattern": "simple-java-maven-app/*.*",
      "target": "bazinga-repo/froggy-files/"
    }
 ]
}"""
server.upload(uploadSpec)}
	
	
	}}
	

	
	
     }
}

