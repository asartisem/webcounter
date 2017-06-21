CREATE SCHEMA IF NOT EXISTS schema;

CREATE TABLE IF NOT EXISTS schema.counter (
  id INT PRIMARY KEY,
  value INT
);

INSERT INTO schema.counter (id, value)
     SELECT 1, 0
      WHERE NOT EXISTS (
          SELECT * FROM schema.counter WHERE id = 1);