
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

		stage('Code Analysis') {
			steps {
				withSonarQubeEnv('SonarQubeLocal') {
					sh 'gradle --info sonarqube -x test'
				}
			}
		}
/*
		stage('Quality Gate') {
			steps {
				script{
					timeout(time: 1, unit: 'MINUTES') { // Just in case something goes wrong, pipeline will be killed after a timeout
						def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
						if (qg.status != 'OK') {
							error "Pipeline aborted due to quality gate failure: ${qg.status}"
						}
					}
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
					sh 'java -jar lazy-load/build/libs/lazy.load-0.0.1-SNAPSHOT.jar &' 
		 		}
		}

	}
}



