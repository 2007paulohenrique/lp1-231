package LojaDeCarros.TablesDAO;

public class CriarInsertsBasicos {
    public void criar() {
        String sqlMarca = """
            insert into marca values 
            ('Chevrolet'),
            ('Volkswagen'),
            ('Fiat'),
            ('Ford'),
            ('Toyota'),
            ('Honda'),
            ('Hyundai'),
            ('Nissan'),
            ('Renault'),
            ('Jeep'),
            ('Mitsubishi'),
            ('Peugeot'),
            ('Citroën'),
            ('Kia'),
            ('BMW'),
            ('Mercedes-Benz'),
            ('Audi'),
            ('Land Rover'),
            ('Subaru'),
            ('Lexus'),
            ('Volvo'),
            ('Jaguar'),
            ('Porsche'),
            ('Mazda'),
            ('Chery'),
            ('Suzuki'),
            ('Ferrari'),
            ('Lamborghini'),
            ('Tesla');            
        """;

        String sqlCategoria_carro = """
            insert into categoria_carro values 
            ('SUV'),
            ('Hatchback'),
            ('Sedan'),
            ('Picape'),
            ('Cupê'),
            ('Conversível'),
            ('Minivan'),
            ('Crossover'),
            ('Esportivo'),
            ('Compacto'),
            ('Van'),
            ('Wagon'),
            ('Híbrido'),
            ('Elétrico');      
        """;

        String sqlForma_pagamento = """
            insert into forma_pagamento values 
            ('Dinheiro'),
            ('Cartão de Crédito'),
            ('Cartão de Débito'),
            ('Transferência Bancária'),
            ('Boleto Bancário'),
            ('Financiamento'),
            ('Leasing'),
            ('Cheque'),
            ('Consórcio'),
            ('Pix'),
            ('PayPal'),
            ('Apple Pay'),
            ('Google Pay');      
        """;

        String sqlCargo = """
            insert into cargo values
            ('Dono'),
            ('Gerente Geral'),            
            ('Gerente de Compras'),
            ('Gerente de Vendas'),
            ('Gerente de Serviços'),
            ('Segurança'),
            ('Estoquista'),
            ('Vendedor'),
            ('Mecânico'),
            ('Recepcionista'),
            ('Assistente Administrativo'),
            ('Analista de Marketing'),
            ('Lavador de Carros'),
            ('Detalhistas Automotivos'),
            ('Auxiliar de Limpeza');        
        """;

        String sqlTransmissao = """
            insert into transmissao values
            ('Manual'),
            ('Automática'),
            ('Automática de Dupla Embreagem'),
            ('Automatizada'),
            ('Transmissão Continuamente Variável'),
            ('Semi-Automática'),
            ('Automatizada de Dupla Embreagem'),
            ('CVT Multitronic'),
            ('Tiptronic'),
            ('Automática Sequencial');         
        """;

        String sqlCor = """
            insert into cor values
            ('Preto Sólido'),
            ('Branco Sólido'),
            ('Prata Metálico'),
            ('Azul Metálico'),
            ('Vermelho Sólido'),
            ('Verde Metálico'),
            ('Amarelo Sólido'),
            ('Cinza Metálico'),
            ('Dourado Metálico'),
            ('Laranja Sólido'),
            ('Marrom Sólido'),
            ('Roxo Metálico'),
            ('Bege Sólido'),
            ('Bordô Sólido'),
            ('Bronze Metálico'),
            ('Champagne Metálico'),
            ('Cobre Metálico'),
            ('Turquesa Metálico'),
            ('Púrpura Metálico'),
            ('Rosa Sólido'),
            ('Branco Perolizado'),
            ('Preto Perolizado'),
            ('Azul Perolizado');         
        """;

        String sqlModelo = """
            insert into modelo values
            ('Onix', 1), ('Cruze', 1), ('Equinox', 1),
            ('Gol', 2), ('Virtus', 2), ('Tiguan', 2),
            ('Mobi', 3), ('Argo', 3), ('Toro', 3),
            ('Ka', 4), ('Focus', 4), ('EcoSport', 4),
            ('Corolla', 5), ('Camry', 5), ('Hilux', 5),
            ('Civic', 6), ('Accord', 6), ('HR-V', 6),
            ('HB20', 7), ('Creta', 7), ('Azera', 7),
            ('March', 8), ('Versa', 8), ('Kicks', 8),
            ('Clio', 9), ('Captur', 9), ('Duster', 9),
            ('Renegade', 10), ('Compass', 10), ('Cherokee', 10),
            ('L200 Triton', 11), ('Outlander', 11), ('Pajero Sport', 11),
            ('208', 12), ('308', 12), ('3008', 12),
            ('C3', 13), ('Aircross', 13), ('C4 Lounge', 13),
            ('Sportage', 14), ('Seltos', 14), ('Cerato', 14),
            ('Série 3', 15), ('X5', 15), ('X3', 15),
            ('Classe A', 16), ('Classe C', 16), ('GLC', 16),
            ('A3', 17), ('A4', 17), ('Q5', 17),
            ('Discovery Sport', 18), ('Range Rover Evoque', 18), ('Defender', 18),
            ('Impreza', 19), ('Outback', 19), ('Forester', 19),
            ('IS', 20), ('RX', 20), ('NX', 20),
            ('S60', 21), ('XC40', 21), ('XC90', 21),
            ('XE', 22), ('F-PACE', 22), ('I-PACE', 22),
            ('911', 23), ('Cayenne', 23), ('Panamera', 23),
            ('MX-5', 24), ('CX-5', 24), ('Mazda3', 24),
            ('Tiggo 2', 25), ('Tiggo 5X', 25), ('Arrizo 6', 25),
            ('Vitara', 26), ('S-Cross', 26), ('Swift', 26),
            ('Portofino', 27), ('488 GTB', 27), ('F8 Tributo', 27),
            ('Huracán', 28), ('Aventador', 28), ('Urus', 28),
            ('Model S', 29), ('Model 3', 29), ('Model X', 29),        
        """;
    }
}
