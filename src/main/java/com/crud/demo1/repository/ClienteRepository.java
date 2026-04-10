package com.crud.demo1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.demo1.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    void deleteById(Long id);
}
