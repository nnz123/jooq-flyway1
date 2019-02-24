CREATE TABLE `book` (
  `id` int NOT NULL,
  `author_id` int NOT NULL,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO book VALUES (1, 1, 'AA');
INSERT INTO book VALUES (2, 1, 'BB');
INSERT INTO book VALUES (3, 2, 'CC');
INSERT INTO book VALUES (4, 2, 'DD');
ALTER TABLE book ADD COLUMN langue_id INT(7) DEFAULT '1' NOT NULL;