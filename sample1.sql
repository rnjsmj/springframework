create table sample(num int, title varchar2(50), res timestamp default sysdate);

insert into sample values(1, 'sample1', default);
insert into sample values(2, 'sample2', default);
insert into sample values(3, 'sample3', default);

select * from sample;
