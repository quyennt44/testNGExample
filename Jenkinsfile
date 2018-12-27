    node('master') {
      stage('Check out') {
        git 'https://github.com/quyennt44/testNGExample.git'
      }

      stage('Run test') {
      try{
         sh "mvn clean test -DTestNG-FILE-NAME=src/test/resources/testng.xml"	
      }
      catch(err){
      }
      finally{       
      }  
      }
	  stage('Publish report'){
		always {
		    step([$class: 'Publisher'])
		}
	  }
      }
