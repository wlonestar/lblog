package com.wjl.lblog.model.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wjl.lblog.common.constants.GlobalConstants;
import lombok.*;

import java.util.Date;

/**
 * @author: wjl
 * @time: 2022/4/27 14:38
 * @version: 1.0
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

    private String content;
    private String username;
    private String avatar;
    private String site;
    private String email;

}
