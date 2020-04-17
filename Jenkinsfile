pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               sh 'mvn clean install'

                  }

                       }
stage ('Deploy Stage') {
            steps {

                withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                  credentialsId   : 'PCF_LOGIN',
                                  usernameVariable: 'USERNAME',
                                  passwordVariable: 'PASSWORD']]) {

                    sh 'cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD -o DellEMC_PAL -s  Nilanjan.Roy@emc.com'
                    sh 'cf push'
                }
            }

        }


           }
}