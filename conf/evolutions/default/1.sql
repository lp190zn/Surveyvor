# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table login (
  id                        bigint not null,
  firstname                 varchar(255),
  password                  varchar(255),
  constraint pk_login primary key (id))
;

create table survey (
  id                        bigint not null,
  title                     varchar(255),
  question1                 varchar(255),
  answer_first1             varchar(255),
  answer_first2             varchar(255),
  answer_first3             varchar(255),
  answer_first4             varchar(255),
  right_answer_first        varchar(255),
  question2                 varchar(255),
  answer_sec1               varchar(255),
  answer_sec2               varchar(255),
  answer_sec3               varchar(255),
  answer_sec4               varchar(255),
  right_answer_sec          varchar(255),
  question3                 varchar(255),
  answer_third1             varchar(255),
  answer_third2             varchar(255),
  answer_third3             varchar(255),
  answer_third4             varchar(255),
  right_answer_third        varchar(255),
  question4                 varchar(255),
  answer_fourth1            varchar(255),
  answer_fourth2            varchar(255),
  answer_fourth3            varchar(255),
  answer_fourth4            varchar(255),
  right_answer_fourth       varchar(255),
  question5                 varchar(255),
  answer_fifth1             varchar(255),
  answer_fifth2             varchar(255),
  answer_fifth3             varchar(255),
  answer_fifth4             varchar(255),
  right_answer_fifth        varchar(255),
  constraint pk_survey primary key (id))
;

create table user (
  id                        bigint not null,
  username                  varchar(255),
  email                     varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (id))
;

create table user_answers (
  id                        bigint not null,
  number                    integer,
  surveytitle               varchar(255),
  answer_first              varchar(255),
  answer_sec                varchar(255),
  answer_third              varchar(255),
  answer_fourth             varchar(255),
  answer_fifth              varchar(255),
  constraint pk_user_answers primary key (id))
;

create sequence users_seq;

create sequence survey_seq;

create sequence user_seq;

create sequence user_answers_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists login;

drop table if exists survey;

drop table if exists user;

drop table if exists user_answers;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists users_seq;

drop sequence if exists survey_seq;

drop sequence if exists user_seq;

drop sequence if exists user_answers_seq;

