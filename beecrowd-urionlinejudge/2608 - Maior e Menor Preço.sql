--PROBLEMA:
--2608 - Maior e Menor Pre�o
--RESPOSTA:
--Accepted
--IDIOMA:
--PostgreSQL (psql 9.4.19)
--TEMPO:
--0.005s
--TAMANHO:
--86 Bytes
--MEM�RIA:
---
--SUBMISS�O:
--06/09/2021 14:38:01
SELECT round(max(p.price),2) AS price, round(min(p.price),2) AS price FROM products p;