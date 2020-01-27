pipeline { 
	agent any
	triggers { pollSCM('* * * * *') }

    	tools {
		gradle "GRADLE"	 
	}

	stages {
		stage ('Build') {
			steps {
				bat 'gradle build'
			}
		}
/**	
		stage ('Unit Tests') {
			steps {	
				bat 'gradle test'
			}
		}

		stage('Code Analysis') {
			steps {
				withSonarQubeEnv('SonarqubeLocal') {
					bat 'gradle sonarqube'
				}
			}
		}
	
		stage ('Deployment') { 
		  		steps {
					bat 'java -jar build/libs/lazy-load-0.0.1-SNAPSHOT.jar &' 
		 		}
		}
**/
	}
}