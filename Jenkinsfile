pipeline {
  agent any
  stages {
    stage('Dev') {
      steps {
        parallel(
          "Dev": {
            git(url: 'https://github.com/Ramaraja-Ramanujan/JavaSampleProject.git', branch: 'master')
            
          },
          "Prod": {
            git(url: 'https://github.com/Ramaraja-Ramanujan/JavaSampleProject.git', branch: 'master')
            
          }
        )
      }
    }
  }
}