--CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS users (
    id UUID DEFAULT uuid_generate_v4(),
    first_name VARCHAR(128),
    last_name VARCHAR(128),
    middle_name VARCHAR(128),
    blood_group VARCHAR(2),
    blood_rh VARCHAR(20),
    blood_kell VARCHAR(20),
    created_at TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT PK_USER PRIMARY KEY (id)
);