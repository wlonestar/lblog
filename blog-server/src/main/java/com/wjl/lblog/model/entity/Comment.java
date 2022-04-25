package com.wjl.lblog.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.wjl.lblog.common.constants.GlobalConstants;
import lombok.*;

import java.util.Date;

/**
 * 留言
 *
 * @author: wjl
 * @date: 2021/9/13 22:48
 * @version: v1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "comment")
public class Comment {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 留言正文
     */
    private String content;

    /**
     * 昵称
     */
    private String username;

    /**
     * 头像
     */
    @NonNull
    @Builder.Default
    private String avatar = GlobalConstants.AVATAR;

    /**
     * 个人网站
     */
    private String site;

    /**
     * 邮箱
     */
    private String email;

}
