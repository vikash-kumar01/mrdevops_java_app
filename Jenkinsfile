@Library('my-shared-library') _

pipeline{

    agent any

    stages{

        stage("Git Checkout"){

            steps{
            gitCheckout(
                        branch: "devops",
                        url: "https://github.com/EmmanuelAudu/java_ap.git"
                    )
                
            }
        }

        stage("Unit Test Maven"){

            steps{
                script{
                    mvnTest()
                }
            }
        }    

        stage("Integration Test Maven"){

            steps{
                script{
                    mvnIntegrationTest()
                }
            }
        }            
    }
