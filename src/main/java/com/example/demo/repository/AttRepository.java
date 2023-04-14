package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import com.example.demo.model.Atividade;

@Component
public interface AttRepository extends JpaRepository<Atividade, Integer> {
    List<Atividade> findByNameContaining(String name);

    @Query(value="SELECT u FROM Atividade as u WHERE u.type = :x")
    List<Atividade> findByTypeAtividades(@Param("x") String type);
}
