package com.openforum.qun.Repository;

import com.openforum.qun.Models.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsJpaRepository extends JpaRepository<Questions, Integer> {
}
