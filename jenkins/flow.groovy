node('master') {
  git url: 'https://github.com/simonjohansson/jenkins-job-dsl-test'

  doSomething()
  parallel(sleep60: {
	     sleep "60"
	   },
	   sleep50: {
	     sleep "50"
	   })
  kehe()
}

def doSomething() {
  echo "I am doing something"
}

def sleep(n) {
  echo "Im about to sleep for ${n}"
  sh "sleep ${n}"
}

def kehe() {
  sh "ls"
}
