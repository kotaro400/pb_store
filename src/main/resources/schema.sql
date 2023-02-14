DROP TABLE IF EXISTS individuals;
DROP TABLE IF EXISTS teams;

CREATE TABLE teams(
    id INT AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE individuals(
    id INT AUTO_INCREMENT,
    species_id INT NOT NULL,
    team_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (team_id) REFERENCES teams(id)
);

CREATE TABLE IF NOT EXISTS species(
    id INT,
    name VARCHAR(50),
    PRIMARY KEY (id)
);