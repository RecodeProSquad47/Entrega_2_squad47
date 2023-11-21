create database Vidas_Alem_das_Grades;

use Vidas_Alem_das_Grades;


CREATE TABLE Usuarios (
    idUsuario VARCHAR(10) PRIMARY KEY,
    Nome VARCHAR(100),
    Email VARCHAR(100),
    Senha VARCHAR(25),
    CPF VARCHAR(11)
);

CREATE TABLE Projetos (
    idProjeto VARCHAR(10) PRIMARY KEY,
    Descrição VARCHAR(150),
    Link  VARCHAR(150),
    Telefone VARCHAR(11),
    fk_Usuarios_idUsuario VARCHAR(10)
);

CREATE TABLE Cursos (
    idCursos VARCHAR(10) PRIMARY KEY,
    Descricao VARCHAR(150),
    Link VARCHAR(150),
    fk_Usuarios_idUsuario VARCHAR(10)
);
CREATE TABLE Vagas (
    idVagas VARCHAR(10) PRIMARY KEY,
    Descricao VARCHAR(150),
    Telefone VARCHAR(11),
    fk_Empresas_idEmpresa VARCHAR(10),
    fk_Usuarios_idUsuario VARCHAR(10)
);
CREATE TABLE Empresas (
    idEmpresa VARCHAR(10) PRIMARY KEY,
    Nome VARCHAR(100),
    CNPJ VARCHAR(14),
    Descricao VARCHAR(150),
    Telefone VARCHAR(11)
);

ALTER TABLE Projetos ADD CONSTRAINT FK_Projetos_2
    FOREIGN KEY (fk_Usuarios_idUsuario)
    REFERENCES Usuarios (idUsuario)
    ON DELETE CASCADE;
    
ALTER TABLE Cursos ADD CONSTRAINT FK_Cursos_2
    FOREIGN KEY (fk_Usuarios_idUsuario)
    REFERENCES Usuarios (idUsuario)
    ON DELETE CASCADE;
    
ALTER TABLE Vagas ADD CONSTRAINT FK_Vagas_2
    FOREIGN KEY (fk_Empresas_idEmpresa)
    REFERENCES Empresas (idEmpresa)
    ON DELETE CASCADE;
 
ALTER TABLE Vagas ADD CONSTRAINT FK_Vagas_3
    FOREIGN KEY (fk_Usuarios_idUsuario)
    REFERENCES Usuarios (idUsuario)
    ON DELETE CASCADE;
    
ALTER TABLE Vagas MODIFY COLUMN Telefone VARCHAR(15);

SELECT * FROM Usuarios;
SELECT * FROM Projetos;
SELECT * FROM Cursos;
SELECT * FROM Vagas;
SELECT * FROM Empresas;


INSERT INTO Usuarios (idUsuario, Nome, Email, Senha, CPF)
VALUES ('1', 'João Silva', 'joao.silva@email.com', '1234567890', '12345678901');

INSERT INTO Projetos (idProjeto, Descrição, Link, Telefone, fk_Usuarios_idUsuario)
VALUES ('1', 'Projeto de desenvolvimento de software', 'https://github.com/joaosilva/projeto-de-software', '999999999', '1');

INSERT INTO Cursos (idCursos, Descricao, Link, fk_Usuarios_idUsuario)
VALUES ('1', 'Curso de Java', 'https://www.cursoemvideo.com/curso/curso-de-java/', '1');

INSERT INTO Vagas (idVagas, Descricao, Telefone, fk_Empresas_idEmpresa, fk_Usuarios_idUsuario)
VALUES ('1', 'Desenvolvedor Java', '(11)9999-9999', '1', '1');

INSERT INTO Empresas (idEmpresa, Nome, CNPJ, Descrição, Telefone)
VALUES ('1', 'Empresa de software', '123456789012345', 'Empresa que desenvolve software', '999999999');




