--PROBLEMA:
--2737 - Advogados
--RESPOSTA:
--Accepted
--IDIOMA:
--PostgreSQL (psql 9.4.19)
--TEMPO:
--0.002s
--TAMANHO:
--398 Bytes
--MEMÓRIA:
---
--SUBMISSÃO:
--01/09/2021 18:46:24
(SELECT
	adv.name,
	adv.customers_number
FROM
	lawyers adv
WHERE adv.customers_number = (SELECT max(adv2.customers_number) FROM lawyers adv2))
UNION ALL (SELECT
	adv.name,
	adv.customers_number
FROM
	lawyers adv
WHERE adv.customers_number = (SELECT min(adv2.customers_number) FROM lawyers adv2))
UNION ALL (SELECT
	'Average',
	round(avg(adv.customers_number), 0)
FROM
	lawyers adv);