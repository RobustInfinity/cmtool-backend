CREATE TABLE session_table
(
    sessionId character varying(255) COLLATE pg_catalog."default" NOT NULL,
    token character varying(255) COLLATE pg_catalog."default" NOT NULL,
    role character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    uuid character varying(255) COLLATE pg_catalog."default" NOT NULL,
    expiresIn smallint COLLATE pg_catalog."default" NOT NULL,
    createdAt timestamp without time zone NOT NULL,
    expiresAt timestamp without time zone NOT NULL,
    
    CONSTRAINT session_table_pkey PRIMARY KEY (sessionId)
)