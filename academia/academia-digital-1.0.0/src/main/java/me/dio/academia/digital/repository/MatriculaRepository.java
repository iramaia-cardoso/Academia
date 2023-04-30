package me.dio.academia.digital.repository;

import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.Matricula;

@Repository
public interface MatriculaRepository {

    Matricula save(Matricula matricula);
}
