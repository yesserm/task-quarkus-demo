CREATE TABLE Task (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    completed BOOLEAN DEFAULT FALSE
);

INSERT INTO Task (title, completed) VALUES
  ('Aprender Quarkus', false),
  ('Configurar Angular', true),
  ('Integrar backend y frontend', false);