INSERT INTO data.person (name, sur_name, age, phone_number, city_of_living)
VALUES ('Oleg', 'v', 30, '123', 'Moscow')
ON CONFLICT DO NOTHING;

INSERT INTO data.person (name, sur_name, age, phone_number, city_of_living)
VALUES ('Viktor', 'x', 31, '12345', 'Moscow')
ON CONFLICT DO NOTHING;

INSERT INTO data.person (name, sur_name, age, phone_number, city_of_living)
VALUES ('Maria', 't', 20, '321', 'SPb')
ON CONFLICT DO NOTHING;

INSERT INTO data.person (name, sur_name, age, phone_number, city_of_living)
VALUES ('Olya', 'y', 21, '3211', 'Tula')
ON CONFLICT DO NOTHING;
