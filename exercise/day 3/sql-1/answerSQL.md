1. 
SELECT 
    d.name AS nama_departemen,
    SUM(e.salary) AS total_salary
FROM 
    departments d
JOIN 
    employees e ON d.id = e.department_id
GROUP BY 
    d.name
ORDER BY total_salary desc

2. 
SELECT
    e.name AS employee_name
FROM
    employees e
WHERE
    e.id NOT IN (SELECT DISTINCT employee_id FROM employee_projects)

3. 



4. 



5. 
SELECT 
    e.name AS employee_name,
    COUNT(DISTINCT ep.project_id) AS total_projects
FROM 
    employees e
JOIN 
    employee_projects ep ON e.id = ep.employee_id
GROUP BY 
    e.id, e.name
HAVING 
    COUNT(DISTINCT ep.project_id) >= 2
ORDER BY 
    total_projects DESC