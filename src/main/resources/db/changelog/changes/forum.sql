CREATE TABLE forum_table
(
    fuid character varying(255) COLLATE pg_catalog."default" NOT NULL,
    forumId character varying(255) COLLATE pg_catalog."default",
    forumCategory character varying(255) COLLATE pg_catalog."default" NOT NULL,
    forumDir character varying(255) COLLATE pg_catalog."default" NOT NULL,
    forumGroup character varying(255) COLLATE pg_catalog."default" NOT NULL,
    fullName character varying(255) COLLATE pg_catalog."default" NOT NULL,
    shortName character varying(255) COLLATE pg_catalog."default" NOT NULL,
    createdAt timestamp without time zone NOT NULL,
    updatedAt timestamp without time zone NOT NULL,
    
    CONSTRAINT forum_table_pkey PRIMARY KEY (fuid)
)