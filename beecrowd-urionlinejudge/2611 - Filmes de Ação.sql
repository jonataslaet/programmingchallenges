--PROBLEMA:
--2611 - Filmes de Ação
--RESPOSTA:
--Accepted
--IDIOMA:
--PostgreSQL (psql 9.4.19)
--TEMPO:
--0.003s
--TAMANHO:
--112 Bytes
--MEMÓRIA:
---
--SUBMISSÃO:
--31/08/2021 17:12:06
SELECT m.id, m.name 
FROM movies m 
INNER JOIN genres g ON m.id_genres = g.id 
WHERE g.description = 'Action'