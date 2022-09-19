package com.banco.BancoManagement.Controller;

import com.banco.BancoManagement.ContaRepository.Conta;
import com.banco.BancoManagement.Service.ContaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class MainController {
    private final ContaService service;

    public MainController(ContaService service) {
        this.service = service;
    }

    @GetMapping("/listall")
    public ResponseEntity<List<Conta>> listall(){
        return ResponseEntity.ok(service.listall());
    }
    @GetMapping("{id}")
    public ResponseEntity<List<Conta>> FindById(@PathVariable("id")Long id){
        return ResponseEntity.ok(service.findById(id));

    }
    @PostMapping("/save")
    public ResponseEntity<Conta> save(@RequestBody Conta conta){
        return ResponseEntity.ok(service.save(conta));
    }
    @PostMapping("/delete/{id}")
    public ResponseEntity<Conta> deleteById(@PathVariable Long id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
