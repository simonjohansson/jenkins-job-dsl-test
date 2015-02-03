job {
  name 'My-first-awesome-job'
  scm {
    git('https://github.com/simonjohansson/jenkins-job-dsl-test')
  }
  triggers {
    scm('*/15 * * * *')
  }
  steps {
    shell('pwd')
    shell('ls')
  }
}
