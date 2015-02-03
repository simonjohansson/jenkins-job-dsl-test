job {
  name 'My-first-awesome-job'
  scm {
    git('git://github.com/jgritman/aws-sdk-test.git')
  }
  triggers {
    scm('*/15 * * * *')
  }
  steps {
    shell('pwd')
    shell('ls')
  }
}
