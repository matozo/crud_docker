package com.example.matozao.crud_docker.repository;

import com.example.matozao.crud_docker.domain.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VagaRepository extends JpaRepository<Vaga, Integer> {

    @Query(value = "update vaga set numero = :numero, nomeProprietario = :nomeProprietario where id = :id", nativeQuery = true)
    void updateVaga(@Param("id") Integer id, @Param("numero") Integer numero,
                    @Param("nomeProprietario") String nomeProprietario);
}
