CREATE TABLE IF NOT EXISTS projects (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  created_at TIMESTAMP NOT NULL
);

CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    status VARCHAR(20),
    assignee VARCHAR(100),
    deadline TIMESTAMP,
    project_id BIGINT,
    CONSTRAINT fk_project FOREIGN KEY (project_id) REFERENCES projects(id)
);