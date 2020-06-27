-- Table: dev.Questions

-- DROP TABLE dev."Questions";

CREATE TABLE dev."Downvotes"
(
    ans_id character varying(355),
	user_id character varying(355),
	createdatetime timestamp with time zone NOT NULL DEFAULT now(),
    CONSTRAINT "Downvotes_pkey" PRIMARY KEY (ans_id)
)

TABLESPACE pg_default;

ALTER TABLE dev."Downvotes"
    OWNER to postgres;