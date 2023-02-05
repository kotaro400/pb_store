DROP TABLE IF EXISTS teams;

CREATE TABLE teams(
    id INT AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS individuals;

CREATE TABLE individuals(
    id INT AUTO_INCREMENT,
    species_id INT NOT NULL,
    team_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (team_id) REFERENCES teams(id)
);