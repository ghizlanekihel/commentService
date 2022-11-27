package com.twitter.comment.services;

import com.twitter.comment.VO.ResponseTemplateVO;
import com.twitter.comment.entities.Comment;


import java.util.Optional;

public interface CommentService {
    Comment saveComment(Comment comment);

    Comment findCommentById(Long id);


    ResponseTemplateVO getCommentWithTweet(Long commentId);
}
