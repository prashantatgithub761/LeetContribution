# Write your MySQL query statement below
SELECT email
from Person 
Group by email
HAVING COUNT(email)>1;

