package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bean.pensioner;

public interface MyPensionerRepo<Pensioner> extends JpaRepository<Pensioner, Long> {

}
