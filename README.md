## 🎫 기능명세

### `/users/{id}/wrong-case`

DTO를 사용하지만 필드에 Lazy 로딩 데이터를 보유한 엔티티가 존재한다.

이로 인해 순환 참조 오류가 발생할 것으로 기대하지만, OSIV 설정에 따라 다른 오류가 발생한다.

**OSIV true**

- StackOverflowError
- 순환 참조 오류 발생

**OSIV false**

- LazyInitializationException
- Lazy 로딩 실패 오류 발생

### `/users/{id}/correct-case`

DTO를 사용하고 Lazy 로딩된 데이터를 사용하지 않으므로, OSIV 설정과 관계없이 정상 응답을 반환한다.

## ✏️ 기록

[Jpa의 Open-Session-In-View 기능과 주의점](https://ajroot5685.github.io/posts/OSIV/)
