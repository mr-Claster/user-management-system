INSERT INTO roles(role)
VALUES ('ADMIN');
INSERT INTO roles(role)
VALUES ('USER');
INSERT INTO users(first_name, last_name, password, role_id, status, username)
VALUES ('Admin', 'Admin', '$2a$04$fkyWXsd/e9ZkOSiUDay64euI/bB4L4JuHKLIkIfDepbff8cmFhwOS', 1, 'ACTIVE', 'Admin');