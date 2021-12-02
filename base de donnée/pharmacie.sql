-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 01 déc. 2021 à 22:22
-- Version du serveur : 10.4.21-MariaDB
-- Version de PHP : 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `pharmacie`
--

-- --------------------------------------------------------

--
-- Structure de la table `achat`
--

CREATE TABLE `achat` (
  `CODE_BARRES` varchar(20) NOT NULL,
  `NOM` varchar(50) NOT NULL,
  `TYPE` varchar(20) NOT NULL,
  `NOM_FOURNISSEUR` varchar(20) NOT NULL,
  `QUANTITE` int(11) NOT NULL,
  `PRIX` double NOT NULL,
  `MONTANT` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `achat`
--

INSERT INTO `achat` (`CODE_BARRES`, `NOM`, `TYPE`, `NOM_FOURNISSEUR`, `QUANTITE`, `PRIX`, `MONTANT`) VALUES
('fsdgjfihjorodsf', 'Novalo', 'gelule', 'momo', 40, 2, 80);

-- --------------------------------------------------------

--
-- Structure de la table `expiration`
--

CREATE TABLE `expiration` (
  `NOM_PRODUIT` varchar(50) NOT NULL,
  `CODE_PRODUIT` varchar(20) NOT NULL,
  `DATE_EXPIRATION` varchar(10) NOT NULL,
  `QUANTITE_RESTER` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE `fournisseur` (
  `NOM` varchar(50) NOT NULL,
  `ADRESSE` varchar(50) NOT NULL,
  `TELEPHONE` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fournisseur`
--

INSERT INTO `fournisseur` (`NOM`, `ADRESSE`, `TELEPHONE`) VALUES
('midovic', 'Lyon', '0600666060'),
('momo', 'blois', '010114367832'),
('pharmacop', 'paris', '06216jkl5'),
('zaki', 'tour', '01289078443');

-- --------------------------------------------------------

--
-- Structure de la table `historique_message`
--

CREATE TABLE `historique_message` (
  `MESSAGE_DE` varchar(20) NOT NULL,
  `MESSAGE_A` varchar(20) NOT NULL,
  `MESSAGE_TEXT` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `inbox`
--

CREATE TABLE `inbox` (
  `MESSAGE_DE` varchar(20) NOT NULL,
  `MESSAGE_A` varchar(20) NOT NULL,
  `MESSAGE_TEXT` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `inbox`
--

INSERT INTO `inbox` (`MESSAGE_DE`, `MESSAGE_A`, `MESSAGE_TEXT`) VALUES
('mohammed', 'zakaria', 'Salut zakaria ');

-- --------------------------------------------------------

--
-- Structure de la table `login`
--

CREATE TABLE `login` (
  `NOM` varchar(50) NOT NULL,
  `TYPE` varchar(20) NOT NULL,
  `DATE` varchar(20) NOT NULL,
  `TEMPS` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `login`
--

INSERT INTO `login` (`NOM`, `TYPE`, `DATE`, `TEMPS`) VALUES
('admin', 'Admin', '21-11-2021', '08:18:40'),
('mohammed', 'Employee', '21-11-2021', '08:25:01'),
('mohammed', 'Employee', '21-11-2021', '09:31:31'),
('zakaria', 'Employee', '21-11-2021', '09:33:19'),
('admin', 'Admin', '22-11-2021', '10:23:31'),
('admin', 'Admin', '22-11-2021', '10:46:33'),
('admin', 'Admin', '22-11-2021', '10:57:12'),
('admin', 'Admin', '22-11-2021', '11:02:05'),
('admin', 'Admin', '22-11-2021', '11:07:41'),
('admin', 'Admin', '22-11-2021', '11:29:31'),
('admin', 'Admin', '22-11-2021', '11:37:49'),
('mohammed', 'Employee', '22-11-2021', '11:55:43'),
('mohammed', 'Employee', '22-11-2021', '11:57:36'),
('admin', 'Admin', '27-11-2021', '04:23:57'),
('admin', 'Admin', '27-11-2021', '05:04:34'),
('admin', 'Admin', '27-11-2021', '05:24:36'),
('admin', 'Admin', '27-11-2021', '08:50:48'),
('admin', 'Admin', '27-11-2021', '08:52:23'),
('admin', 'Admin', '27-11-2021', '09:06:21'),
('admin', 'Admin', '28-11-2021', '02:36:20'),
('admin', 'Admin', '28-11-2021', '02:37:56'),
('admin', 'Admin', '28-11-2021', '02:41:58'),
('admin', 'Admin', '28-11-2021', '02:43:12'),
('admin', 'Admin', '28-11-2021', '02:44:01'),
('admin', 'Admin', '28-11-2021', '02:44:56'),
('admin', 'Admin', '28-11-2021', '02:46:30'),
('admin', 'Admin', '28-11-2021', '02:47:49'),
('admin', 'Admin', '28-11-2021', '02:52:18'),
('admin', 'Admin', '28-11-2021', '02:56:21'),
('admin', 'Admin', '28-11-2021', '03:03:11'),
('admin', 'Admin', '28-11-2021', '03:04:28'),
('admin', 'Admin', '28-11-2021', '03:05:41'),
('admin', 'Admin', '28-11-2021', '03:10:18'),
('admin', 'Admin', '28-11-2021', '03:10:50'),
('admin', 'Admin', '28-11-2021', '03:11:56'),
('admin', 'Admin', '28-11-2021', '03:26:52'),
('admin', 'Admin', '28-11-2021', '05:35:34'),
('admin', 'Admin', '28-11-2021', '10:01:04'),
('admin', 'Admin', '28-11-2021', '11:50:16'),
('admin', 'Admin', '30-11-2021', '10:21:13'),
('admin', 'Admin', '30-11-2021', '10:24:56'),
('admin', 'Admin', '01-12-2021', '03:25:41');

-- --------------------------------------------------------

--
-- Structure de la table `medicament`
--

CREATE TABLE `medicament` (
  `NOM` varchar(50) NOT NULL,
  `TYPE` varchar(20) NOT NULL,
  `CODE_BARRES` varchar(20) NOT NULL,
  `DOSE` varchar(10) NOT NULL,
  `CODE` varchar(10) NOT NULL,
  `PRIX_COUTANT` double NOT NULL,
  `PRIX_VENTE` double NOT NULL,
  `EXPIRATION` varchar(20) NOT NULL,
  `NOM_FOURNISSEUR` varchar(50) NOT NULL,
  `DATE_PRODUCTION` date NOT NULL,
  `DATE_EXPIRATION` date NOT NULL,
  `PLACE` varchar(20) NOT NULL,
  `QUANTITE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `medicament`
--

INSERT INTO `medicament` (`NOM`, `TYPE`, `CODE_BARRES`, `DOSE`, `CODE`, `PRIX_COUTANT`, `PRIX_VENTE`, `EXPIRATION`, `NOM_FOURNISSEUR`, `DATE_PRODUCTION`, `DATE_EXPIRATION`, `PLACE`, `QUANTITE`) VALUES
('amoxilin', 'gelule', 'cxkfdjfg', '100', 'Nav', 120, 200, 'Disponible pour util', 'momo', '2022-03-05', '2022-04-04', 'C-En Droite', 20),
('AMOXILLIN', 'comprimé', 'fdsfkjdsfjkds', 'normal', 'nav', 100, 120, 'Disponible pour util', 'pharmacop', '2021-12-20', '2023-06-03', 'C-En bas', 3),
('Novalo', 'gelule', 'fsdgjfihjorodssasasf', 'normal', '3d00', 2, 3, 'Périmé', 'zaki', '2021-03-01', '2022-03-04', 'A-En Haut', 35),
('doli', 'gelule', 'ftrkl432432md', 'normal', '2xaa', 33, 40, 'Périmé', 'momo', '2016-01-01', '2017-01-01', 'N-En Gauche', 27),
('doliprane', 'comprimé', 'hfsfdfdjh', '100', 'navv', 160, 170, 'Périmé', 'zaki', '2021-02-02', '2023-06-07', 'B-En Haut', 5);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `ID` int(11) NOT NULL,
  `NOM` varchar(50) NOT NULL,
  `DDN` varchar(20) NOT NULL,
  `ADRESSE` varchar(100) NOT NULL,
  `TELEPHONE` varchar(20) NOT NULL,
  `SALAIRE` double NOT NULL,
  `MOT_DE_PASSE` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`ID`, `NOM`, `DDN`, `ADRESSE`, `TELEPHONE`, `SALAIRE`, `MOT_DE_PASSE`) VALUES
(1, 'admin', '23-12-2000', 'blois', '9800000000', 50000, 'admin'),
(2, 'mohammed', '3-2-2001', '14 rue du bourg saint jean', '01290789432', 2000, 'mohammed'),
(3, 'zakaria', '3-2-1999', 'saada 3', '01147893423', 4000, 'zakaria'),
(4, 'momo', '7-8-1997', 'morroco', '011804368743', 3000, 'momo'),
(5, 'Mehdi', '6-11-2000', 'Blois Rue Maréchal', '060660060', 2000, 'mehdi123');

-- --------------------------------------------------------

--
-- Structure de la table `ventes`
--

CREATE TABLE `ventes` (
  `CODE_BARRES` varchar(20) NOT NULL,
  `NOM` varchar(50) NOT NULL,
  `TYPE` varchar(10) NOT NULL,
  `DOSE` varchar(10) NOT NULL,
  `QUANTITE` int(11) NOT NULL,
  `PRIX` double NOT NULL,
  `MONTANT` double NOT NULL,
  `DATE` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ventes`
--

INSERT INTO `ventes` (`CODE_BARRES`, `NOM`, `TYPE`, `DOSE`, `QUANTITE`, `PRIX`, `MONTANT`, `DATE`) VALUES
('fdsfkjdsfjkds', 'AMOXILLIN', 'comprimé', 'normal', 2, 120, 240, '27-11-2021');

-- --------------------------------------------------------

--
-- Structure de la table `ventes_historiques`
--

CREATE TABLE `ventes_historiques` (
  `NOM_UTILISATEUR` varchar(20) NOT NULL,
  `CODE_BARRES` varchar(20) NOT NULL,
  `NOM` varchar(50) NOT NULL,
  `TYPE` varchar(10) NOT NULL,
  `DOSE` varchar(10) NOT NULL,
  `QUANTITE` int(11) NOT NULL,
  `PRIX` double NOT NULL,
  `MONTANT` double NOT NULL,
  `DATE` varchar(15) NOT NULL,
  `TEMPS` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ventes_historiques`
--

INSERT INTO `ventes_historiques` (`NOM_UTILISATEUR`, `CODE_BARRES`, `NOM`, `TYPE`, `DOSE`, `QUANTITE`, `PRIX`, `MONTANT`, `DATE`, `TEMPS`) VALUES
('admin', 'fdsfkjdsfjkds', 'AMOXILLIN', 'comprimé', 'normal', 2, 120, 240, '27-11-2021', '05:15:20 PM');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `achat`
--
ALTER TABLE `achat`
  ADD PRIMARY KEY (`CODE_BARRES`),
  ADD KEY `fkr3` (`NOM_FOURNISSEUR`);

--
-- Index pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  ADD PRIMARY KEY (`NOM`);

--
-- Index pour la table `medicament`
--
ALTER TABLE `medicament`
  ADD PRIMARY KEY (`CODE_BARRES`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`ID`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `achat`
--
ALTER TABLE `achat`
  ADD CONSTRAINT `fkr3` FOREIGN KEY (`NOM_FOURNISSEUR`) REFERENCES `fournisseur` (`NOM`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
