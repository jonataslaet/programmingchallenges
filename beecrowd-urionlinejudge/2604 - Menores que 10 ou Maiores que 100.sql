--PROBLEMA:
--2604 - Menores que 10 ou Maiores que 100
--RESPOSTA:
--Accepted
--IDIOMA:
--PostgreSQL (psql 9.4.19)
--TEMPO:
--0.003s
--TAMANHO:
--93 Bytes
--MEM�RIA:
---
--SUBMISS�O:
--06/09/2021 14:18:08
SELECT prod.id, prod.name FROM products prod WHERE prod.price < 10.00 OR prod.price > 100.00;