package com.wjl.lblog.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author: wjl
 * @date: 2021/12/8 18:53
 * @version: v1.0
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "role_permission")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class RolePermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "rid")
    private Long rid;

    @Column(name = "pid")
    private Long pid;

}
