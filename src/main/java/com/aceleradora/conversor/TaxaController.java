package com.aceleradora.conversor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TaxaController {

    @GetMapping("/converter{valor}{moedas}")
    @ResponseBody
    public List<Double> paginaInicial(@RequestParam String valor, @RequestParam String moedas){
        try{
            return TaxaService.getResults(valor, moedas);
        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }

}
