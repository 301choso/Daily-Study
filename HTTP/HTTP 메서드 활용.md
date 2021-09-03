* HTTP 메서드 활용

클라이언트에서 서버로 데이터 전송

1)쿼리 파라미터(GET) :구글 검색 / 게시판 정렬 조건

2) 메시지 바디로 전송(POST, PUT,PATCH) : 회원가입 / 리소스등록 / 리소스 변경

Get은 조회에서만 사용

리소스 변경이 발생하는 곳에서 사용하면 안됨


4가지 상황

1) 정적 데이터 조회 : 이미지 등 단순 GET 조회

2) 동적 데이터 조회 : 쿼리 파라미터 사용 검색, 정렬필터 등

3) HTML <Form> 통해 전송 : GET, POST만 지원

4) HTTP API 로 전송 : 서버 to 서버 / 앱 클라이언트 /웹클라이언트(ajax통신 등)

---

HTTP API 설계 예시

1) API  컬렉션 : POST 기반 등록

예시 : 회원관리시스템

회원목록 GET / 회원등록 POST / 회원조회 {id} GET / 회원수정 {id} PATCH, PUT, POST / 회원삭제 {id} DELETE

 클라이언트는 등록될 리소스의 URI를 모르고,

서버가 새로 등록된 리소스 URI를 생성해준다.

컬렉션: 서버가 관리하는 리소스 디렉토리,

서버가 리소스의 URI를 생성하고 관리함 여기에서 컬렉션은 /members


2)  API 스토어 : PUT 기반 등록

예시 : 파일관리시스템

파일 목록 GET / 파일조회 {filename} GET / 파일 등록  {filename} PUT (파일에 찰떢) / 파일 삭제  {filename}  DELETE /  파일 대량등록 POST

PUT으로 신규자원 등록할 때 특징

클라이언트가 리소스의 URI를 알고 있어야 함

파일등록 /files/{filename} -> PUT

클라이언트가 직접 리소스의 URI를 지정한다.(GET과 차이점)

스토어 : 클라이언트가 관리하는 리소스 저장소 클라이언트가 리소스의 URL을 알고 관리함 여기서 스토어는 /files

그래도 PUT 보다는 POST를 많이씀(대부분)


3) Form 사용 : GET, POST만 지원 / 웹 페이지 회원관리

회원 목록 GET / 회원등록폼 GET / 회원등록 POST / 회원조회 GET / 회원 수정폼 GET / 회원수정 POST / 회원삭제(url에 delet 표시) POST

컨트롤 URI : GET,POST만 지원하므로 제약이 있는데

이를 해결하기 위해 동사로 된 리소스 경로 사용

POST의 /new, /edit, /delete가 컨트롤 URI

HTTP 메서드로 해결하기 애매한 경우 사용(대체제로 쓰는 거지만 실무에서 많이 씀 , HTTP API 포함)
