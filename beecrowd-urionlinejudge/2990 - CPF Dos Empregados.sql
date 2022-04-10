--PROBLEMA:
--2990 - CPF Dos Empregados
--RESPOSTA:
--Accepted
--IDIOMA:
--PostgreSQL (psql 9.4.19)
--TEMPO:
--0.002s
--TAMANHO:
--229 Bytes
--MEMÓRIA:
---
--SUBMISSÃO:
--01/09/2021 19:49:39
SELECT
	emp.cpf,
	emp.enome,
	dep.dnome
FROM
	empregados emp
INNER JOIN departamentos dep ON
	dep.dnumero = emp.dnumero
LEFT JOIN trabalha trab ON 
	trab.cpf_emp = emp.cpf
WHERE trab.cpf_emp IS NULL 
ORDER BY
	emp.cpf