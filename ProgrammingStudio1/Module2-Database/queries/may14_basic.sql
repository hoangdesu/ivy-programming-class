SELECT * FROM City;


SELECT * FROM Country;


--Select SELECT select: case-insenstive
--good convention: SQL Keywords should be all CAPITALIZED
--comment: cmd + /


--Select (fields) FROM (table)


SELECT ID, Name, District 
FROM City;


SELECT Name, Continent
FROM Country
WHERE Continent = 'Asia'
;


SELECT Name, Continent, Population
FROM Country
WHERE Continent = 'Asia'
ORDER BY Population DESC 
--ASC
;




