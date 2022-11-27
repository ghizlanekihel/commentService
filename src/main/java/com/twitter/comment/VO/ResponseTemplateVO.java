package com.twitter.comment.VO;

import com.twitter.comment.entities.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Comment comment;
    private Tweet tweet;

}
