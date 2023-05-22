pipeline{
    agent any
    stages{
        stage("Git Checkout"){
            steps{
                script{

                    git branch: 'devops', url: 'https://github.com/EmmanuelAudu/java_ap.git'
                }
            }
        }
    }
}