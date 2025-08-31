1️⃣ Build the Docker Image
*    docker build -t spring-openai .

2️⃣ Run the Container
*    docker run -p 8080:8080 -e OPEN_AI_KEY=<your_key> spring-openai

3️⃣ Access the Application
*   http://localhost:8080

💡 Notes:

- If port 8080 on your host is already in use, use a different host port:

*   docker run -p 9090:8080 -e OPEN_API_KEY=<your_openai_api_key> spring-op
*   http://localhost:9090