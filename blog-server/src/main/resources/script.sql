create table article
(
    id          bigint auto_increment
        primary key,
    create_time datetime      null,
    modify_time datetime      null,
    title       varchar(255)  null,
    summary     varchar(1000) null,
    image       varchar(1000) null,
    content     longtext      null,
    category_id bigint        null
);

create table article_tag
(
    id  bigint auto_increment
        primary key,
    uid bigint null,
    tid bigint null
);

create table category
(
    id          bigint auto_increment
        primary key,
    create_time datetime      null,
    modify_time datetime      null,
    name        varchar(255)  null,
    number      int default 0 null
);

create table comment
(
    id          bigint auto_increment
        primary key,
    create_time datetime      null,
    content     longtext      null,
    username    varchar(255)  null,
    avatar      varchar(1000) null,
    site        varchar(255)  null,
    email       varchar(255)  null
);

create table image
(
    id          bigint auto_increment
        primary key,
    create_time datetime      null,
    name        varchar(255)  null,
    url         varchar(1000) null
);

create table tag
(
    id          bigint auto_increment
        primary key,
    create_time datetime      null,
    modify_time datetime      null,
    name        varchar(255)  null,
    number      int default 0 null
);

create table timeline
(
    id          bigint auto_increment
        primary key,
    create_time datetime     null,
    modify_time datetime     null,
    title       varchar(255) null,
    content     varchar(500) null
);

create table user
(
    id        bigint auto_increment
        primary key,
    username  varchar(255)  null,
    password  varchar(255)  null,
    token     varchar(500)  null,
    avatar    varchar(1000) null,
    age       int           null,
    gender    int           null,
    location  varchar(255)  null,
    signature varchar(255)  null,
    profile   longtext      null
);
