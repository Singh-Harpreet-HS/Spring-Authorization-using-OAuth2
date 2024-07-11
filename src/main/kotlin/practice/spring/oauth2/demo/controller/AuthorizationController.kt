package practice.spring.oauth2.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/authorization")
class AuthorizationController {

    @GetMapping
    fun getAuthorizationGreeting(): ResponseEntity<String> {
        return ResponseEntity.ok("Authorization Greeting: Hello, World! Harvinder has signed in")
    }
}