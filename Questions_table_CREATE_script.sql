-- Table: dev.Questions

-- DROP TABLE dev."Questions";

CREATE TABLE dev."Questions"
(
    qn_id SERIAL,
    qn character varying(355) COLLATE pg_catalog."default" NOT NULL,
    qn_uuid uuid DEFAULT uuid_generate_v4(),
    createdatetime timestamp with time zone NOT NULL DEFAULT now(),
    CONSTRAINT "Questions_pkey" PRIMARY KEY (qn_id),
    CONSTRAINT "Questions_qn_key" UNIQUE (qn)
)

TABLESPACE pg_default;

ALTER TABLE dev."Questions"
    OWNER to postgres;
