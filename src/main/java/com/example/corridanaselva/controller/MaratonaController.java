package com.example.corridanaselva.controller;

import com.example.corridanaselva.service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MaratonaController {
    @Autowired
    private MaratonistaService maratonistaService;




}
