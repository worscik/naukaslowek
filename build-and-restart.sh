docker build -t naukaslowek .
docker stop naukaslowek || true
docker rm naukaslowek || true
docker run -d -p 40001:8081 --name naukaslowek naukaslowek