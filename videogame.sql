-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 30-Jan-2023 às 18:58
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `videogame`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `games`
--

CREATE TABLE `games` (
  `id_videogame` int(11) NOT NULL,
  `dataCadastro` varchar(30) DEFAULT current_timestamp(),
  `tipo_jogo` varchar(50) DEFAULT NULL,
  `titulo_jogo` varchar(50) DEFAULT NULL,
  `plataforma` varchar(50) DEFAULT NULL,
  `midia` varchar(50) DEFAULT NULL,
  `sinopse` varchar(250) DEFAULT NULL,
  `statuss` enum('On','Off','Del') DEFAULT 'On'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `games`
--

INSERT INTO `games` (`id_videogame`, `dataCadastro`, `tipo_jogo`, `titulo_jogo`, `plataforma`, `midia`, `sinopse`, `statuss`) VALUES
(3, '28-01-2023', 'Eletrônico', 'Just Dance', 'XBOX', 'Digital', 'Just Dance é uma franquia para \nse divertir e movimentar dançando.\ngrandes hits da música pop.', 'On'),
(5, '29-01-2023', 'Eletrônico', 'Mario Kart', 'Nintendo 64', 'Digital', 'Mario tem que superar florzinhas,\npegar cogumelos,entrar em tubos,\ncanos,rodopiar pular pra \nsalvar a princesa. ', 'On'),
(6, '30-01-2023', 'Mobile ', 'Pokemon Go', 'Celular', 'Digital', 'Capture o máximo de Pokémon \nque conseguir\n', 'On');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `games`
--
ALTER TABLE `games`
  ADD PRIMARY KEY (`id_videogame`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `games`
--
ALTER TABLE `games`
  MODIFY `id_videogame` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
