package com.openforum.qun.Controllers;

import com.openforum.qun.Models.Answers;
import com.openforum.qun.Repository.AnswersJpaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/answer")
public class AnswersController {

    @Autowired
    AnswersJpaRepository answersJpaRepository;

    @GetMapping
    @RequestMapping("/list")
    public List<Answers> list(){
        return answersJpaRepository.findAll();
    }

    @PostMapping
    @RequestMapping("/create")
    public Answers create(@RequestBody final Answers answers){
        return answersJpaRepository.saveAndFlush(answers);
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Answers getById(@PathVariable int id){
        return answersJpaRepository.getOne(id);
    }

    @PutMapping
    @RequestMapping("/{id}/update")
    public Answers update(@PathVariable int id, @RequestBody final Answers answers){
        Answers answers1 = answersJpaRepository.getOne(id);
        BeanUtils.copyProperties(answers,answers1,"ans_id","ans_uuid","createdatetime");
        return answersJpaRepository.saveAndFlush(answers1);
    }

    @DeleteMapping
    @RequestMapping("{id}/delete")
    public String delete(@PathVariable int id){
        answersJpaRepository.deleteById(id);
        return "Successfully deleted the answer";
    }

}
