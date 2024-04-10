# 주문 API
## 주문하기
### 기본정보
- 개요
  - ID를 받아 주문을 생성한다.
- 메서드 - POST
- URL - `POST /order/{id}`

### 요청
#### body
| name   | type   | decription |required|
|--------|--------|-----------|--------|
| goodId | String | 상품ID      |yes     |
| amount | int    | 상품 개수     |yes     |
### 응답
- 201 Created: 주문 생성 성공.
```json
{
  "meta": {
    "status": "Created"
  },
  "body": {
    "orderNumber": "주문번호",
    "orderTime": "주문시간"
  }
}
```
- 400 Bad Request: 파라미터가 옳지 않음
```json
{
  "meta": {
    "status": "Bad Request"
  },
  "body": {
    "message": "Good ID doesn't exist"
  }
}
```
- 404 Not Found: id가 존재하지 않음
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