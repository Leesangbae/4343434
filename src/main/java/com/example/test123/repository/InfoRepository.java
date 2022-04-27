package com.example.test123.repository;

import com.example.test123.domain.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface InfoRepository extends JpaRepository<Info, Long> {
}
