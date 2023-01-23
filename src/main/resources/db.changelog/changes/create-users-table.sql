create table users (
  id bigserial not null,
  first_name varchar(255),
  last_name varchar(255),
  password varchar(255),
  role_id bigserial not null,
  status varchar(255),
  username varchar(255) unique,
  primary key (id),
  constraint role_id
    foreign key (role_id)
        references roles(id)
);