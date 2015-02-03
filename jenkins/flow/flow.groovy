build('My-first-awesome-job')
build('My-second-awesome-job')

parallel (
    {
      build('My-first-awesome-job')
    }, {
      build('My-second-awesome-job')
    },
)
