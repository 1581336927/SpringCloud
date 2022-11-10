package com.hcy.springcloud7002.contorller;


import com.hcy.springcloud.entities.CommonResult;
import com.hcy.springcloud.entities.Payment;
import com.hcy.springcloud7002.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment){
        int result= paymentService.create(payment);
        log.info("-----插入结果{}",result);
        return result>0 ? new CommonResult(200,"插入成功",result) : new CommonResult(500,"插入失败",result);
    }


    @GetMapping(value = "/get/{id}")
    public CommonResult get(@PathVariable("id")Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("-----查询结果{}",paymentById);
        return new CommonResult(200,"查询结果",paymentById);
    }
}
