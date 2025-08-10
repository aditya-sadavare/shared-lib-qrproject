def call(List changedFiles) {
    stage('Build Changed Services') {
        script {
            if (changedFiles.any { it.startsWith("qrFrontend/") }) {
                echo "Frontend code changed → rebuilding frontend"
                sh 'docker compose build frontend'
            } else {
                echo "No frontend changes → skipping rebuild"
            }

            if (changedFiles.any { it.startsWith("qrServer/") }) {
                echo "Backend code changed → rebuilding backend"
                sh 'docker compose build backend'
            } else {
                echo "No backend changes → skipping rebuild"
            }
        }
    }
}
