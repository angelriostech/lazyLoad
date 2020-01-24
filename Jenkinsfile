pipeline { 
	agent any
	triggers { pollSCM('* * * * *') }

    	tools {
		gradle "GRADLE"	 
	}

	stages {
		stage ('Unit Tests') {
			steps {	
				sh 'gradle test'
			}
		}
/*
		stage('Code Analysis') {
			steps {
				withSonarQubeEnv('SonarQubeLocal') {
					sh 'gradle --info sonarqube -x test'
				}
			}
		}
*/
		stage ('Build') {
			steps {
				sh 'gradle build'
			}
		}
	
		stage ('Deployment') {
		  		steps {
					sh 'java -jar build/libs/lazy-load-0.0.1-SNAPSHOT.jar &' 
		 		}
		}

	}
}