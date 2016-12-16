INSERT INTO talk
(id, title, date) 
VALUES (1, 'Microservices Technologien: Kubernetes & Spring Boot', '2016-12-15'),
       (2, 'Architekturstil Microservices', '2016-12-15');
INSERT INTO talk_speakers
(talk_id, speakers)
VALUES (1, 'tpolley'),
       (1, 'oweiler'),
       (2, 'tbayer');