# CI/CD Pipeline Documentation

This repository uses GitHub Actions for continuous integration and deployment.

## Workflows

### 1. Quickmart Backend CI/CD (`ci-cd.yml`)

This workflow handles building, testing, and pushing Docker images:

- **Trigger**: Runs on push or pull request to main/master branch
- **Jobs**:
  - **Build**: Compiles all microservices
  - **Test**: Runs tests on all microservices
  - **Docker-build-push**: Builds and pushes Docker images to Docker Hub (only on push to main/master)

### 2. Deploy to Kubernetes (`k8s-deploy.yml`)

This workflow handles deployment to Kubernetes:

- **Trigger**: Runs after successful completion of the CI/CD workflow
- **Jobs**:
  - **Deploy**: Applies Kubernetes manifests and verifies the deployment

## Required Secrets

To use these workflows, you need to set up the following secrets in your GitHub repository:

1. `DOCKER_USERNAME`: Your Docker Hub username
2. `DOCKER_PASSWORD`: Your Docker Hub password or access token
3. `KUBE_CONFIG`: Your Kubernetes configuration file (base64 encoded)

### How to Add Secrets

1. Go to your GitHub repository
2. Click on "Settings" > "Secrets and variables" > "Actions"
3. Click "New repository secret" 
4. Add each secret with its appropriate name and value

### Creating Base64 Encoded Kubeconfig

To create the KUBE_CONFIG secret:

```bash
cat ~/.kube/config | base64 | tr -d '\n'
```

Copy the output and add it as the KUBE_CONFIG secret.

## Customization

- Update the Docker image tags in `ci-cd.yml` if needed
- Modify the Kubernetes deployment verification in `k8s-deploy.yml` based on your actual deployment names and namespaces 