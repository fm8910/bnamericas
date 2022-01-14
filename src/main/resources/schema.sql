drop table if exists feriados;

create table feriados(
    id serial not null primary key not null,
    date date,
    title character varying (200),
    extra character varying(200)
);
