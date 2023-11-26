package com.example.newsfeed_8.repository;

import com.example.newsfeed_8.entity.CommentLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentLikeRepositoy extends JpaRepository<CommentLike, Long> {
    CommentLike findByCommentIdAndMemberId(Long commentId, Long memberId);

    Object countByCommentIdAndIsLikeTrue(Long commentId);
}
