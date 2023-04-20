--liquibase formatted sql

--changeset alla:1
CREATE TABLE user_image
(
    user_image_id SERIAL NOT NULL,
    image varchar(60),
    PRIMARY KEY (user_image_id)
);