-- Table: dev.QnAnsLink

-- DROP TABLE dev."QnAnsLink";

CREATE TABLE dev."QnAnsLink"
(
    qn_id character varying(355) COLLATE pg_catalog."default" NOT NULL,
    ans_id character varying(355) COLLATE pg_catalog."default",
    CONSTRAINT "QnAnsLink_pkey" PRIMARY KEY (qn_id)
)

TABLESPACE pg_default;

ALTER TABLE dev."QnAnsLink"
    OWNER to postgres;