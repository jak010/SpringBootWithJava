### Title: Feature 개발 노트

- 콘솔에 컬러 로그 설정
    - `application.properties`에 아래 내용 추가
      ```text
        spring.output.ansi.enabled=always
      ```
- 로그 파일로 출력
    - `application.properties`에 아래 내용 추가
        ```text
         logging.file.path=logs 
        ```
        - 위는 지정된 경로에 로그 파일을 남김
            - 기본적 10M 까지
            - logs 밑에 `spring.log` 라는 파일로 저장됨
      
      

 