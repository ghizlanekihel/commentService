package com.twitter.comment.services.servicesImpl;

import com.twitter.comment.VO.ResponseTemplateVO;
import com.twitter.comment.VO.Tweet;
import com.twitter.comment.daos.CommentDao;
import com.twitter.comment.entities.Comment;
import com.twitter.comment.services.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Comment saveComment(Comment comment) {
        log.info("Inside saveComment of CommentService");
        return commentDao.save(comment);
    }

    @Override
    public Comment findCommentById(Long id) {
        log.info("Inside findCommentById of CommentService");
        return commentDao.findById(id).get();
    }

    @Override
    public ResponseTemplateVO getCommentWithTweet(Long commentId) {
        log.info("Inside getTweetWithComment of CommentService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Comment comment = commentDao.findById(commentId).get();
         Tweet tweet =
                 restTemplate.getForObject("http://TWEET-SERVICE/tweets/"+comment.getTweetId(), Tweet.class);
         vo.setComment(comment);
         vo.setTweet(tweet);
         return vo;

    }
}
