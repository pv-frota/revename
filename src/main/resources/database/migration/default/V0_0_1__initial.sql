CREATE SCHEMA IF NOT EXISTS revename;
use revename;
CREATE TABLE Cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (255),
--     imagem VARCHAR (255),
    descricao VARCHAR (255),
    diaPadraoFaturamento INT,
    cliente_final_id INT,
    FOREIGN KEY (cliente_final_id) REFERENCES Cliente (id)
);
CREATE TABLE Projeto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (255),
    descricao VARCHAR (255),
    prazoGeral DATE,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES Cliente (id)
);
CREATE TABLE Contato (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (255),
    cargo VARCHAR (255),
    email VARCHAR (255),
    telefone VARCHAR (20),
    cliente_id INT,
    projeto_id INT,
    FOREIGN KEY (cliente_id) REFERENCES Cliente (id),
    FOREIGN KEY (projeto_id) REFERENCES Projeto (id)
);
CREATE TABLE Api (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (255),
    descricao VARCHAR (255),
    link VARCHAR (255),
    meiosDeAcesso VARCHAR (255),
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES Cliente (id)
);
CREATE TABLE Sprint (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (255),
    prazo DATE,
    projeto_id INT,
    FOREIGN KEY (projeto_id) REFERENCES Projeto (id)
);
CREATE TABLE Desenvolvedor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (255)
    );
CREATE TABLE Issue (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (255),
    link VARCHAR (255),
    projeto_id INT,
    sprint_id INT,
    desenvolvedor_id INT,
    FOREIGN KEY (projeto_id) REFERENCES Projeto (id),
    FOREIGN KEY (sprint_id) REFERENCES Sprint (id),
    FOREIGN KEY (desenvolvedor_id) REFERENCES Desenvolvedor (id)
    );
CREATE TABLE Documento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (255),
    link VARCHAR (255),
    sprint_id INT,
    FOREIGN KEY (sprint_id) REFERENCES Sprint (id)
);
