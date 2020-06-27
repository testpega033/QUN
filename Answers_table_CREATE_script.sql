-- Table: dev.Answers

-- DROP TABLE dev."Answers";

CREATE TABLE dev."Answers"
(
    ans_id SERIAL,
    ans character varying(355) COLLATE pg_catalog."default" NOT NULL,
    ans_uuid uuid DEFAULT uuid_generate_v4(),
    createdatetime timestamp with time zone NOT NULL DEFAULT now(),
    updatedatetime timestamp with time zone NOT NULL DEFAULT now(),
    CONSTRAINT "Answers_pkey" PRIMARY KEY (ans_id),
    CONSTRAINT "Answers_qn_key" UNIQUE (ans, createdatetime)
)

TABLESPACE pg_default;

ALTER TABLE dev."Answers"
    OWNER to postgres;