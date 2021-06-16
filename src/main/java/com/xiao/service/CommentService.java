package com.xiao.service;
import com.xiao.entity.Comment;

import java.util.List;

public interface CommentService {
    //查询评论列表
    List<Comment> listComment();

    //保存评论
    int saveComment(Comment comment);
}
