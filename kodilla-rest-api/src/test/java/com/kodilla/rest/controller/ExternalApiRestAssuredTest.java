package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class ExternalApiRestAssuredTest {

    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {
        given().  // [1]
                header("Content-Type", "application/json").
                when().
                get("https://jsonplaceholder.typicode.com/posts/1").  // [2]
                then().
                assertThat().
                statusCode(200).  //  [3]
                body("userId", equalTo(1)).  //  [4]
                body("id", equalTo(1)).
                body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).
                body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")).
                log().all();  // [5]
    }

    @Test
    void testPostShouldGetUpdatedAndReturnValid(){
        String requestBody = "{\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"Updated title\",\n" +
                "    \"body\": \"This is the updated body content.\",\n" +
                "    \"userId\": 1\n" +
                "}";
        given().
                header("Content-Type", "application/json").
                body(requestBody).
        when().
                put("https://jsonplaceholder.typicode.com/posts/1").
        then().
                assertThat().
                statusCode(200).
                body("title", equalTo("Updated title")).
                body("body", equalTo("This is the updated body content.")).
                log().all();
    }

}
