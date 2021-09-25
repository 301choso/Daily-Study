### 일반 헤더

전송에 필요한 모든 부가정보

표준헤더가 너무 많음

General헤더  Request헤더 Response헤더 Entity헤더

과거 RFC2616

엔티티 헤더는 엔티티본문(요청이나 응답에서 전달할 실제 데이터)을 해석할 수 있는 정보제공 예) 데이터유형, 길이, 압축 정보 등

14년 개정 → RFC7230~ 7235

엔티티 → 표현(Representation) (요청 응답에서 전달할 실제 데이터)

= representation Metadata + Representation Data

### 표현

리소스를 전달하는 방식(표현)

 - Content-Type : 표현 데이터의 형식

 - Content-Encoding : 표현 데이터의 압축방식

 - Content-Language : 표현 데이터의 자연언어

 - Content-Length : 표현데이터의 길이
