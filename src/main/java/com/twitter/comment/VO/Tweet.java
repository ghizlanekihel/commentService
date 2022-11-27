package com.twitter.comment.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tweet {
    private Long id;
    private String content;
    private Date date;
    private Long userId;
    private Long hashtagId;

}
