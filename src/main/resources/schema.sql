create table member
(
    id           bigint auto_increment comment '회원 식별번호',
    name         varchar(20)                        not null comment '회원 이름',
    nickname     varchar(30)                        not null comment '회원 닉네임',
    password     char(128)                          not null comment '암호화를 통해 128자로 고정',
    salt         char(16)                           not null comment 'Hash salt 암호',
    phone_number varchar(11)                        not null comment '전화번호',
    email        varchar(100)                       not null comment '이메일',
    gender       char     default 'N'               null comment 'N : None, M : 남성, F : 여성',
    created_at   datetime default current_timestamp null comment '생성일시 (UTC)',
    updated_at   datetime default current_timestamp on update current_timestamp null comment '수정일시 (UTC)',
    constraint member_pk
        primary key (id)
)
    comment '회원';

create index member_idx_email
    on member (email);

create index member_idx_name
    on member (name);

create table orders
(
    id           bigint auto_increment comment '주문 식별번호',
    order_idx    varchar(12)                        not null comment '주문번호',
    product_name varchar(100)                       null comment '제품명',
    orderer_id   bigint                             not null comment '주문자',
    order_at     datetime default current_timestamp null comment '주문일시 (UTC)',
    updated_at   datetime default current_timestamp on update current_timestamp null comment '수정일시 (UTC)',
    constraint orders_pk
        primary key (id),
    constraint orders_fk_member
        foreign key (orderer_id) references member (id)
)
    comment '주문';

create unique index orders_uk_order_idx
    on orders (order_idx);