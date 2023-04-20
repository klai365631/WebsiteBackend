--liquibase formatted sql

--changeset alla:1
CREATE TABLE ads
(
    ads_id     SERIAL NOT NULL,
    price      int  NOT NULL,
    title      varchar(60) NOT NULL,
    description text NOT NULL,
    user_id  INTEGER NOT NULL,
    comment_id INTEGER NOT NULL,
    ads_image_id INTEGER NOT NULL,
    PRIMARY KEY (ads_id)
);

--changeset alla:2
ALTER TABLE ads
    ADD FOREIGN KEY (user_id) REFERENCES users(user_id);
ALTER TABLE ads
    ADD FOREIGN KEY (comment_id) REFERENCES comment(comment_id);
ALTER TABLE ads
    ADD FOREIGN KEY (ads_image_id) REFERENCES ads_image(ads_image_id);