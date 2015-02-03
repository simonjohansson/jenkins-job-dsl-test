job {
  name 'My-first-awesome-job'
  scm {
    git {
      remote {
	url('https://github.com/simonjohansson/jenkins-job-dsl-test')
      }
      createTag(false)

    }
  }
  triggers {
    scm('*/15 * * * *')
  }
  steps {
    shell('pwd')
    shell('ls')
  }
}
