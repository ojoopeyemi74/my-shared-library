def call(){
    withSonarQubeEnv(credentialsId: 'sonarqube-token') {
      sh 'mvn clean package sonar:sonar'
}
    
}