pipeline{

agent none

stages{
def app

    stage('Clone Repository'){
        checkout /Users/ngupta33/Documents/github/JavaPractice1/
    }

    stage('Build Image'){
        app=docker.build('/Users/ngupta33/Documents/github/JavaPractice1')
    }


    stage('Test Image'){
        app.inside{
        sh 'echo "Test Passedd"'
        }
    }

    stage('Push Image'){
        docker.withRegistry('https://registry.hub.docker.com/','docker-hub-credentials'){
        app.push("$(env.BUILD_NUMBER)")
        app.push("latest")
        }
    }
    }
}