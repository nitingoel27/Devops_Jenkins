pipeline {
    agent any
    
    environment {
        registry = 'https://index.docker.io/v1/'
        dockerImage = 'nitingoel27/devopsjenkins:tagname'
    }
    
    tools {
        // Specify the JDK installation configured in Jenkins
        jdk 'jdk17'
        // Specify the Maven installation configured in Jenkins
        maven 'maven'
       
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the Git repository
                git url: 'https://github.com/nitingoel27/Devops_Jenkins.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Build using Maven
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests using Maven
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                // Build Docker image
                script {
                    dockerImage = docker.build("nitingoel27/devopsjenkins:tagname")
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                // Push Docker image to Docker Hub
                script {
                    docker.withRegistry('https://index.docker.io/v1/', 'e9fe1f1e-e427-4d70-99fa-3190224f9d1b') {
                        docker.image("nitingoel27/devopsjenkins:tagname").push()
                    }
                }
            }
        }

        // stage('Deploy') {
        //     steps {
        //         // Deploy using kubectl
        //         bat 'kubectl apply -f path/to/deployment.yaml'
        //     }
        // }
    }

    post {
        success {
            echo 'Pipeline successfully executed!'
            // Add further success actions if needed
        }
        failure {
            echo 'Pipeline failed!'
            // Add further failure actions if needed
        }
    }
}
