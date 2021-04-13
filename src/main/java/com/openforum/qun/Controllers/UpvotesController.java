package com.openforum.qun.Controllers;

import com.openforum.qun.Models.Upvotes;
import com.openforum.qun.Repository.UpvotesJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/upvote")
@RestController
public class UpvotesController {

    @Autowired
    UpvotesJpaRepository upvotesJpaRepository;

    @GetMapping
    @RequestMapping("/list")
    public List<Upvotes> list(){
        return upvotesJpaRepository.findAll();
    }

    @PostMapping
    @RequestMapping("/create")
    public String create(@RequestBody final Upvotes upvotes){
        upvotesJpaRepository.saveAndFlush(upvotes);
        return "Successfully upvoted";
    }
}
