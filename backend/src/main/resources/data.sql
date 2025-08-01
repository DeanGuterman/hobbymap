TRUNCATE TABLE league RESTART IDENTITY CASCADE;


-- Technion League
INSERT INTO league (name, city, format, latitude, longitude, person_of_contact, site_link)
VALUES (
  'Technion MTG League',
  'Haifa',
  'COMMANDER',
  32.7768,
  35.0231,
  'Amit Levi',
  'https://example.com/technion-league'
);

-- FreakTLV Weekly
INSERT INTO league (name, city, format, latitude, longitude, person_of_contact, site_link)
VALUES (
  'FreakTLV Weekly Events',
  'Tel Aviv',
  'MODERN',
  32.0707,
  34.7722,
  'Shani Rosen',
  'https://freak.org.il/'
);

-- Bat Galim Beach Games
INSERT INTO league (name, city, format, latitude, longitude, person_of_contact, site_link)
VALUES (
  'Bat Galim Beach League',
  'Haifa',
  'LIMITED',
  32.8246,
  34.9721,
  'Daniel Farber',
  'https://example.com/bat-galim-mtg'
);
