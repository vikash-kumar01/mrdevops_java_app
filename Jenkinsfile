pipeline{
    agent any
    stages{
        stage("Git Checkout"){
            steps{
                script{

                    gitCheckout(
                        branch: "devops",
                        url: "https://github.com/EmmanuelAudu/java_ap.git"
                    )
                }
            }
        }
    }
}