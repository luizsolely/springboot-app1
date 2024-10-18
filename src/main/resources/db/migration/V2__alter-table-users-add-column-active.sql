alter table users add active TINYINT;
update users set active = 1;