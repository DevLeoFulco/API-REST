package com.TanqueCheio.TanqueCheio.controller;


import com.TanqueCheio.TanqueCheio.entites.PostoComb;
import com.TanqueCheio.TanqueCheio.entites.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping (value = "/posto")
public class ControllerPosto {
    @GetMapping
    public List <Usuario> getObjects(){

        PostoComb p2 = new PostoComb(02L,"Posto Ipiranga", "Rua dos navegantes, 5001 - Boa Viagem", "Gas Natural", 5.78,5.89,3.49,3.01,3.12,2.10);

        Usuario u1 = new Usuario(02L,"Leandresson Fulco","HRV", 150.00, 50.5, p2);
        Usuario u2 = new Usuario(02L,"Karla Roberta","Corolla", 80.00, 25.5, p2);
        List<Usuario> list = Arrays.asList(u1, u2);
        return list;
    }

}
