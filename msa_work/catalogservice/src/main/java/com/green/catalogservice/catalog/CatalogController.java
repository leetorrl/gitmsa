package com.green.catalogservice.catalog;

import com.green.catalogservice.catalog.service.CatalogService;
import com.green.catalogservice.catalog.vo.CatalogRespones;
import com.green.catalogservice.catalog.vo.CatalogRequest;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@CrossOrigin
public class CatalogController {

    private final CatalogService catalogService;


    @PostMapping("join")
    public ResponseEntity<OrderResponse> joinUser(@RequestBody CatalogRequest catalogRequest) {

        catalogService.join(catalogRequest);

        OrderResponse orderResponse = catalogService.join(catalogRequest);

        return ResponseEntity.ok(orderResponse);
    }


    @GetMapping("login")
    public ResponseEntity<String> getUser(
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password
    ) {

       CatalogRespones catalogRespones = catalogService.login(email, password);

        return ResponseEntity.ok(null);
    }


    @GetMapping("Kakaologin")
    public ResponseEntity<String> KakaoLogin() {

        return ResponseEntity.ok(null);
    }

}
