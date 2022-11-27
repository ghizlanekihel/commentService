package com.twitter.comment.controllers;

import com.twitter.comment.VO.ResponseTemplateVO;
import com.twitter.comment.entities.Comment;
import com.twitter.comment.services.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/comments")
@RestController
@Slf4j
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/")
    public Comment saveComment(@RequestBody Comment comment){
        log.info("Inside saveComment method of commentContoller");
        return commentService.saveComment(comment);
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getCommentWithTweet(@PathVariable("id") Long commentId){
        log.info("Inside getTweetWithComment method of commentContoller");
        return commentService.getCommentWithTweet(commentId);
    }

}
