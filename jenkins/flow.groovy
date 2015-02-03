node('master') {
  git url: 'https://github.com/simonjohansson/jenkins-job-dsl-test'
  stage 'Do Something'
  sh 'ls'

  stage 'Do something else'
  parallel(sleep60: {
	       sh "sleep 60"
	   },
	   sleep50: {
	       sh "sleep 50"
	   })
}