-- ========================================
-- Quimica BD
-- 25/02/2015
-- ========================================

-- ----------------------------------------
-- Creación de la BD
-- ----------------------------------------
SELECT PASSWORD('chemical');
CREATE USER 'quimico' IDENTIFIED BY PASSWORD '*CD8796DD809BC0F452CA13C7A8DD16011E1B45A0';
CREATE DATABASE `quimicabd` CHARACTER SET utf8 COLLATE utf8_general_ci;
GRANT ALL ON `quimicabd`.* TO `quimico`@localhost IDENTIFIED BY 'chemical';
FLUSH PRIVILEGES;

-- Se selecciona la BD
use quimicabd;

-- ----------------------------------------
-- Definicion de Tablas
-- ----------------------------------------

DROP TABLE IF EXISTS Valencias;
DROP TABLE IF EXISTS Elementos;

CREATE TABLE IF NOT EXISTS Elementos (
	simbolo CHAR(3) NOT NULL,
	numero INT(3) NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	peso DOUBLE(10,7) NOT NULL,
	caracter VARCHAR(40) NOT NULL,
	PRIMARY KEY (simbolo)
);

CREATE TABLE IF NOT EXISTS Valencias (
	id_valencia SERIAL,
	elemento CHAR(3) NOT NULL,
	valor INT(2),
	PRIMARY KEY (id_valencia),
	FOREIGN KEY (elemento) REFERENCES Elementos(simbolo)
);

-- ----------------------------------------
-- Insercion de Datos
-- ----------------------------------------

