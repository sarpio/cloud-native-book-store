CREATE TABLE book (
                      id                  BIGINT PRIMARY KEY NOT NULL auto_increment,
                      author              varchar(255) NOT NULL,
                      isbn                varchar(255) UNIQUE NOT NULL,
                      price               DOUBLE NOT NULL,
                      title               varchar(255) NOT NULL,
                      created_date        timestamp NOT NULL,
                      last_modified_date  timestamp NOT NULL,
                      version             integer NOT NULL,
                      publisher           varchar(255)
);