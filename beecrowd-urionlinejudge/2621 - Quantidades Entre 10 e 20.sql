--PROBLEMA:
--2621 - Quantidades Entre 10 e 20
--RESPOSTA:
--Accepted
--IDIOMA:
--PostgreSQL (psql 9.4.19)
--TEMPO:
--0.003s
--TAMANHO:
--174 Bytes
--MEMÓRIA:
---
--SUBMISSÃO:
--31/08/2021 21:40:29
SELECT
	prod."name" 
FROM
	products prod
INNER JOIN providers prov ON 
	prov.id = prod.id_providers 
WHERE
	prod.amount BETWEEN 10 AND 20 
	AND prov."name" LIKE 'P%';