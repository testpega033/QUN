package com.openforum.qun.Controllers;

import com.openforum.qun.Models.Answers;
import com.openforum.qun.Models.Questions;
import com.openforum.qun.Repository.QuestionsJpaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/question")
@RestController
public class QuestionsController {

    @Autowired
    QuestionsJpaRepository questionsJpaRepository;

    @GetMapping
    @RequestMapping("/list")
    public List<Questions> list(){
        return questionsJpaRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Questions getAnswerById(@PathVariable int id){
        return questionsJpaRepository.getOne(id);
    }

    @PostMapping
    @RequestMapping("/create")
    public Questions create(@RequestBody Questions questions){
        return questionsJpaRepository.saveAndFlush(questions);
    }

    @PutMapping
    @RequestMapping("{id}/update")
    public Questions update(@PathVariable int id, @RequestBody Questions questions){
        Questions questions1 = questionsJpaRepository.getOne(id);
        BeanUtils.copyProperties(questions,questions1,"qn_id","qn_uuid","createdatetime");
        return questionsJpaRepository.saveAndFlush(questions1);
    }

    @DeleteMapping
    @RequestMapping("/{id}/delete")
    public String deleteQuestionById(@PathVariable int id){
        questionsJpaRepository.deleteById(id);
        return "Successfully deleted the question";
    }
}
