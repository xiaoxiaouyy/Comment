package com.xiao.dao;

import com.xiao.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */

@Mapper
@Repository
public interface CommentDao {
    //添加一个评论
    int saveComment(Comment comment);

    //查询父级评论
    List<Comment> findByParentIdNull(@Param("ParentId") Long ParentId);

    //查询一级回复
    List<Comment> findParentIdNotNull(@Param("id") Long id);

    //查询二级以及所有子集回复
    List<Comment> findByReplayId(@Param("childId") Long childId);

    List<Comment> findByParentIdNotNull(Long id);
}
