# 주문 API
## 주문
### 시퀀스 다이어그램
```mermaid
sequenceDiagram

    participant c as client
    participant s as server
    participant d as db
    c ->> s: 주문 전송
    s ->> d: 재고 조회
    alt 재고가 없을 때
        d -->> s: 재고 부족
        s -->> c: 422 error
    else 재고가 있을 때
        d -->> s: true 반환
        s ->> d: 잔액 조회
        alt 잔액이 부족 할 때
            d -->> s: 잔액 부족
            s -->> c: 422 error
        else 잔액이 충분할 때
            d -->> s: true 반환
            s ->> d: 잔액 차감
            s ->> d: 재고 차감
            s ->> d: 주문 생성
            d -->> s: 주문 데이터 반환
            s -->> c: 200 OK, Response 반환 
        end
    end
```
### 요청
- 메서드: POST
- URL: /api/v1/order
- Header
    - Content-Type: application/json
- body:
    ```json
    {
      "total_count": 2,
      "products": [
        {"productId": "id", "quantity": 1},
        {"productId": "id", "quantity": 1}
      ]
    }
  ```
### 응답
- 200 OK: 주문이 생성 됐을 때
    ```json
  {
    "meta": {
      "status": "OK"
    },
    "body": {
      "orderId": "id",
      "userId": "id"
    }
  }
    ```