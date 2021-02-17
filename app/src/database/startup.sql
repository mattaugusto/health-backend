CREATE DATABASE health
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

CREATE SEQUENCE ben_id_seq;

CREATE TABLE public.beneficiaries
(
	id INTEGER PRIMARY KEY DEFAULT NEXTVAL('ben_id_seq'), ,
	first_name text COLLATE pg_catalog."default" NOT NULL,
	last_name text COLLATE pg_catalog."default" NOT NULL,
	username text COLLATE pg_catalog."default" NOT NULL,
    city text COLLATE pg_catalog."default" NOT NULL,
    state text COLLATE pg_catalog."default" NOT NULL,
    zip text COLLATE pg_catalog."default" NOT NULL,
)

TABLESPACE pg_default;

ALTER TABLE public.beneficiaries
    OWNER to postgres;