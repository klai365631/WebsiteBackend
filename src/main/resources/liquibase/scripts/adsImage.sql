--liquibase formatted sql

--changeset alla:1
CREATE TABLE ads_image
(
    ads_image_id SERIAL NOT NULL,
    image varchar(60),
    PRIMARY KEY (ads_image_id)
);