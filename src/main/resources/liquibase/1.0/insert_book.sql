-- Authors
INSERT INTO author (name, bio, photo) VALUES
                                          ('Author Name 1', 'Author Bio 1', 'https://www.bing.com/th?id=OIP.uuI8Gk1_gyAujV7nCkCnYwHaHP&w=189&h=185&c=8&rs=1&qlt=90&o=6&dpr=1.5&pid=3.1&rm=2'),
                                          ('Author Name 2', 'Author Bio 2', 'https://www.bing.com/th?id=OIP.uuI8Gk1_gyAujV7nCkCnYwHaHP&w=189&h=185&c=8&rs=1&qlt=90&o=6&dpr=1.5&pid=3.1&rm=2');

-- Publishers
INSERT INTO publisher (name, address, logo) VALUES
                                                ('Publisher Name 1', 'Publisher Address 1', 'https://th.bing.com/th/id/OIP.kbYh9dB6T3X9Hu8zrXG12gHaID?w=158&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7'),
                                                ('Publisher Name 2', 'Publisher Address 2', 'https://th.bing.com/th/id/OIP.kbYh9dB6T3X9Hu8zrXG12gHaID?w=158&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7');


-- Languages
INSERT INTO language (name) VALUES
                                ('English'),
                                ('French'),
                                ('German');

-- Genres
INSERT INTO genre (name) VALUES
                             ('Science Fiction'),
                             ('Mystery'),
                             ('Romance');

-- Books
INSERT INTO book (is_active, title, author_id, isbn, publisher_id, description, price, quantity, language_id, cover_image, rating, number_of_pages, publication_format, discount_percent, publication_date) VALUES
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 3.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 2.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 2.1, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 1', 1, 'ISBN123456789', 1, 'Book Description 1', 29.99, 100, 1, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.5, 300, 'Paperback', 10, '2023-08-01'),
                                                                                                                                                                                                                (true, 'Book Title 2', 2, 'ISBN987654321', 2, 'Book Description 2', 24.99, 150, 2, 'https://th.bing.com/th/id/OIP.NekzM9WwPFgPJJAcwObH7wAAAA?w=115&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7', 4.2, 250, 'Hardcover', 15, '2023-07-15');


-- Books-Genres Relationships
INSERT INTO book_genre (book_id, genre_id) VALUES
                                               (1, 1), -- Book 1 - Science Fiction
                                               (1, 2), -- Book 1 - Mystery
                                               (2, 2), -- Book 2 - Mystery
                                               (2, 3); -- Book 2 - Romance
