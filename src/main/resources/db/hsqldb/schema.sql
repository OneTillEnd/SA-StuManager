DROP TABLE students IF EXISTS;

CREATE TABLE students (
	id		INTEGER IDENTITY PRIMARY KEY,
	name		VARCHAR(30),
	gender		VARCHAR(6),
	birth_date	DATE,
	birth_place	VARCHAR(255),
	department	VARCHAR(30)
);
CREATE INDEX students_name ON students (name);
