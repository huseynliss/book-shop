CREATE TABLE author
(
    id    SERIAL PRIMARY KEY,
    name  VARCHAR(255),
    bio   VARCHAR(1000),
    photo VARCHAR(255)
);


CREATE TABLE publisher
(
    id      SERIAL PRIMARY KEY,
    name    VARCHAR(255),
    address VARCHAR(500),
    logo    VARCHAR(255)
);

CREATE TABLE language
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100)

);


CREATE TABLE genre
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100)
);


CREATE TABLE book
(
    id                 SERIAL PRIMARY KEY,
    is_active          BOOLEAN NOT NULL DEFAULT TRUE,
    title              VARCHAR(255)     NOT NULL,
    author_id          BIGINT           NOT NULL,
    isbn               VARCHAR(20)      NOT NULL,
    publisher_id       BIGINT           NOT NULL,
    description        VARCHAR(1000)    NOT NULL,
    price              DOUBLE PRECISION NOT NULL,
    quantity           INTEGER          NOT NULL,
    language_id        BIGINT           NOT NULL,
    cover_image        VARCHAR(255)     NOT NULL,
    rating             DOUBLE PRECISION NOT NULL,
    number_of_pages    INTEGER          NOT NULL,
    publication_format VARCHAR(50)      NOT NULL,
    discount_percent   DOUBLE PRECISION NOT NULL,
    publication_date   DATE             NOT NULL,
    FOREIGN KEY (publisher_id) REFERENCES publisher (id),
    FOREIGN KEY (language_id) REFERENCES language (id),
    FOREIGN KEY (author_id) REFERENCES author (id)
);


CREATE TABLE book_genre
(
    book_id  BIGINT NOT NULL,
    genre_id BIGINT NOT NULL,
    PRIMARY KEY (book_id, genre_id),
    FOREIGN KEY (book_id) REFERENCES book (id),
    FOREIGN KEY (genre_id) REFERENCES genre (id)
);