INSERT INTO Elementos VALUES('H', 1, 'Hidrógeno', 1.0079, 'no-metal-gaseoso');
INSERT INTO Elementos VALUES('He', 2, 'Helio', 4.0026, 'gas-noble');
INSERT INTO Elementos VALUES('Li', 3, 'Litio', 6.939, 'metal-sólido');
INSERT INTO Elementos VALUES('Be', 4, 'Berilio', 9.0122, 'metal-sólido');
INSERT INTO Elementos VALUES('B', 5, 'Boro', 10.811, 'semimetal-solido');
INSERT INTO Elementos VALUES('C', 6, 'Carbono', 12.011, 'no-metal-sólido');
INSERT INTO Elementos VALUES('N', 7, 'Nitrógeno', 14.006, 'no-metal-gaseoso');
INSERT INTO Elementos VALUES('O', 8, 'Oxigeno', 15.999, 'no-metal-gaseoso');
INSERT INTO Elementos VALUES('F', 9, 'Flúor', 18.998, 'no-metal-gaseoso');
INSERT INTO Elementos VALUES('Ne', 10, 'Neón', 20.183, 'gas-noble');
INSERT INTO Elementos VALUES('Na', 11, 'Sodio', 22.989, 'metal-sólido');
INSERT INTO Elementos VALUES('Mg', 12, 'Magnesio', 24.321, 'metal-sólido');
INSERT INTO Elementos VALUES('Al', 13, 'Aluminio', 26.981, 'metal-sólido');
INSERT INTO Elementos VALUES('Si', 14, 'Silicio', 28.086, 'semimetal-sólido');
INSERT INTO Elementos VALUES('P', 15, 'Fósforo', 30.973, 'no-metal-sólido');
INSERT INTO Elementos VALUES('S', 16, 'Azufre', 32.064, 'no-metal-sólido');
INSERT INTO Elementos VALUES('Cl', 17, 'Cloro', 35.453, 'no-metal-gaseoso');
INSERT INTO Elementos VALUES('Ar', 18, 'Argón', 39.948, 'gas-noble');
INSERT INTO Elementos VALUES('K', 19, 'Potasio', 39.102, 'metal-sólido');
INSERT INTO Elementos VALUES('Ca', 20, 'Calcio', 40.08, 'metal-sólido');
INSERT INTO Elementos VALUES('Sc', 21, 'Escandio', 44.956, 'metal-sólido');
INSERT INTO Elementos VALUES('Ti', 22, 'Titanio', 47.9, 'metal-sólido');
INSERT INTO Elementos VALUES('V', 23, 'Vanadio', 50.942, 'metal-sólido');
INSERT INTO Elementos VALUES('Cr', 24, 'Cromo', 51.996, 'metal-sólido');
INSERT INTO Elementos VALUES('Mn', 25, 'Manganeso', 54.938, 'metal-sólido');
INSERT INTO Elementos VALUES('Fe', 26, 'Hierro', 55.847, 'metal-sólido');
INSERT INTO Elementos VALUES('Co', 27, 'Cobalto', 58.933, 'metal-sólido');
INSERT INTO Elementos VALUES('Ni', 28, 'Niquel', 58.71, 'metal-sólido');
INSERT INTO Elementos VALUES('Cu', 29, 'Cobre', 63.54, 'metal-sólido');
INSERT INTO Elementos VALUES('Zn', 30, 'Zinc', 65.37, 'metal-sólido');
INSERT INTO Elementos VALUES('Ga', 31, 'Galio', 69.72, 'metal-liquido');
INSERT INTO Elementos VALUES('Ge', 32, 'Germanio', 72.64, 'semimetal-solido');
INSERT INTO Elementos VALUES('As', 33, 'Arsénico', 74.922, 'semimetal-solido');
INSERT INTO Elementos VALUES('Se', 34, 'Selenio', 78.96, 'no-metal-solido');
INSERT INTO Elementos VALUES('Br', 35, 'Bromo', 79.909, 'no-metal-liquido');
INSERT INTO Elementos VALUES('Kr', 36, 'Criptón', 83.8, 'gas-noble');
INSERT INTO Elementos VALUES('Rb', 37, 'Rubidio', 85.47, 'metal-sólido');
INSERT INTO Elementos VALUES('Sr', 38, 'Estroncio', 87.62, 'metal-sólido');
INSERT INTO Elementos VALUES('Y', 39, 'Itrio', 88.905, 'metal-sólido');
INSERT INTO Elementos VALUES('Zr', 40, 'Zirconio', 91.22, 'metal-sólido');
INSERT INTO Elementos VALUES('Nb', 41, 'Niobio', 92.906, 'metal-sólido');
INSERT INTO Elementos VALUES('Mo', 42, 'Molibdeno', 95.94, 'metal-sólido');
INSERT INTO Elementos VALUES('Tc', 43, 'Tecnecio', 99, 'metal-sólido-radioactivo-sintético');
INSERT INTO Elementos VALUES('Ru', 44, 'Rutenio', 101.07, 'metal-sólido');
INSERT INTO Elementos VALUES('Rh', 45, 'Rodio', 102.9, 'metal-sólido');
INSERT INTO Elementos VALUES('Pd', 46, 'Paladio', 106.4, 'metal-sólido');
INSERT INTO Elementos VALUES('Ag', 47, 'Plata', 107.87, 'metal-sólido');
INSERT INTO Elementos VALUES('Cd', 48, 'Cadmio', 112.4, 'metal-sólido');
INSERT INTO Elementos VALUES('In', 49, 'Indio', 114.82, 'metal-sólido');
INSERT INTO Elementos VALUES('Sn', 50, 'Estaño', 118.69, 'metal-sólido');
INSERT INTO Elementos VALUES('Sb', 51, 'Antimonio', 121.75, 'semimetal-sólido');
INSERT INTO Elementos VALUES('Te', 52, 'Telurio', 127.6, 'semimetal-sólido');
INSERT INTO Elementos VALUES('I', 53, 'Yodo', 126.9, 'no-metal-sólido');
INSERT INTO Elementos VALUES('Xe', 54, 'Xenón', 131.3, 'gas-noble');
INSERT INTO Elementos VALUES('Cs', 55, 'Cesio', 132.9, 'metal-líquido');
INSERT INTO Elementos VALUES('Ba', 56, 'Bario', 137.34, 'metal-sólido');
INSERT INTO Elementos VALUES('La', 57, 'Lantano', 138.91, 'metal-sólido');
INSERT INTO Elementos VALUES('Ce', 58, 'Cerio', 140.12, 'metal-sólido');
INSERT INTO Elementos VALUES('Pr', 59, 'Praseodimio', 140.9, 'metal-sólido');
INSERT INTO Elementos VALUES('Nd', 60, 'Neodimio', 144.24, 'metal-sólido');
INSERT INTO Elementos VALUES('Pm', 61, 'Prometio', 147, 'metal-sólido-radioactivo-sintético');
INSERT INTO Elementos VALUES('Sm', 62, 'Samario', 150.35, 'metal-sólido');
INSERT INTO Elementos VALUES('Eu', 63, 'Europio', 151.96, 'metal-sólido');
INSERT INTO Elementos VALUES('Gd', 64, 'Gadolinio', 157.25, 'metal-sólido');
INSERT INTO Elementos VALUES('Tb', 65, 'Terbio', 158.92, 'metal-sólido');
INSERT INTO Elementos VALUES('Dy', 66, 'Disprosio', 162.5, 'metal-sólido');
INSERT INTO Elementos VALUES('Ho', 67, 'Holmio', 164.93, 'metal-sólido');
INSERT INTO Elementos VALUES('Er', 68, 'Erbio', 167.26, 'metal-sólido');
INSERT INTO Elementos VALUES('Tm', 69, 'Tulio', 168.93, 'metal-sólido');
INSERT INTO Elementos VALUES('Yb', 70, 'Yterbio', 173.04, 'metal-sólido');
INSERT INTO Elementos VALUES('Lu', 71, 'Lutecio', 174.97, 'metal-sólido');
INSERT INTO Elementos VALUES('Hf', 72, 'Hafnio', 178.49, 'metal-sólido');
INSERT INTO Elementos VALUES('Ta', 73, 'Tantalio', 180.94, 'metal-sólido-radioactivo');
INSERT INTO Elementos VALUES('W', 74, 'Tungsteno', 183.85, 'metal-sólido');
INSERT INTO Elementos VALUES('Re', 75, 'Renio', 186.2, 'metal-sólido');
INSERT INTO Elementos VALUES('Os', 76, 'Osmio', 190.2, 'metal-sólido');
INSERT INTO Elementos VALUES('Ir', 77, 'Iridio', 192.2, 'metal-sólido');
INSERT INTO Elementos VALUES('Pt', 78, 'Platino', 195.09, 'metal-sólido');
INSERT INTO Elementos VALUES('Au', 79, 'Oro', 196.96, 'metal-sólido');
INSERT INTO Elementos VALUES('Hg', 80, 'Mercurio', 200.59, 'metal-líquido');
INSERT INTO Elementos VALUES('Tl', 81, 'Talio', 204.37, 'metal-sólido');
INSERT INTO Elementos VALUES('Pb', 82, 'Plomo', 207.19, 'metal-sólido');
INSERT INTO Elementos VALUES('Bi', 83, 'Bismuto', 208.98, 'metal-sólido');
INSERT INTO Elementos VALUES('Po', 84, 'Polonio', 209, 'metal-sólido-radioactivo');
INSERT INTO Elementos VALUES('At', 85, 'Astato', 210, 'semimetal-sólido-radioactivo');
INSERT INTO Elementos VALUES('Rn', 86, 'Radón', 222, 'gas-noble-radioactivo');
INSERT INTO Elementos VALUES('Fr', 87, 'Francio', 223, 'metal-líquido-radioactivo');
INSERT INTO Elementos VALUES('Ra', 88, 'Radio', 226, 'metal-sólido-radioactivo');
INSERT INTO Elementos VALUES('Ac', 89, 'Actinio', 227, 'metal-sólido-radioactivo');
INSERT INTO Elementos VALUES('Th', 90, 'Torio', 232.02, 'metal-sólido-radioactivo');
INSERT INTO Elementos VALUES('Pa', 91, 'Protactinio', 231, 'metal-sólido-radioactivo');
INSERT INTO Elementos VALUES('U', 92, 'Uranio', 238.03, 'metal-sólido-radioactivo');
INSERT INTO Elementos VALUES('Np', 93, 'Neptunio', 237, 'metal-sólido-radioactivo-sintético');
INSERT INTO Elementos VALUES('Pu', 94, 'Plutonio', 242, 'metal-sólido-radioactivo-sintético');
INSERT INTO Elementos VALUES('Am', 95, 'Americio', 243, 'metal-sólido-radioactivo-sintético');
INSERT INTO Elementos VALUES('Cm', 96, 'Curio', 247, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Bk', 97, 'Berquelio', 247, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Cf', 98, 'Californio', 251, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Es', 99, 'Einstenio', 254, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Fm', 100, 'Fermio', 253, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Md', 101, 'Mendelevio', 256, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('No', 102, 'Nobelio', 254, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Lw', 103, 'Laurencio', 262, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Rf', 104, 'Rutherfordio', 261, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Db', 105, 'Dubnio', 262, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Sg', 106, 'Seaborgio', 266, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Bh', 107, 'Bohrio', 264, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Hs', 108, 'Hassio', 277, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Mt', 109, 'Meitnerio', 268, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Ds', 110, 'Darmstadtio', 269, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Rg', 111, 'Roentgenio', 269, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Cn', 112, 'Copernicio', 285, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Tf', 113, 'Tustrano', 272, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Eo', 114, 'Erristeneo', 276, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Me', 115, 'Merchel', 279, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('Nc', 116, 'Nectarten', 282, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('El', 117, 'Efelio', 286, 'metal-radioactivo-sintético');
INSERT INTO Elementos VALUES('On', 118, 'Oberón', 288, 'metal-radioactivo-sintético');
INSERT INTO Valencias VALUES(1, 'H', 1);
INSERT INTO Valencias VALUES(2, 'H', -1);
INSERT INTO Valencias VALUES(3, 'He', null);
INSERT INTO Valencias VALUES(4, 'Li', 1);
INSERT INTO Valencias VALUES(5, 'Be', 2);
INSERT INTO Valencias VALUES(6, 'B', 3);
INSERT INTO Valencias VALUES(7, 'C', 2);
INSERT INTO Valencias VALUES(8, 'C', 4);
INSERT INTO Valencias VALUES(9, 'C', -4);
INSERT INTO Valencias VALUES(10, 'N', 1);
INSERT INTO Valencias VALUES(11, 'N', -1);
INSERT INTO Valencias VALUES(12, 'N', 2);
INSERT INTO Valencias VALUES(13, 'N', -2);
INSERT INTO Valencias VALUES(14, 'N', 3);
INSERT INTO Valencias VALUES(15, 'N', -3);
INSERT INTO Valencias VALUES(16, 'N', 4);
INSERT INTO Valencias VALUES(17, 'N', 5);
INSERT INTO Valencias VALUES(18, 'O', -1);
INSERT INTO Valencias VALUES(19, 'O', 2);
INSERT INTO Valencias VALUES(20, 'O', -2);
INSERT INTO Valencias VALUES(21, 'F', -1);
INSERT INTO Valencias VALUES(22, 'Ne', null);
INSERT INTO Valencias VALUES(23, 'Na', 1);
INSERT INTO Valencias VALUES(24, 'Mg', 2);
INSERT INTO Valencias VALUES(25, 'Al', 3);
INSERT INTO Valencias VALUES(26, 'Si', 2);
INSERT INTO Valencias VALUES(27, 'Si', 4);
INSERT INTO Valencias VALUES(28, 'Si', -4);
INSERT INTO Valencias VALUES(29, 'P', 3);
INSERT INTO Valencias VALUES(30, 'P', -3);
INSERT INTO Valencias VALUES(31, 'P', 4);
INSERT INTO Valencias VALUES(32, 'P', 5);
INSERT INTO Valencias VALUES(33, 'S', 1);
INSERT INTO Valencias VALUES(34, 'S', -1);
INSERT INTO Valencias VALUES(35, 'S', 2);
INSERT INTO Valencias VALUES(36, 'S', -2);
INSERT INTO Valencias VALUES(37, 'S', 3);
INSERT INTO Valencias VALUES(38, 'S', 4);
INSERT INTO Valencias VALUES(39, 'S', 5);
INSERT INTO Valencias VALUES(40, 'S', 6);
INSERT INTO Valencias VALUES(41, 'Cl', 1);
INSERT INTO Valencias VALUES(42, 'Cl', -1);
INSERT INTO Valencias VALUES(43, 'Cl', 3);
INSERT INTO Valencias VALUES(44, 'Cl', 4);
INSERT INTO Valencias VALUES(45, 'Cl', 5);
INSERT INTO Valencias VALUES(46, 'Cl', 6);
INSERT INTO Valencias VALUES(47, 'Cl', 7);
INSERT INTO Valencias VALUES(48, 'Ar', null);
INSERT INTO Valencias VALUES(49, 'K', 1);
INSERT INTO Valencias VALUES(50, 'Ca', 2);
INSERT INTO Valencias VALUES(51, 'Sc', 3);
INSERT INTO Valencias VALUES(52, 'Ti', 2);
INSERT INTO Valencias VALUES(53, 'Ti', 3);
INSERT INTO Valencias VALUES(54, 'Ti', 4);
INSERT INTO Valencias VALUES(55, 'V', 2);
INSERT INTO Valencias VALUES(56, 'V', 3);
INSERT INTO Valencias VALUES(57, 'V', 4);
INSERT INTO Valencias VALUES(58, 'V', 5);
INSERT INTO Valencias VALUES(59, 'Cr', 2);
INSERT INTO Valencias VALUES(60, 'Cr', 3);
INSERT INTO Valencias VALUES(61, 'Cr', 4);
INSERT INTO Valencias VALUES(62, 'Cr', 5);
INSERT INTO Valencias VALUES(63, 'Cr', 6);
INSERT INTO Valencias VALUES(64, 'Mn', 2);
INSERT INTO Valencias VALUES(65, 'Mn', 3);
INSERT INTO Valencias VALUES(66, 'Mn', 4);
INSERT INTO Valencias VALUES(67, 'Mn', 5);
INSERT INTO Valencias VALUES(68, 'Mn', 6);
INSERT INTO Valencias VALUES(69, 'Mn', 7);
INSERT INTO Valencias VALUES(70, 'Fe', 2);
INSERT INTO Valencias VALUES(71, 'Fe', 3);
INSERT INTO Valencias VALUES(72, 'Fe', 4);
INSERT INTO Valencias VALUES(73, 'Fe', 5);
INSERT INTO Valencias VALUES(74, 'Fe', 6);
INSERT INTO Valencias VALUES(75, 'Co', 2);
INSERT INTO Valencias VALUES(76, 'Co', 3);
INSERT INTO Valencias VALUES(77, 'Co', 4);
INSERT INTO Valencias VALUES(78, 'Ni', 2);
INSERT INTO Valencias VALUES(79, 'Ni', 3);
INSERT INTO Valencias VALUES(80, 'Ni', 4);
INSERT INTO Valencias VALUES(81, 'Cu', 1);
INSERT INTO Valencias VALUES(82, 'Cu', 2);
INSERT INTO Valencias VALUES(83, 'Cu', 3);
INSERT INTO Valencias VALUES(84, 'Zn', 2);
INSERT INTO Valencias VALUES(85, 'Ga', 1);
INSERT INTO Valencias VALUES(86, 'Ga', 2);
INSERT INTO Valencias VALUES(87, 'Ga', 3);
INSERT INTO Valencias VALUES(88, 'Ge', 2);
INSERT INTO Valencias VALUES(89, 'Ge', 3);
INSERT INTO Valencias VALUES(90, 'Ge', 4);
INSERT INTO Valencias VALUES(91, 'As', 3);
INSERT INTO Valencias VALUES(92, 'As', -3);
INSERT INTO Valencias VALUES(93, 'As', 5);
INSERT INTO Valencias VALUES(94, 'Se', 1);
INSERT INTO Valencias VALUES(95, 'Se', 2);
INSERT INTO Valencias VALUES(96, 'Se', -2);
INSERT INTO Valencias VALUES(97, 'Se', 4);
INSERT INTO Valencias VALUES(98, 'Se', 6);
INSERT INTO Valencias VALUES(99, 'Br', 1);
INSERT INTO Valencias VALUES(100, 'Br', -1);
INSERT INTO Valencias VALUES(101, 'Br', 3);
INSERT INTO Valencias VALUES(102, 'Br', 4);
INSERT INTO Valencias VALUES(103, 'Br', 5);
INSERT INTO Valencias VALUES(104, 'Kr', 2);
INSERT INTO Valencias VALUES(105, 'Kr', 4);
INSERT INTO Valencias VALUES(106, 'Kr', 6);
INSERT INTO Valencias VALUES(107, 'Rb', 1);
INSERT INTO Valencias VALUES(108, 'Sr', 2);
INSERT INTO Valencias VALUES(109, 'Y', 3);
INSERT INTO Valencias VALUES(110, 'Zr', 2);
INSERT INTO Valencias VALUES(111, 'Zr', 3);
INSERT INTO Valencias VALUES(112, 'Zr', 4);
INSERT INTO Valencias VALUES(113, 'Nb', 2);
INSERT INTO Valencias VALUES(114, 'Nb', 3);
INSERT INTO Valencias VALUES(115, 'Nb', 4);
INSERT INTO Valencias VALUES(116, 'Nb', 5);
INSERT INTO Valencias VALUES(117, 'Mo', 2);
INSERT INTO Valencias VALUES(118, 'Mo', 3);
INSERT INTO Valencias VALUES(119, 'Mo', 4);
INSERT INTO Valencias VALUES(120, 'Mo', 5);
INSERT INTO Valencias VALUES(121, 'Mo', 6);
INSERT INTO Valencias VALUES(122, 'Tc', 4);
INSERT INTO Valencias VALUES(123, 'Tc', 5);
INSERT INTO Valencias VALUES(124, 'Tc', 6);
INSERT INTO Valencias VALUES(125, 'Tc', 7);
INSERT INTO Valencias VALUES(126, 'Ru', 2);
INSERT INTO Valencias VALUES(127, 'Ru', 3);
INSERT INTO Valencias VALUES(128, 'Ru', 4);
INSERT INTO Valencias VALUES(129, 'Ru', 5);
INSERT INTO Valencias VALUES(130, 'Ru', 6);
INSERT INTO Valencias VALUES(131, 'Ru', 8);
INSERT INTO Valencias VALUES(132, 'Rh', 2);
INSERT INTO Valencias VALUES(133, 'Rh', 3);
INSERT INTO Valencias VALUES(134, 'Rh', 4);
INSERT INTO Valencias VALUES(135, 'Rh', 5);
INSERT INTO Valencias VALUES(136, 'Rh', 6);
INSERT INTO Valencias VALUES(137, 'Pd', 2);
INSERT INTO Valencias VALUES(138, 'Pd', 4);
INSERT INTO Valencias VALUES(139, 'Ag', 1);
INSERT INTO Valencias VALUES(140, 'Ag', 2);
INSERT INTO Valencias VALUES(141, 'Cd', 2);
INSERT INTO Valencias VALUES(142, 'In', 1);
INSERT INTO Valencias VALUES(143, 'In', 2);
INSERT INTO Valencias VALUES(144, 'In', 3);
INSERT INTO Valencias VALUES(145, 'Sn', 2);
INSERT INTO Valencias VALUES(146, 'Sn', 4);
INSERT INTO Valencias VALUES(147, 'Sb', 3);
INSERT INTO Valencias VALUES(148, 'Sb', -3);
INSERT INTO Valencias VALUES(149, 'Sb', 4);
INSERT INTO Valencias VALUES(150, 'Sb', 5);
INSERT INTO Valencias VALUES(151, 'Te', 1);
INSERT INTO Valencias VALUES(152, 'Te', 2);
INSERT INTO Valencias VALUES(153, 'Te', -2);
INSERT INTO Valencias VALUES(154, 'Te', 4);
INSERT INTO Valencias VALUES(155, 'Te', 6);
INSERT INTO Valencias VALUES(156, 'I', 1);
INSERT INTO Valencias VALUES(157, 'I', -1);
INSERT INTO Valencias VALUES(158, 'I', 3);
INSERT INTO Valencias VALUES(159, 'I', 4);
INSERT INTO Valencias VALUES(160, 'I', 5);
INSERT INTO Valencias VALUES(161, 'I', 7);
INSERT INTO Valencias VALUES(162, 'Xe', 2);
INSERT INTO Valencias VALUES(163, 'Xe', 4);
INSERT INTO Valencias VALUES(164, 'Xe', 6);
INSERT INTO Valencias VALUES(165, 'Xe', 8);
INSERT INTO Valencias VALUES(166, 'Cs', 1);
INSERT INTO Valencias VALUES(167, 'Ba', 2);
INSERT INTO Valencias VALUES(168, 'La', 3);
INSERT INTO Valencias VALUES(169, 'Ce', 2);
INSERT INTO Valencias VALUES(170, 'Ce', 3);
INSERT INTO Valencias VALUES(171, 'Ce', 4);
INSERT INTO Valencias VALUES(172, 'Pr', 2);
INSERT INTO Valencias VALUES(173, 'Pr', 3);
INSERT INTO Valencias VALUES(174, 'Pr', 4);
INSERT INTO Valencias VALUES(175, 'Nd', 2);
INSERT INTO Valencias VALUES(176, 'Nd', 3);
INSERT INTO Valencias VALUES(177, 'Nd', 4);
INSERT INTO Valencias VALUES(178, 'Pm', 3);
INSERT INTO Valencias VALUES(179, 'Sm', 2);
INSERT INTO Valencias VALUES(180, 'Sm', 3);
INSERT INTO Valencias VALUES(181, 'Eu', 2);
INSERT INTO Valencias VALUES(182, 'Eu', 3);
INSERT INTO Valencias VALUES(183, 'Gd', 2);
INSERT INTO Valencias VALUES(184, 'Gd', 3);
INSERT INTO Valencias VALUES(185, 'Tb', 3);
INSERT INTO Valencias VALUES(186, 'Tb', 4);
INSERT INTO Valencias VALUES(187, 'Dy', 2);
INSERT INTO Valencias VALUES(188, 'Dy', 3);
INSERT INTO Valencias VALUES(189, 'Dy', 4);
INSERT INTO Valencias VALUES(190, 'Ho', 3);
INSERT INTO Valencias VALUES(191, 'Er', 3);
INSERT INTO Valencias VALUES(192, 'Tm', 2);
INSERT INTO Valencias VALUES(193, 'Tm', 3);
INSERT INTO Valencias VALUES(194, 'Yb', 2);
INSERT INTO Valencias VALUES(195, 'Yb', 3);
INSERT INTO Valencias VALUES(196, 'Lu', 3);
INSERT INTO Valencias VALUES(197, 'Hf', 3);
INSERT INTO Valencias VALUES(198, 'Hf', 4);
INSERT INTO Valencias VALUES(199, 'Ta', 3);
INSERT INTO Valencias VALUES(200, 'Ta', 4);
INSERT INTO Valencias VALUES(201, 'Ta', 5);
INSERT INTO Valencias VALUES(202, 'W', 2);
INSERT INTO Valencias VALUES(203, 'W', 3);
INSERT INTO Valencias VALUES(204, 'W', 4);
INSERT INTO Valencias VALUES(205, 'W', 5);
INSERT INTO Valencias VALUES(206, 'W', 6);
INSERT INTO Valencias VALUES(207, 'Re', -1);
INSERT INTO Valencias VALUES(208, 'Re', 2);
INSERT INTO Valencias VALUES(209, 'Re', 3);
INSERT INTO Valencias VALUES(210, 'Re', 4);
INSERT INTO Valencias VALUES(211, 'Re', 5);
INSERT INTO Valencias VALUES(212, 'Re', 6);
INSERT INTO Valencias VALUES(213, 'Re', 7);
INSERT INTO Valencias VALUES(214, 'Os', 1);
INSERT INTO Valencias VALUES(215, 'Os', 2);
INSERT INTO Valencias VALUES(216, 'Os', 3);
INSERT INTO Valencias VALUES(217, 'Os', 4);
INSERT INTO Valencias VALUES(218, 'Os', 5);
INSERT INTO Valencias VALUES(219, 'Os', 6);
INSERT INTO Valencias VALUES(220, 'Os', 7);
INSERT INTO Valencias VALUES(221, 'Os', 8);
INSERT INTO Valencias VALUES(222, 'Ir', 2);
INSERT INTO Valencias VALUES(223, 'Ir', 3);
INSERT INTO Valencias VALUES(224, 'Ir', 4);
INSERT INTO Valencias VALUES(225, 'Ir', 5);
INSERT INTO Valencias VALUES(226, 'Ir', 6);
INSERT INTO Valencias VALUES(227, 'Pt', 2);
INSERT INTO Valencias VALUES(228, 'Pt', 4);
INSERT INTO Valencias VALUES(229, 'Pt', 5);
INSERT INTO Valencias VALUES(230, 'Pt', 6);
INSERT INTO Valencias VALUES(231, 'Au', 1);
INSERT INTO Valencias VALUES(232, 'Au', 3);
INSERT INTO Valencias VALUES(233, 'Hg', 1);
INSERT INTO Valencias VALUES(234, 'Hg', 2);
INSERT INTO Valencias VALUES(235, 'Tl', 1);
INSERT INTO Valencias VALUES(236, 'Tl', 3);
INSERT INTO Valencias VALUES(237, 'Pb', 2);
INSERT INTO Valencias VALUES(238, 'Pb', 4);
INSERT INTO Valencias VALUES(239, 'Bi', 2);
INSERT INTO Valencias VALUES(240, 'Bi', 3);
INSERT INTO Valencias VALUES(241, 'Bi', -3);
INSERT INTO Valencias VALUES(242, 'Bi', 5);
INSERT INTO Valencias VALUES(243, 'Po', 2);
INSERT INTO Valencias VALUES(244, 'Po', 4);
INSERT INTO Valencias VALUES(245, 'Po', 6);
INSERT INTO Valencias VALUES(246, 'At', -1);
INSERT INTO Valencias VALUES(247, 'At', 1);
INSERT INTO Valencias VALUES(248, 'At', 3);
INSERT INTO Valencias VALUES(249, 'At', 5);
INSERT INTO Valencias VALUES(250, 'At', 7);
INSERT INTO Valencias VALUES(251, 'Rn', 2);
INSERT INTO Valencias VALUES(252, 'Fr', 1);
INSERT INTO Valencias VALUES(253, 'Ra', 2);
INSERT INTO Valencias VALUES(254, 'Ac', 2);
INSERT INTO Valencias VALUES(255, 'Ac', 3);
INSERT INTO Valencias VALUES(256, 'Th', 2);
INSERT INTO Valencias VALUES(257, 'Th', 3);
INSERT INTO Valencias VALUES(258, 'Th', 4);
INSERT INTO Valencias VALUES(259, 'Pa', 3);
INSERT INTO Valencias VALUES(260, 'Pa', 4);
INSERT INTO Valencias VALUES(261, 'Pa', 5);
INSERT INTO Valencias VALUES(262, 'U', 3);
INSERT INTO Valencias VALUES(263, 'U', 4);
INSERT INTO Valencias VALUES(264, 'U', 5);
INSERT INTO Valencias VALUES(265, 'U', 6);
INSERT INTO Valencias VALUES(266, 'Np', 2);
INSERT INTO Valencias VALUES(267, 'Np', 3);
INSERT INTO Valencias VALUES(268, 'Np', 4);
INSERT INTO Valencias VALUES(269, 'Np', 5);
INSERT INTO Valencias VALUES(270, 'Np', 6);
INSERT INTO Valencias VALUES(271, 'Pu', 2);
INSERT INTO Valencias VALUES(272, 'Pu', 3);
INSERT INTO Valencias VALUES(273, 'Pu', 4);
INSERT INTO Valencias VALUES(274, 'Pu', 5);
INSERT INTO Valencias VALUES(275, 'Pu', 6);
INSERT INTO Valencias VALUES(276, 'Am', 2);
INSERT INTO Valencias VALUES(277, 'Am', 3);
INSERT INTO Valencias VALUES(278, 'Am', 4);
INSERT INTO Valencias VALUES(279, 'Am', 5);
INSERT INTO Valencias VALUES(280, 'Am', 6);
INSERT INTO Valencias VALUES(281, 'Cm', 3);
INSERT INTO Valencias VALUES(282, 'Cm', 4);
INSERT INTO Valencias VALUES(283, 'Bk', 2);
INSERT INTO Valencias VALUES(284, 'Bk', 3);
INSERT INTO Valencias VALUES(285, 'Bk', 4);
INSERT INTO Valencias VALUES(286, 'Cf', 2);
INSERT INTO Valencias VALUES(287, 'Cf', 3);
INSERT INTO Valencias VALUES(288, 'Cf', 4);
INSERT INTO Valencias VALUES(289, 'Es', 3);
INSERT INTO Valencias VALUES(290, 'Fm', 2);
INSERT INTO Valencias VALUES(291, 'Fm', 3);
INSERT INTO Valencias VALUES(292, 'Md', 3);
INSERT INTO Valencias VALUES(293, 'No', 2);
INSERT INTO Valencias VALUES(294, 'No', 3);
INSERT INTO Valencias VALUES(295, 'Lw', 3);
INSERT INTO Valencias VALUES(296, 'Rf', 4);
INSERT INTO Valencias VALUES(297, 'Db', 5);
INSERT INTO Valencias VALUES(298, 'Sg', 6);
INSERT INTO Valencias VALUES(299, 'Bh', 7);
INSERT INTO Valencias VALUES(300, 'Hs', 3);
INSERT INTO Valencias VALUES(301, 'Mt', 2);
INSERT INTO Valencias VALUES(302, 'Ds', 2);
INSERT INTO Valencias VALUES(303, 'Ds', -2);
INSERT INTO Valencias VALUES(304, 'Ds', 4);
INSERT INTO Valencias VALUES(305, 'Rg', 2);
INSERT INTO Valencias VALUES(306, 'Rg', 3);
INSERT INTO Valencias VALUES(307, 'Cn', 1);
INSERT INTO Valencias VALUES(308, 'Cn', 2);
INSERT INTO Valencias VALUES(309, 'Tf', 3);
INSERT INTO Valencias VALUES(310, 'Eo', 2);
INSERT INTO Valencias VALUES(311, 'Eo', 4);
INSERT INTO Valencias VALUES(312, 'Eo', 6);
INSERT INTO Valencias VALUES(313, 'Me', 1);
INSERT INTO Valencias VALUES(314, 'Me', 4);
INSERT INTO Valencias VALUES(315, 'Me', 5);
INSERT INTO Valencias VALUES(316, 'Nc', 3);
INSERT INTO Valencias VALUES(317, 'Nc', 4);
INSERT INTO Valencias VALUES(318, 'Nc', 5);
INSERT INTO Valencias VALUES(319, 'El', 1);
INSERT INTO Valencias VALUES(320, 'El', 2);
INSERT INTO Valencias VALUES(321, 'El', 3);
INSERT INTO Valencias VALUES(322, 'On', 4);
INSERT INTO Valencias VALUES(323, 'On', 7);