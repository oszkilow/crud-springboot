package com.crud.demo1;

import com.crud.demo1.entity.Cliente;
import com.crud.demo1.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repo;

    @PostMapping
    public Cliente crear(@RequestBody Cliente c){
        return repo.save(c);
    }

    @GetMapping
    public List<Cliente> listar(){
        return repo.findAll();
    }

    @PutMapping("/{id}")
    public Cliente actualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        return repo.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        repo.deleteById(id);
        };
    }
