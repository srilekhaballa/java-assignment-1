-- public.employee definition

-- Drop table

-- DROP TABLE public.employee;

CREATE TABLE public.employee (
	"name" varchar NULL,
	empid numeric NOT NULL,
	email varchar NULL,
	phone numeric NULL,
	created_by varchar NULL,
	created_on date NULL,
	CONSTRAINT employee_pk PRIMARY KEY (empid)
);