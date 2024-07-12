# 스키마 생성
create database bbmc_study;

# 스키마 선택
use bbmc_study;

create table t_member
(
    id       varchar(10) primary key,
    pwd      varchar(10),
    name     varchar(50),
    email    varchar(50),
    joinDate datetime default now()
);


insert into t_member
    value ('hong', 1212, '홍길동', 'hong@gmail.com', now());


insert into t_member
    value ('hong2', 1212, '홍길동2', 'hong2@gmail.com', now());

insert into t_member
    value ('hong3', 1212, '홍길동3', 'hong3@gmail.com', now());

