INSERT INTO satellite ( id, international_designation, name) values (7539, '1974-089B', 'OSCAR 7');
INSERT INTO satellite ( id, international_designation, name) values (25544, '1998-069F', 'ISS (UNITY)');
INSERT INTO satellite ( id, international_designation, name) values (47964, '2021-022AJ', 'SMOG-1');
INSERT INTO keplerian_elements ( satellite_id, epoch, epoch_year, epoch_day, inclination, right_ascension_ascending_node, eccentricity, argument_of_perigee, mean_anomaly, mean_motion, orbit_number)
    values (25544,TIMESTAMP '2005-05-13 07:15:31.123456789' , 23,033.18918240, 51.6430, 277.1923, 0.0004788, 304.2965, 200.2412, 15.5034882, 838085);
INSERT INTO keplerian_elements ( satellite_id, epoch, epoch_year, epoch_day, inclination, right_ascension_ascending_node, eccentricity, argument_of_perigee, mean_anomaly, mean_motion, orbit_number)
    values (25544, TIMESTAMP '2014-05-13 07:15:31.123456789' ,23,033.18918240, 51.6430, 277.1923, 0.0004788, 304.2965, 200.2412, 15.5034882, 838085);
