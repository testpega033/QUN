-- Table: dev.Upvotes

-- DROP TABLE dev."Upvotes";

CREATE TABLE dev."Upvotes"
(
    ans_id character varying(355) COLLATE pg_catalog."default" NOT NULL,
    user_id character varying(355) COLLATE pg_catalog."default",
    createdatetime timestamp with time zone NOT NULL DEFAULT now(),
    CONSTRAINT "Upvotes_pkey" PRIMARY KEY (ans_id)
)

TABLESPACE pg_default;

ALTER TABLE dev."Upvotes"
    OWNER to postgres;