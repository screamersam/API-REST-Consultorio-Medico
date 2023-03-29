create table medicos(
    id bigint not null auto_increment,
    nome varchar(64) not null,
    email varchar(64) not null unique,
    crm varchar(6) not null unique,
    especialidade varchar(64) not null,    
    logradouro varchar(255) not null,
    bairro varchar(255) not null,
    cep varchar(9) not null,
    complemento varchar(64) not null,
    numero varchar(16) not null,
    uf char(2) not null,
    cidade varchar(64) not null,

    primary key(id)
)
