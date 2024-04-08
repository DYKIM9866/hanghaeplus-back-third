# 상품 API
## 상품 전체 조회
### 기본정보
- 개요
  - 상품목록을 조회합니다.
- 메서드 - GET
- URL - `GET /goods`
### 요청
- 헤더
    - Content-Type: application/json
### 응답
- 200 OK 성공적으로 조회 된 경우
```json
{
  "meta": {
    "status": "OK",
    "total_count": 2
  },
  "body": [
    {
      "goodId": "id",
      "goodName": "촉촉한 초코칩",
      "price": 2000
    },
    {
      "goodId": "id",
      "goodName": "안촉촉한 초코칩",
      "price": 1800
    }
  ]
}
```
## 상품 상세 조회
### 기본정보
- 개요
  - 상품을 상세 조회합니다.
- 메서드 - GET
- URL - `GET /goods/{goodId}`
### 요청
#### 파라미터
|name       |type      |decription          |required|
|-----------|----------|--------------------|--------|
|goodId     |String    |상품 고유 식별자      |yes     |
### 응답
- 200 OK: 상품 상세 조회 성공.
```json
{
  "meta": {
    "status": "OK",
    "total_count": 2
  },
  "body": [
    {
      "goodId": "id",
      "goodName": "촉촉한 초코칩",
      "price": 2000
    }
  ]
}
```
- 404 Not Found: 상품을 찾을 수 없음
```json
{
  "meta": {
    "status": "Not Found"
  },
  "body": {
    "message": "Good ID doesn't exist"
  }
}
```

## 인기 상품 조회
### 기본정보
- 개요
  - 최근 3일간 가장 많이 팔린 상위 5개 상품 정보를 조회한다.
- 메서드 - GET
- URL - `GET /goods/pop`
### 요청
### 응답
- 200 OK: 인기 상품 조회 성공.
```json
{
  "meta": {
    "status": "OK",
    "total_count": 2
  },
  "body": [
    {
      "goodId": "id",
      "goodName": "촉촉한 초코칩",
      "price": 2000
    },
    {
      "goodId": "id",
      "goodName": "안촉촉한 초코칩",
      "price": 1800
    }
    .
    .
    .
  ]
}
```