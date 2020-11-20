# spring-boot thymeleaf view
* html, css, js가 적용된 static web html 파일에 controller로 부터 전달되어 온 데이터를
기본 모양으로 흐트러트리지 않는 범위에서 장ㅎ롭게 표현하는 view
* jsp와 비교했을때 jsp는 서버ㅡㄹㄹ 거처서 rendering이 되지 ㅇ낳으ㅕㄴ 어떻게 화면ㅁ이 구성ㄷ되는지
그 결과를 할기가 어렵다
* 표준 web browser에서 open을 했을때0는 마치 

# data-jpa 프로젝트
* spring.jpa 프로젝트에서 spring.datasource.initalize-mode 를 always로 설정한 후
src/main/resources 폴더에 data.sql 파일을 생성한 후 insert sql을 저장해 두면
프로젝트가 제 시작될때 data.sql 파일의 sql 문을 읽어서 데이터를 자동으로 추가한다
샘플데이터가 필요할때 사용하면 좋다.
* 또한
src/main/resources 폴더에 schema.sql파일을 생성한 후 