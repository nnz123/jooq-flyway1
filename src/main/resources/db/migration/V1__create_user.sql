CREATE TABLE `author` (
  `id` int NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO author VALUES (1, 'nn', 'zhang');
INSERT INTO author VALUES (2, 'yy', 'yang');