node('master') {
  git url: 'https://github.com/simonjohansson/jenkins-job-dsl-test'
  doSomething 'a'
  parallel(sleep60: {
	     sleep 60
	   },
	   sleep50: {
	     sleep 50
	   })
  kehe 'a'
}

def doSomething(a) {
  echo "I am doing something"
}

def sleep(n) {
  Echo "Im about to sleep for ${n}"
  sh "sleep ${n}"
}

def kehe(a) {
  sh "ls"
}
