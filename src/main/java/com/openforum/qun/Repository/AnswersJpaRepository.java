package com.openforum.qun.Repository;

import com.openforum.qun.Models.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AnswersJpaRepository extends JpaRepository<Answers,Long> {
}
