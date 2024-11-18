package com.green.orderservice.order;

import com.green.orderservice.order.service.OrderService;
import com.green.orderservice.order.vo.OrderRespones;
import com.green.orderservice.order.vo.OrderRequest;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@CrossOrigin
public class OrderController {

    private final OrderService orderService;


    @PostMapping("join")
    public ResponseEntity<OrderResponse> joinUser(@RequestBody OrderRequest orderRequest) {

        orderService.join(orderRequest);

        OrderResponse orderResponse = orderService.join(orderRequest);

        return ResponseEntity.ok(orderResponse);
    }


    @GetMapping("login")
    public ResponseEntity<String> getUser(
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password
    ) {

       OrderRespones orderRespones = orderService.login(email, password);

        return ResponseEntity.ok(null);
    }


    @GetMapping("Kakaologin")
    public ResponseEntity<String> KakaoLogin() {

        return ResponseEntity.ok(null);
    }

}
