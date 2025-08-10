def call() {
    stage('Deploy') {
        sh 'docker compose up -d'
    }
}
