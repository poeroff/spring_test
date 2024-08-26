#!/bin/bash
# 실행 중인 애플리케이션을 중지하는 스크립트

# 실행 중인 Java 프로세스 찾기
PID=$(pgrep -f myfirstwebapp-0.0.1-SNAPSHOT.jar)

if [ -n "$PID" ]; then
  echo "Stopping application with PID: $PID"
  kill $PID
  # 프로세스가 완전히 종료될 때까지 대기
  sleep 10
else
  echo "Application is not running"
fi