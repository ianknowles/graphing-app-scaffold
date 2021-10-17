-- !Ups

create table if not exists "people" (
  --"id" bigint generated always as (identity(start with 1)) not null primary key,
  "name" varchar not null,
  "age" int not null
);

-- !Downs

drop table if exists "people";
