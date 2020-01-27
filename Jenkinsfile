pipeline { 
	agent any
	triggers { pollSCM('* * * * *') }

    	tools {
		gradle "GRADLE"	 
	}

	stages {
		stage ('Build') {
			steps {
				powershell 'gradle build'
			}
		}
		/**
		stage ('Unit Tests') {
			steps {	
				powershell 'gradle test'
			}
		}
		stage('Code Analysis') {
			steps {
				withSonarQubeEnv('SonarqubeLocal') {
					powershell 'gradle sonarqube'
				}
			}
		}
	
		stage ('Deployment') { 
		  		steps {
					powershell 'java -jar build/libs/lazy-load-0.0.1-SNAPSHOT.jar &' 
		 		}
		}
**/
	}
}