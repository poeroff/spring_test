#!/bin/bash
# 애플리케이션을 시작하는 스크립트

# 애플리케이션 디렉토리로 이동
cd /home/ubuntu/myapp

# Java 애플리케이션 시작
nohup java -jar your-application.jar > /home/ubuntu/myapp/application.log 2>&1 &

echo "Application started"