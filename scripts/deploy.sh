#!/bin/bash
BUILD_JAR=$(ls /home/spring_test/build/libs/*.jar)
JAR_NAME=$(basename $BUILD_JAR)
echo "> build 파일명: $JAR_NAME" >> /home/spring_test/deploy.log

echo "> build 파일 복사" >> /home/[본인경로]/deploy.log
DEPLOY_PATH=/home/spring_test/
cp $BUILD_JAR $DEPLOY_PATH

echo "> 현재 실행중인 애플리케이션 pid 확인" >> /home/spring_test/deploy.log
CURRENT_PID=$(pgrep -f $JAR_NAME)

if [ -z $CURRENT_PID ]
then
  echo "> 현재 구동중인 애플리케이션이 없으므로 종료하지 않습니다." >> /home/spring_test/deploy.log
else
  echo "> kill -15 $CURRENT_PID"
  kill -15 $CURRENT_PID
  sleep 5
fi

DEPLOY_JAR=$DEPLOY_PATH$JAR_NAME
echo "> DEPLOY_JAR 배포"    >> /home/spring_test/deploy.log

nohup java -jar $DEPLOY_JAR >> /home/spring_test/deploy.log 2>/home/spring_test/deploy_err.log &