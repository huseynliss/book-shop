CREATE TABLE author (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255),
                        bio VARCHAR(1000),
                        photo VARCHAR(255)
);


CREATE TABLE publisher (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(255),
                           address VARCHAR(500),
                           logo VARCHAR(255)
);

CREATE TABLE language (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(100),
                          code VARCHAR(10)
);


CREATE TABLE genre (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(100)
);


CREATE TABLE book (
                      id SERIAL PRIMARY KEY,
                      title VARCHAR(255) NOT NULL,
                      author_id BIGINT NOT NULL,
                      isbn VARCHAR(20) NOT NULL,
                      publisher_id BIGINT NOT NULL,
                      genre_id BIGINT NOT NULL,
                      description VARCHAR(1000) NOT NULL,
                      price DOUBLE PRECISION NOT NULL,
                      quantity INTEGER NOT NULL,
                      language_id BIGINT NOT NULL,
                      coverImage VARCHAR(255),
                      rating DOUBLE PRECISION NOT NULL,
                      numberOfPages INTEGER NOT NULL,
                      publicationFormat VARCHAR(50) NOT NULL,
                      discountPercent DOUBLE PRECISION NOT NULL,
                      publicationDate DATE NOT NULL,
                      FOREIGN KEY (author_id) REFERENCES author(id),
                      FOREIGN KEY (publisher_id) REFERENCES publisher(id),
                      FOREIGN KEY (genre_id) REFERENCES genre(id),
                      FOREIGN KEY (language_id) REFERENCES language(id)
);
