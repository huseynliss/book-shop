CREATE TABLE book (
                      id SERIAL PRIMARY KEY,
                      title VARCHAR(255),
                      author VARCHAR(255),
                      isbn VARCHAR(20),
                      publisher VARCHAR(255),
                      genre VARCHAR(100),
                      description VARCHAR(1000),
                      price DECIMAL(10, 2),
                      quantity INTEGER,
                      language VARCHAR(50),
                      coverImage VARCHAR(255),
                      rating DECIMAL(3, 2),
                      numberOfPages INTEGER,
                      publicationFormat VARCHAR(50),
                      discountPercent DECIMAL(5, 2),
                      publicationDate DATE
);
