CREATE TABLE case_table
(
    cuid character varying(255) COLLATE pg_catalog."default" NOT NULL,
    caseId character varying(255) COLLATE pg_catalog."default",
    caseType character varying(255) COLLATE pg_catalog."default" NOT NULL,
    caseYear character varying(255) COLLATE pg_catalog."default" NOT NULL,
    caseTitle character varying(255) COLLATE pg_catalog."default" NOT NULL,
    forumId character varying(255) COLLATE pg_catalog."default" NOT NULL,
    caseStatus character varying(255) COLLATE pg_catalog."default" NOT NULL,
    applicant character varying(255) COLLATE pg_catalog."default" NOT NULL,
    respondant character varying(255) COLLATE pg_catalog."default" NOT NULL,
    createdBy character varying(255) COLLATE pg_catalog."default" NOT NULL,
    createdAt timestamp without time zone NOT NULL,
    updatedAt timestamp without time zone NOT NULL,
    
    CONSTRAINT case_table_pkey PRIMARY KEY (cuid)
)