# This project spring boot using JWT token

### Build the application using this command
mvn clean install
### Ruild the application using this command
mvn spring-boot:run

After run application to check the jwt token and run the three API
### Generate token using this API
- Request URI: https://localhost:8080/authenticate
- Request Method: POST
- Request Body: {
"name": "test1",
"id": "1234",
"validated": "true"
}
- Response Body:
{
"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0MSIsImV4cCI6MTY2NjE3MDk5NywiaWF0IjoxNjY2MTUyOTk3fQ.qxaiByblmG_mf00JVPQ8UvYZd60den29iAImr3Zds498tZ44vuwzyVObh_PcxYWsiQgxWqkPYCc1cNcrc2h4ag"
}

### Check simple get API
- Request URI: https://localhost:8080/get
- Request Method: GET
- Request Header: Authorization = Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0MSIsImV4cCI6MTY2NjE3MDk5NywiaWF0IjoxNjY2MTUyOTk3fQ.qxaiByblmG_mf00JVPQ8UvYZd60den29iAImr3Zds498tZ44vuwzyVObh_PcxYWsiQgxWqkPYCc1cNcrc2h4ag

- Response Body:
  1

### Check list get all API
- Request URI: https://localhost:8080/get-all
- Request Method: GET
- Request Header: Authorization = Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0MSIsImV4cCI6MTY2NjE3MDk5NywiaWF0IjoxNjY2MTUyOTk3fQ.qxaiByblmG_mf00JVPQ8UvYZd60den29iAImr3Zds498tZ44vuwzyVObh_PcxYWsiQgxWqkPYCc1cNcrc2h4ag

- Response Body:
  [
  1,
  2
  ]
