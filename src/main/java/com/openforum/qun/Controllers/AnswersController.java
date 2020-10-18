package com.openforum.qun.Controllers;

import com.openforum.qun.Models.Answers;
import com.openforum.qun.Repository.AnswersJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/1")
public class AnswersController {

    @Autowired
    AnswersJpaRepository answersJpaRepository;

    @GetMapping
    public List<Answers> list(){
        return answersJpaRepository.findAll();
    }

    @PostMapping
    public Answers create(@RequestBody final Answers answer){
        return answersJpaRepository.saveAndFlush(answer);
    }

}
