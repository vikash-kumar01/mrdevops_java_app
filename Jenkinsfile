pipeline{

    agent any

    stages{

        stage('Git Checkout'){

            steps{

                script{

                    gitCheckout(
                      branch: "main",
                      url: "https://github.com/vikash-kumar01/mrdevops_java_app.git"
                    )
                }
            }
        }
    }
}