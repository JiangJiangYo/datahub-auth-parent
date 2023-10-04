package live.hub.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth/")
public class UserController {
    @GetMapping("userInfo")
    public ResponseEntity userInfo() {
        return ResponseEntity.ok("阳光很暖");
    }
}
