package com.twitter.comment.daos;

import com.twitter.comment.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@RequestMapping
public interface CommentDao extends JpaRepository<Comment, Long> {


}
