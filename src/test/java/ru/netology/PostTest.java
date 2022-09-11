package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostTest {
    @Test
    public void shouldPostToPostmanEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=Shift-JIS")
                .body("フリーダが大好き")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("フリーダが大好き"))
        ;
    }
}
