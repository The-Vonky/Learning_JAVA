-- Ativa restrições de chave estrangeira
PRAGMA foreign_keys = ON;


-- TABELA PARTICIPANTE
CREATE TABLE IF NOT EXISTS Participante (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    telefone TEXT
);


-- TABELA EVENTO
CREATE TABLE IF NOT EXISTS Evento (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    descricao TEXT,
    local TEXT NOT NULL,
    data TEXT NOT NULL
);


-- TABELA INSCRICAO (ssociativa entre Evento e Participante)
CREATE TABLE IF NOT EXISTS Inscricao (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_evento INTEGER NOT NULL,
    id_participante INTEGER NOT NULL,
    data_inscricao TEXT,
    status TEXT CHECK(status IN ('confirmada','cancelada')),
    FOREIGN KEY (id_evento) REFERENCES Evento(id) ON DELETE CASCADE,
    FOREIGN KEY (id_participante) REFERENCES Participante(id) ON DELETE CASCADE
);


-- TABELA PAGAMENTO (1:1 com Inscricao)
CREATE TABLE IF NOT EXISTS Pagamento (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_inscricao INTEGER UNIQUE,
    valor REAL,
    data_pagamento TEXT,
    status TEXT CHECK(status IN ('pago','pendente')),
    FOREIGN KEY (id_inscricao) REFERENCES Inscricao(id) ON DELETE CASCADE
);


-- INSERÇÃO DE DADOS

-- Participantes (3 registros)
INSERT INTO Participante (nome, email, telefone) VALUES
('Ana Souza', 'ana@email.com', '34999990001'),
('Carlos Lima', 'carlos@email.com', '34999990002'),
('Deywid Braga', 'deywid@email.com', '34999990003');


-- Eventos (2 registros)
INSERT INTO Evento (nome, descricao, local, data) VALUES
('Seminário de Tecnologia', 'Palestras sobre inovação em TI', 'Auditório A', '2025-09-15'),
('Workshop de Banco de Dados', 'Treinamento prático em SQL e modelagem', 'Laboratório 2', '2025-09-20');


-- Inscrições (4 registros, combinando eventos e participantes)
INSERT INTO Inscricao (id_evento, id_participante, data_inscricao, status) VALUES
(1, 1, '2025-09-01', 'confirmada'),
(1, 2, '2025-09-02', 'confirmada'),
(2, 2, '2025-09-03', 'cancelada'),
(2, 3, '2025-09-04', 'confirmada');


-- Pagamentos (4 registros, 1 por inscrição)
INSERT INTO Pagamento (id_inscricao, valor, data_pagamento, status) VALUES
(1, 100.00, '2025-09-05', 'pago'),
(2, 100.00, '2025-09-05', 'pago'),
(3, 80.00, '2025-09-06', 'pendente'),
(4, 80.00, '2025-09-06', 'pago');