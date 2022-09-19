package com.banco.BancoManagement.Service;

import com.banco.BancoManagement.ContaRepository.Conta;
import com.banco.BancoManagement.Repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaService {
    private final ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public List<Conta> findById(Long id){
Optional<Conta> conta = contaRepository.findById(id);
List<Conta>contalist =conta.stream().toList();
if(contalist.isEmpty()){
    throw new IllegalArgumentException("Não existe esse id");
} return contalist;
    }
    public List<Conta> listall(){return contaRepository.findAll();}

    public Conta save(Conta conta){
       return contaRepository.save(conta);
    }
    public void deleteById(Long id){

                contaRepository.deleteById(id);
                return;
    }


}
