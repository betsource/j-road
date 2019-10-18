node {
  def server = Artifactory.server 'ART'
  def rtMaven = Artifactory.newMavenBuild()
  def buildInfo
  def isRelease = (env.BRANCH_NAME == 'master')

  stage ('Clone') {
      checkout scm
  }

  stage ('Artifactory configuration') {
      rtMaven.tool = 'M3'
      rtMaven.deployer releaseRepo: 'libs-release-local', server: server
      rtMaven.resolver releaseRepo: 'libs-release', snapshotRepo: 'libs-snapshot', server: server

      if (!isRelease) {
          rtMaven.deployer.deployArtifacts = false
      }

      buildInfo = Artifactory.newBuildInfo()
      buildInfo.env.capture = true
  }

  stage ('Exec Maven') {
      rtMaven.run pom: 'pom.xml', goals: 'clean install -DskipTests=true', buildInfo: buildInfo
  }

  if (isRelease) {
      stage ('Publish build info') {
          server.publishBuildInfo buildInfo
      }
  }
}