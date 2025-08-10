def call(String repoUrl = '', String branchName = 'main') {
    stage('Pull Code') {
        echo "Pulling code from ${repoUrl} branch ${branchName}"
        git url: repoUrl, branch: branchName
    }
}
