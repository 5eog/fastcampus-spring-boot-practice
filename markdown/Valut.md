# 암호를 관리하는 법 
- DB접근 암호를 어디에 관리할까?
- Vault
  - https://www.vaultproject.io/
  - 민감한 정보를 저장, 관리 
  - 데이터를 암호화 한다
  - 장점
    - 프로젝트와 민감정보가 완전히 분리된다
    - 보안성이 강화된다
    - 민감 정보에 접근할 수 있는 권한 관리 기능이 제공된다
  - 단점
    - 설계에 따라 Vault 서버가 죽을 경우 서비스가 중단되는 경우 발생
    - 초기에 러닝 커브 비용 소요
    - Vault 서버 운영 관리 비용 소요

## Spring Vault 
- spring cloud vault를 사용하면 된다.
- 설정

## Vault 설치 및 실행
- Ubuntu/Debian 에 설치
```shell
wget -O- https://apt.releases.hashicorp.com/gpg | gpg --dearmor | sudo tee /usr/share/keyrings/hashicorp-archive-keyring.gpg
echo "deb [signed-by=/usr/share/keyrings/hashicorp-archive-keyring.gpg] https://apt.releases.hashicorp.com $(lsb_release -cs) main" | sudo tee /etc/apt/sources.list.d/hashicorp.list
sudo apt update && sudo apt install vault
```

- 실행 CLI
```shell
vault server -dev
```

- 기본 UI 접근
```shell
http://127.0.0.1:8200
```