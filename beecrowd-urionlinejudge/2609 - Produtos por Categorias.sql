--PROBLEMA:
--2609 - Produtos por Categorias
--RESPOSTA:
--Accepted
--IDIOMA:
--PostgreSQL (psql 9.4.19)
--TEMPO:
--0.002s
--TAMANHO:
--161 Bytes
--MEMÓRIA:
---
--SUBMISSÃO:
--01/09/2021 08:09:27
SELECT
	categories.name,
	sum(products.amount)
FROM
	categories
INNER JOIN products ON
	products.id_categories = categories.id
GROUP BY
	categories.name;