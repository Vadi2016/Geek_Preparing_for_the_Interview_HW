DROP TABLE IF EXISTS fllms CASCADE;
CREATE TABLE films
(
    id              SERIAL,
    title        VARCHAR(50) NOT NULL,
    duration  INTEGER,
    PRIMARY KEY (id)
);



DROP TABLE IF EXISTS sessions CASCADE;
CREATE TABLE sessions
(
    id         SERIAL,
    film_id INTEGER NOT NULL,
    cost  INTEGER NOT NULL,
    start_time INTEGER NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT FK_FILM_ID_SESSION FOREIGN KEY (film_id)
        REFERENCES films (id)
        ON DELETE NO ACTION ON UPDATE NO ACTION,
);

DROP TABLE IF EXISTS tickets CASCADE;
CREATE TABLE tickets
(
    id   SERIAL,
    num INTEGER NOT NULL,
    session_id INTEGER NOT NULL
    PRIMARY KEY (id),
    CONSTRAINT FK_SESSION_ID_TIKETS FOREIGN KEY (session_id)
        REFERENCES sessions (id)
        ON DELETE NO ACTION ON UPDATE NO ACTION,
);

