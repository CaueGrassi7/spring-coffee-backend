CREATE TABLE foods (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    image VARCHAR(255),
    price INTEGER NOT NULL
);