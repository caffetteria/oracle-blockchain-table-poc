create sequence BlOCKCHAIN_TABLE_SEQ start with 1 increment by 1;
create sequence NORMAL_TABLE_SEQ start with 1 increment by 1;
create table BlOCKCHAIN_TABLE (dataCreazione timestamp(6), dataModifica timestamp(6), id number(19,0) not null, idStato number(19,0), note varchar2(255 char), primary key (id));
create table NORMAL_TABLE (dataCreazione timestamp(6), dataModifica timestamp(6), id number(19,0) not null, idStato number(19,0), note varchar2(255 char), primary key (id));
