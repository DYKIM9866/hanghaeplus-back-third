# 잔액 API
## 잔액 조회
userId를 전달 해 현재 잔액을 확인한다.
### 시퀀스 다이어그램
```mermaid
sequenceDiagram
     clent ->> server: GET /api/v1/balance/{id}
     server ->> db : userId로 조회
     alt userId가 존재한다면
        db -->> server : User 도메인 객체 반환
        server -->> clent : 200 OK, Response 반환
     else userId가 존재하지 않는다면
        db -->> server : null 반환
        server -->> clent : 404 Not Found 반환
     end
     
```
### 요청
- 메서드: GET
- URL: /api/v1/balance/{id}
- Header:
    - Content-Type: application/json
### 응답
- 200 OK: 잔액 조회 성공
    ```json
  {
    "meta": {
      "status": "OK",
      "total_count": 1
    },
    "body": {
      "userId": "id",
      "balance": 1,
      "message": "Successful"
    }
  }
    ```
- 404 Not Found: 유저 조회 실패
    ```json
  {
    "meta": {
      "status": "Not Found"
  },
    "body": {
      "message": "User ID doesn't exist"
    }
  }
  ```

## 잔액 충전
userId를 전달 해 현재 잔액을 충전한다.
### 시퀀스 다이어그램
```mermaid
sequenceDiagram
    client ->> server : PATCH /api/v1/balance/charge/{id}
    server ->> db : userId에 잔액 충전 요청
    alt userId가 존재하지 않는다면
        db -->> server : null 반환
        server -->> client: 404 Not Found
    else userId 존재한다면
        db -->> server : 충전 후에 정보 반환
        server -->> client : 200 OK, Response 반환
    end
    
```
### 요청
- 메서드: PATCH
- URL: /api/v1/balance/charge/{id}
- Header: 
    - Content-Type: application/json
- Body:
    ```json
      {
        "amount": 1
      }
    ```
### 응답
- 200 OK: 잔액 충전 완료
    ```json
    {
    "meta": {
      "status": "OK",
      "total_count": 1
    },
    "body":{
      "userId": "id",
      "balance": 1
    }
  } 
    ```
- 404 Not Found: ID 찾을 수 없음
    ```json
    {
      "meta": {
        "status": "Not Found"
      },
      "body": {
        "message": "User ID doesn't exist"
      }
    }
    ```
