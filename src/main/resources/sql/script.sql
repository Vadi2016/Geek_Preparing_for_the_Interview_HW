DROP TABLE IF EXISTS films CASCADE;
CREATE TABLE films
(
    id       SERIAL,
    title    VARCHAR(50) NOT NULL,
    duration INTEGER     NOT NULL,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS tickets CASCADE;
CREATE TABLE tickets
(
    id         SERIAL,
    num        INTEGER NOT NULL,
    session_id INTEGER NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT FK_SESSIONS_ID FOREIGN KEY (session_id)
        REFERENCES sessions (id)
        ON DELETE NO ACTION ON UPDATE NO ACTION

);


DROP TABLE IF EXISTS sessions CASCADE;
CREATE TABLE sessions
(
    id         SERIAL,
    film_id    INTEGER   NOT NULL,
    cost       INTEGER   NOT NULL,
    start_time TIMESTAMP WITH TIME ZONE NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT FK_FILM_ID_SESSION FOREIGN KEY (film_id)
        REFERENCES films (id)
        ON DELETE NO ACTION ON UPDATE NO ACTION
);


INSERT INTO films(title, duration)
VALUES ('Web', 60),
       ('Net', 90),
       ('Bed or Good', 120),
       ('Hug all', 90);


INSERT INTO sessions(film_id, cost, start_time)
VALUES (1, 100, '2019-10-08 07:00:00'),
       (1, 200, '2019-10-08 12:00:00'),
       (1, 350, '2019-10-08 18:00:00'),
       (2, 150, '2019-10-08 08:00:00'),
       (2, 250, '2019-10-08 13:00:00'),
       (2, 450, '2019-10-08 19:00:00'),
       (3, 120, '2019-10-08 09:00:00'),
       (3, 270, '2019-10-08 12:30:00'),
       (3, 320, '2019-10-08 18:45:00'),
       (3, 570, '2019-10-08 23:45:00'),
       (4, 270, '2019-10-08 10:15:00'),
       (4, 470, '2019-10-08 15:50:00'),
       (4, 670, '2019-10-08 20:50:00'),
       (4, 970, '2019-10-08 23:59:00');


INSERT INTO tickets(num, session_id)
VALUES (23, 1),
       (43, 1),
       (24, 1),
       (55, 2),
       (32, 3),
       (11, 1),
       (14, 5),
       (45, 8),
       (59, 9),
       (17, 13),
       (99, 14),
       (187, 14),
       (87, 12),
       (98, 10),
       (88, 9),
       (66, 7),
       (77, 10);


SELECT *
FROM films;
SELECT *
FROM tickets;
SELECT *
FROM sessions;

SELECT films.title,
       sessions.start_time,
       films.duration,
       (LEAD(films.title) OVER (ORDER BY sessions.start_time)) as      next_film,
       (LEAD(sessions.start_time) OVER (ORDER BY sessions.start_time)) next_film_start,
       (LEAD(films.duration) OVER (ORDER BY sessions.start_time))      next_film_duration
FROM sessions,
     films
WHERE films.id = sessions.film_id
ORDER BY sessions.start_time;

SELECT f.title,
       s.start_time,
       f.duration,
       (LEAD(s.start_time) OVER (ORDER BY s.start_time)) as                   next_film_start,
       (LEAD(s.start_time) OVER (ORDER BY s.start_time) - s.start_time)::TIME duration_of_breaks
FROM films as f,
     sessions as s
WHERE s.film_id = f.id
ORDER BY duration_of_breaks DESC;


