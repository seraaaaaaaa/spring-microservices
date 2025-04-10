#!/bin/bash

# Define the directories
dirs=("api-gateway" "eureka-server" "organization-service" "event-service" "news-service")

# Loop through each directory, navigate to it, and run mvn clean package
for dir in "${dirs[@]}"; do
  echo "Building $dir..."
  cd $dir
  mvn clean package
  cd ..
done

echo "Build process completed for all services."
