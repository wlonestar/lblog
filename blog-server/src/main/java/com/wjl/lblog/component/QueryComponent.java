package com.wjl.lblog.component;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

/**
 * @author: wjl
 * @date: 2021/10/9 19:13
 * @version: v1.0
 */
@Component
public class QueryComponent {

    @Autowired
    EntityManager entityManager;

    @PostConstruct
    public JPAQueryFactory queryFactory() {
        return new JPAQueryFactory(entityManager);
    }

}
