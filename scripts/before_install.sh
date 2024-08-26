#!/bin/bash
# 배포 전 필요한 준비 작업을 수행하는 스크립트

# 애플리케이션 디렉토리 생성 (이미 존재하는 경우 무시)
mkdir -p /home/ubuntu/myapp

# 필요한 경우 의존성 설치
# 예: sudo apt-get update && sudo apt-get install -y some-package

# 애플리케이션에 필요한 환경 변수 설정
# export MY_ENV_VAR=value