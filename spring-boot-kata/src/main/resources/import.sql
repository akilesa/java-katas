
insert into sys_order(id, code) values(1, 'order1');

insert into sys_good (id, name) values(1, 'good1');
insert into sys_good (id, name) values(2, 'good2');
insert into sys_good (id, name) values(3, 'good3');
insert into sys_good (id, name) values(4, 'good4');
insert into sys_good (id, name) values(5, 'good5');
insert into sys_good (id, name) values(6, 'good6');

insert into sys_order_item (id, order_id, good_id, quantity) values (1, 1, 1, 5);
insert into sys_order_item (id, order_id, good_id, quantity) values (2, 1, 2, 8);