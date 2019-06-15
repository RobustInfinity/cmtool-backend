CREATE TABLE user_table
(
    uuid character varying(255) COLLATE pg_catalog."default" NOT NULL,
    userName character varying(255) COLLATE pg_catalog."default",
    firstName character varying(255) COLLATE pg_catalog."default" NOT NULL,
    lastName character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    mobileNo character varying(255) COLLATE pg_catalog."default" NOT NULL,
    password character varying(255) COLLATE pg_catalog."default" NOT NULL,
    salt character varying(255) COLLATE pg_catalog."default" NOT NULL,
    role character varying(255) COLLATE pg_catalog."default" NOT NULL,
    createdAt timestamp without time zone NOT NULL,
    updatedAt timestamp without time zone NOT NULL,
    
    CONSTRAINT user_table_pkey PRIMARY KEY (uuid)
)