-- Last updated: 09/07/2026, 15:08:26
select distinct author_id as id from Views
where author_id = viewer_id 
order by id;
