-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th8 03, 2018 lúc 06:33 AM
-- Phiên bản máy phục vụ: 10.1.30-MariaDB
-- Phiên bản PHP: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `lazada`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `MAHD` int(11) NOT NULL,
  `MASP` int(11) NOT NULL,
  `SOLUONG` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chitiethoadon`
--

INSERT INTO `chitiethoadon` (`MAHD`, `MASP`, `SOLUONG`) VALUES
(1, 1, 2),
(2, 1, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietkhuyenmai`
--

CREATE TABLE `chitietkhuyenmai` (
  `MASP` int(11) NOT NULL,
  `MAKM` int(11) NOT NULL,
  `PHANTRAMKM` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chitietkhuyenmai`
--

INSERT INTO `chitietkhuyenmai` (`MASP`, `MAKM`, `PHANTRAMKM`) VALUES
(1, 1, 49),
(2, 1, 49),
(3, 1, 49),
(4, 1, 49),
(5, 1, 49),
(6, 1, 49),
(7, 1, 49),
(8, 1, 49),
(9, 1, 49),
(10, 1, 49),
(11, 2, 50),
(12, 2, 50),
(13, 2, 50),
(14, 2, 50),
(15, 2, 50),
(16, 2, 50),
(17, 2, 50),
(18, 2, 50),
(19, 2, 50),
(20, 2, 50),
(21, 3, 40),
(21, 4, 30),
(22, 3, 40),
(22, 4, 30),
(23, 3, 40),
(23, 4, 30),
(24, 3, 40),
(24, 4, 30),
(25, 3, 40),
(25, 4, 30),
(26, 3, 40),
(26, 4, 30),
(27, 3, 40),
(27, 4, 30),
(28, 3, 40),
(28, 4, 30),
(29, 3, 40),
(29, 4, 30),
(30, 3, 40),
(30, 4, 30);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietsanpham`
--

CREATE TABLE `chitietsanpham` (
  `MACHITIET` int(11) NOT NULL,
  `MASP` int(11) NOT NULL,
  `TENCHITIET` text NOT NULL,
  `GIATRI` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chitietsanpham`
--

INSERT INTO `chitietsanpham` (`MACHITIET`, `MASP`, `TENCHITIET`, `GIATRI`) VALUES
(1, 1, '3D TV', 'No'),
(2, 1, 'Camera Back', '11 - 15 MP'),
(3, 1, 'Camera Front', '5 - 6 MP'),
(4, 1, 'Điều kiện', 'Mới'),
(5, 1, 'Curved TV', 'No'),
(6, 1, 'Kích thước màn hình', '4.7'),
(7, 1, 'Mẫu mã', '6s'),
(8, 1, 'Network Connections', '3G-HSPA|4G-LTE'),
(9, 1, 'Hệ điều hành', 'IOS'),
(10, 1, 'Operation System Version', 'IOS9'),
(11, 1, 'Trọng lượng (KG)', '0.2'),
(12, 1, 'Sản xuất tại', 'Trung quốc'),
(13, 1, 'RAM memory', '2GB'),
(14, 1, 'Sim type', 'SIM nano'),
(15, 1, 'Sim Slots', '1'),
(16, 1, 'Bộ nhớ trong', '64GB'),
(17, 1, 'Bảo hành', '12 tháng'),
(18, 2, '3D TV', 'No'),
(19, 2, 'Camera Back', '11 - 15 MP'),
(20, 2, 'Camera Front', '5 - 6 MP'),
(21, 2, 'Điều kiện', 'Mới'),
(22, 2, 'Curved TV', 'No'),
(23, 2, 'Kích thước màn hình', '4.7'),
(24, 2, 'Mẫu mã', '6s'),
(25, 2, 'Network Connections', '3G-HSPA|4G-LTE'),
(26, 2, 'Hệ điều hành', 'IOS'),
(27, 2, 'Operation System Version', 'IOS9'),
(28, 2, 'Trọng lượng (KG)', '0.2'),
(29, 2, 'Sản xuất tại', 'Trung quốc'),
(30, 2, 'RAM memory', '2GB'),
(31, 2, 'Sim type', 'SIM nano'),
(32, 2, 'Sim Slots', '1'),
(33, 2, 'Bộ nhớ trong', '64GB'),
(34, 2, 'Bảo hành', '12 tháng'),
(35, 3, '3D TV', 'No'),
(36, 3, 'Camera Back', '11 - 15 MP'),
(37, 3, 'Camera Front', '5 - 6 MP'),
(38, 3, 'Điều kiện', 'Mới'),
(39, 3, 'Curved TV', 'No'),
(40, 3, 'Kích thước màn hình', '4.7'),
(41, 3, 'Mẫu mã', '6s'),
(42, 3, 'Network Connections', '3G-HSPA|4G-LTE'),
(43, 3, 'Hệ điều hành', 'IOS'),
(44, 3, 'Operation System Version', 'IOS9'),
(45, 3, 'Trọng lượng (KG)', '0.2'),
(46, 3, 'Sản xuất tại', 'Trung quốc'),
(47, 3, 'RAM memory', '2GB'),
(48, 3, 'Sim type', 'SIM nano'),
(49, 3, 'Sim Slots', '1'),
(50, 3, 'Bộ nhớ trong', '64GB'),
(51, 3, 'Bảo hành', '12 tháng'),
(52, 4, '3D TV', 'No'),
(53, 4, 'Camera Back', '11 - 15 MP'),
(54, 4, 'Camera Front', '5 - 6 MP'),
(55, 4, 'Điều kiện', 'Mới'),
(56, 4, 'Curved TV', 'No'),
(57, 4, 'Kích thước màn hình', '4.7'),
(58, 4, 'Mẫu mã', '6s'),
(59, 4, 'Network Connections', '3G-HSPA|4G-LTE'),
(60, 4, 'Hệ điều hành', 'IOS'),
(61, 4, 'Operation System Version', 'IOS9'),
(62, 4, 'Trọng lượng (KG)', '0.2'),
(63, 4, 'Sản xuất tại', 'Trung quốc'),
(64, 4, 'RAM memory', '2GB'),
(65, 4, 'Sim type', 'SIM nano'),
(66, 4, 'Sim Slots', '1'),
(67, 4, 'Bộ nhớ trong', '64GB'),
(68, 4, 'Bảo hành', '12 tháng'),
(69, 5, '3D TV', 'No'),
(70, 5, 'Camera Back', '11 - 15 MP'),
(71, 5, 'Camera Front', '5 - 6 MP'),
(72, 5, 'Điều kiện', 'Mới'),
(73, 5, 'Curved TV', 'No'),
(74, 5, 'Kích thước màn hình', '4.7'),
(75, 5, 'Mẫu mã', '6s'),
(76, 5, 'Network Connections', '3G-HSPA|4G-LTE'),
(77, 5, 'Hệ điều hành', 'IOS'),
(78, 5, 'Operation System Version', 'IOS9'),
(79, 5, 'Trọng lượng (KG)', '0.2'),
(80, 5, 'Sản xuất tại', 'Trung quốc'),
(81, 5, 'RAM memory', '2GB'),
(82, 5, 'Sim type', 'SIM nano'),
(83, 5, 'Sim Slots', '1'),
(84, 5, 'Bộ nhớ trong', '64GB'),
(85, 5, 'Bảo hành', '12 tháng'),
(86, 6, '3D TV', 'No'),
(87, 6, 'Camera Back', '11 - 15 MP'),
(88, 6, 'Camera Front', '5 - 6 MP'),
(89, 6, 'Điều kiện', 'Mới'),
(90, 6, 'Curved TV', 'No'),
(91, 6, 'Kích thước màn hình', '4.7'),
(92, 6, 'Mẫu mã', '6s'),
(93, 6, 'Network Connections', '3G-HSPA|4G-LTE'),
(94, 6, 'Hệ điều hành', 'IOS'),
(95, 6, 'Operation System Version', 'IOS9'),
(96, 6, 'Trọng lượng (KG)', '0.2'),
(97, 6, 'Sản xuất tại', 'Trung quốc'),
(98, 6, 'RAM memory', '2GB'),
(99, 6, 'Sim type', 'SIM nano'),
(100, 6, 'Sim Slots', '1'),
(101, 6, 'Bộ nhớ trong', '64GB'),
(102, 6, 'Bảo hành', '12 tháng'),
(103, 7, '3D TV', 'No'),
(104, 7, 'Camera Back', '11 - 15 MP'),
(105, 7, 'Camera Front', '5 - 6 MP'),
(106, 7, 'Điều kiện', 'Mới'),
(107, 7, 'Curved TV', 'No'),
(108, 7, 'Kích thước màn hình', '4.7'),
(109, 7, 'Mẫu mã', '6s'),
(110, 7, 'Network Connections', '3G-HSPA|4G-LTE'),
(111, 7, 'Hệ điều hành', 'IOS'),
(112, 7, 'Operation System Version', 'IOS9'),
(113, 7, 'Trọng lượng (KG)', '0.2'),
(114, 7, 'Sản xuất tại', 'Trung quốc'),
(115, 7, 'RAM memory', '2GB'),
(116, 7, 'Sim type', 'SIM nano'),
(117, 7, 'Sim Slots', '1'),
(118, 7, 'Bộ nhớ trong', '64GB'),
(119, 7, 'Bảo hành', '12 tháng'),
(120, 8, '3D TV', 'No'),
(121, 8, 'Camera Back', '11 - 15 MP'),
(122, 8, 'Camera Front', '5 - 6 MP'),
(123, 8, 'Điều kiện', 'Mới'),
(124, 8, 'Curved TV', 'No'),
(125, 8, 'Kích thước màn hình', '4.7'),
(126, 8, 'Mẫu mã', '6s'),
(127, 8, 'Network Connections', '3G-HSPA|4G-LTE'),
(128, 8, 'Hệ điều hành', 'IOS'),
(129, 8, 'Operation System Version', 'IOS9'),
(130, 8, 'Trọng lượng (KG)', '0.2'),
(131, 8, 'Sản xuất tại', 'Trung quốc'),
(132, 8, 'RAM memory', '2GB'),
(133, 8, 'Sim type', 'SIM nano'),
(134, 8, 'Sim Slots', '1'),
(135, 8, 'Bộ nhớ trong', '64GB'),
(136, 8, 'Bảo hành', '12 tháng'),
(137, 9, '3D TV', 'No'),
(138, 9, 'Camera Back', '11 - 15 MP'),
(139, 9, 'Camera Front', '5 - 6 MP'),
(140, 9, 'Điều kiện', 'Mới'),
(141, 9, 'Curved TV', 'No'),
(142, 9, 'Kích thước màn hình', '4.7'),
(143, 9, 'Mẫu mã', '6s'),
(144, 9, 'Network Connections', '3G-HSPA|4G-LTE'),
(145, 9, 'Hệ điều hành', 'IOS'),
(146, 9, 'Operation System Version', 'IOS9'),
(147, 9, 'Trọng lượng (KG)', '0.2'),
(148, 9, 'Sản xuất tại', 'Trung quốc'),
(149, 9, 'RAM memory', '2GB'),
(150, 9, 'Sim type', 'SIM nano'),
(151, 9, 'Sim Slots', '1'),
(152, 9, 'Bộ nhớ trong', '64GB'),
(153, 9, 'Bảo hành', '12 tháng'),
(154, 10, '3D TV', 'No'),
(155, 10, 'Camera Back', '11 - 15 MP'),
(156, 10, 'Camera Front', '5 - 6 MP'),
(157, 10, 'Điều kiện', 'Mới'),
(158, 10, 'Curved TV', 'No'),
(159, 10, 'Kích thước màn hình', '4.7'),
(160, 10, 'Mẫu mã', '6s'),
(161, 10, 'Network Connections', '3G-HSPA|4G-LTE'),
(162, 10, 'Hệ điều hành', 'IOS'),
(163, 10, 'Operation System Version', 'IOS9'),
(164, 10, 'Trọng lượng (KG)', '0.2'),
(165, 10, 'Sản xuất tại', 'Trung quốc'),
(166, 10, 'RAM memory', '2GB'),
(167, 10, 'Sim type', 'SIM nano'),
(168, 10, 'Sim Slots', '1'),
(169, 10, 'Bộ nhớ trong', '64GB'),
(170, 10, 'Bảo hành', '12 tháng'),
(171, 11, '3D TV', 'No'),
(172, 11, 'Camera Back', '11 - 15 MP'),
(173, 11, 'Camera Front', '5 - 6 MP'),
(174, 11, 'Điều kiện', 'Mới'),
(175, 11, 'Curved TV', 'No'),
(176, 11, 'Kích thước màn hình', '4.7'),
(177, 11, 'Mẫu mã', '6s'),
(178, 11, 'Network Connections', '3G-HSPA|4G-LTE'),
(179, 11, 'Hệ điều hành', 'IOS'),
(180, 11, 'Operation System Version', 'IOS9'),
(181, 11, 'Trọng lượng (KG)', '0.2'),
(182, 11, 'Sản xuất tại', 'Trung quốc'),
(183, 11, 'RAM memory', '2GB'),
(184, 11, 'Sim type', 'SIM nano'),
(185, 11, 'Sim Slots', '1'),
(186, 11, 'Bộ nhớ trong', '64GB'),
(187, 11, 'Bảo hành', '12 tháng'),
(188, 12, '3D TV', 'No'),
(189, 12, 'Camera Back', '11 - 15 MP'),
(190, 12, 'Camera Front', '5 - 6 MP'),
(191, 12, 'Điều kiện', 'Mới'),
(192, 12, 'Curved TV', 'No'),
(193, 12, 'Kích thước màn hình', '4.7'),
(194, 12, 'Mẫu mã', '6s'),
(195, 12, 'Network Connections', '3G-HSPA|4G-LTE'),
(196, 12, 'Hệ điều hành', 'IOS'),
(197, 12, 'Operation System Version', 'IOS9'),
(198, 12, 'Trọng lượng (KG)', '0.2'),
(199, 12, 'Sản xuất tại', 'Trung quốc'),
(200, 12, 'RAM memory', '2GB'),
(201, 12, 'Sim type', 'SIM nano'),
(202, 12, 'Sim Slots', '1'),
(203, 12, 'Bộ nhớ trong', '64GB'),
(204, 12, 'Bảo hành', '12 tháng'),
(205, 13, '3D TV', 'No'),
(206, 13, 'Camera Back', '11 - 15 MP'),
(207, 13, 'Camera Front', '5 - 6 MP'),
(208, 13, 'Điều kiện', 'Mới'),
(209, 13, 'Curved TV', 'No'),
(210, 13, 'Kích thước màn hình', '4.7'),
(211, 13, 'Mẫu mã', '6s'),
(212, 13, 'Network Connections', '3G-HSPA|4G-LTE'),
(213, 13, 'Hệ điều hành', 'IOS'),
(214, 13, 'Operation System Version', 'IOS9'),
(215, 13, 'Trọng lượng (KG)', '0.2'),
(216, 13, 'Sản xuất tại', 'Trung quốc'),
(217, 13, 'RAM memory', '2GB'),
(218, 13, 'Sim type', 'SIM nano'),
(219, 13, 'Sim Slots', '1'),
(220, 13, 'Bộ nhớ trong', '64GB'),
(221, 13, 'Bảo hành', '12 tháng'),
(222, 14, '3D TV', 'No'),
(223, 14, 'Camera Back', '11 - 15 MP'),
(224, 14, 'Camera Front', '5 - 6 MP'),
(225, 14, 'Điều kiện', 'Mới'),
(226, 14, 'Curved TV', 'No'),
(227, 14, 'Kích thước màn hình', '4.7'),
(228, 14, 'Mẫu mã', '6s'),
(229, 14, 'Network Connections', '3G-HSPA|4G-LTE'),
(230, 14, 'Hệ điều hành', 'IOS'),
(231, 14, 'Operation System Version', 'IOS9'),
(232, 14, 'Trọng lượng (KG)', '0.2'),
(233, 14, 'Sản xuất tại', 'Trung quốc'),
(234, 14, 'RAM memory', '2GB'),
(235, 14, 'Sim type', 'SIM nano'),
(236, 14, 'Sim Slots', '1'),
(237, 14, 'Bộ nhớ trong', '64GB'),
(238, 14, 'Bảo hành', '12 tháng'),
(239, 15, '3D TV', 'No'),
(240, 15, 'Camera Back', '11 - 15 MP'),
(241, 15, 'Camera Front', '5 - 6 MP'),
(242, 15, 'Điều kiện', 'Mới'),
(243, 15, 'Curved TV', 'No'),
(244, 15, 'Kích thước màn hình', '4.7'),
(245, 15, 'Mẫu mã', '6s'),
(246, 15, 'Network Connections', '3G-HSPA|4G-LTE'),
(247, 15, 'Hệ điều hành', 'IOS'),
(248, 15, 'Operation System Version', 'IOS9'),
(249, 15, 'Trọng lượng (KG)', '0.2'),
(250, 15, 'Sản xuất tại', 'Trung quốc'),
(251, 15, 'RAM memory', '2GB'),
(252, 15, 'Sim type', 'SIM nano'),
(253, 15, 'Sim Slots', '1'),
(254, 15, 'Bộ nhớ trong', '64GB'),
(255, 15, 'Bảo hành', '12 tháng'),
(256, 16, '3D TV', 'No'),
(257, 16, 'Camera Back', '11 - 15 MP'),
(258, 16, 'Camera Front', '5 - 6 MP'),
(259, 16, 'Điều kiện', 'Mới'),
(260, 16, 'Curved TV', 'No'),
(261, 16, 'Kích thước màn hình', '4.7'),
(262, 16, 'Mẫu mã', '6s'),
(263, 16, 'Network Connections', '3G-HSPA|4G-LTE'),
(264, 16, 'Hệ điều hành', 'IOS'),
(265, 16, 'Operation System Version', 'IOS9'),
(266, 16, 'Trọng lượng (KG)', '0.2'),
(267, 16, 'Sản xuất tại', 'Trung quốc'),
(268, 16, 'RAM memory', '2GB'),
(269, 16, 'Sim type', 'SIM nano'),
(270, 16, 'Sim Slots', '1'),
(271, 16, 'Bộ nhớ trong', '64GB'),
(272, 16, 'Bảo hành', '12 tháng'),
(273, 17, '3D TV', 'No'),
(274, 17, 'Camera Back', '11 - 15 MP'),
(275, 17, 'Camera Front', '5 - 6 MP'),
(276, 17, 'Điều kiện', 'Mới'),
(277, 17, 'Curved TV', 'No'),
(278, 17, 'Kích thước màn hình', '4.7'),
(279, 17, 'Mẫu mã', '6s'),
(280, 17, 'Network Connections', '3G-HSPA|4G-LTE'),
(281, 17, 'Hệ điều hành', 'IOS'),
(282, 17, 'Operation System Version', 'IOS9'),
(283, 17, 'Trọng lượng (KG)', '0.2'),
(284, 17, 'Sản xuất tại', 'Trung quốc'),
(285, 17, 'RAM memory', '2GB'),
(286, 17, 'Sim type', 'SIM nano'),
(287, 17, 'Sim Slots', '1'),
(288, 17, 'Bộ nhớ trong', '64GB'),
(289, 17, 'Bảo hành', '12 tháng'),
(290, 18, '3D TV', 'No'),
(291, 18, 'Camera Back', '11 - 15 MP'),
(292, 18, 'Camera Front', '5 - 6 MP'),
(293, 18, 'Điều kiện', 'Mới'),
(294, 18, 'Curved TV', 'No'),
(295, 18, 'Kích thước màn hình', '4.7'),
(296, 18, 'Mẫu mã', '6s'),
(297, 18, 'Network Connections', '3G-HSPA|4G-LTE'),
(298, 18, 'Hệ điều hành', 'IOS'),
(299, 18, 'Operation System Version', 'IOS9'),
(300, 18, 'Trọng lượng (KG)', '0.2'),
(301, 18, 'Sản xuất tại', 'Trung quốc'),
(302, 18, 'RAM memory', '2GB'),
(303, 18, 'Sim type', 'SIM nano'),
(304, 18, 'Sim Slots', '1'),
(305, 18, 'Bộ nhớ trong', '64GB'),
(306, 18, 'Bảo hành', '12 tháng'),
(307, 19, '3D TV', 'No'),
(308, 19, 'Camera Back', '11 - 15 MP'),
(309, 19, 'Camera Front', '5 - 6 MP'),
(310, 19, 'Điều kiện', 'Mới'),
(311, 19, 'Curved TV', 'No'),
(312, 19, 'Kích thước màn hình', '4.7'),
(313, 19, 'Mẫu mã', '6s'),
(314, 19, 'Network Connections', '3G-HSPA|4G-LTE'),
(315, 19, 'Hệ điều hành', 'IOS'),
(316, 19, 'Operation System Version', 'IOS9'),
(317, 19, 'Trọng lượng (KG)', '0.2'),
(318, 19, 'Sản xuất tại', 'Trung quốc'),
(319, 19, 'RAM memory', '2GB'),
(320, 19, 'Sim type', 'SIM nano'),
(321, 19, 'Sim Slots', '1'),
(322, 19, 'Bộ nhớ trong', '64GB'),
(323, 19, 'Bảo hành', '12 tháng'),
(324, 20, '3D TV', 'No'),
(325, 20, 'Camera Back', '11 - 15 MP'),
(326, 20, 'Camera Front', '5 - 6 MP'),
(327, 20, 'Điều kiện', 'Mới'),
(328, 20, 'Curved TV', 'No'),
(329, 20, 'Kích thước màn hình', '4.7'),
(330, 20, 'Mẫu mã', '6s'),
(331, 20, 'Network Connections', '3G-HSPA|4G-LTE'),
(332, 20, 'Hệ điều hành', 'IOS'),
(333, 20, 'Operation System Version', 'IOS9'),
(334, 20, 'Trọng lượng (KG)', '0.2'),
(335, 20, 'Sản xuất tại', 'Trung quốc'),
(336, 20, 'RAM memory', '2GB'),
(337, 20, 'Sim type', 'SIM nano'),
(338, 20, 'Sim Slots', '1'),
(339, 20, 'Bộ nhớ trong', '64GB'),
(340, 20, 'Bảo hành', '12 tháng'),
(341, 21, '3D TV', 'No'),
(342, 21, 'Camera Back', '11 - 15 MP'),
(343, 21, 'Camera Front', '5 - 6 MP'),
(344, 21, 'Điều kiện', 'Mới'),
(345, 21, 'Curved TV', 'No'),
(346, 21, 'Kích thước màn hình', '4.7'),
(347, 21, 'Mẫu mã', '6s'),
(348, 21, 'Network Connections', '3G-HSPA|4G-LTE'),
(349, 21, 'Hệ điều hành', 'IOS'),
(350, 21, 'Operation System Version', 'IOS9'),
(351, 21, 'Trọng lượng (KG)', '0.2'),
(352, 21, 'Sản xuất tại', 'Trung quốc'),
(353, 21, 'RAM memory', '2GB'),
(354, 21, 'Sim type', 'SIM nano'),
(355, 21, 'Sim Slots', '1'),
(356, 21, 'Bộ nhớ trong', '64GB'),
(357, 21, 'Bảo hành', '12 tháng'),
(358, 22, '3D TV', 'No'),
(359, 22, 'Camera Back', '11 - 15 MP'),
(360, 22, 'Camera Front', '5 - 6 MP'),
(361, 22, 'Điều kiện', 'Mới'),
(362, 22, 'Curved TV', 'No'),
(363, 22, 'Kích thước màn hình', '4.7'),
(364, 22, 'Mẫu mã', '6s'),
(365, 22, 'Network Connections', '3G-HSPA|4G-LTE'),
(366, 22, 'Hệ điều hành', 'IOS'),
(367, 22, 'Operation System Version', 'IOS9'),
(368, 22, 'Trọng lượng (KG)', '0.2'),
(369, 22, 'Sản xuất tại', 'Trung quốc'),
(370, 22, 'RAM memory', '2GB'),
(371, 22, 'Sim type', 'SIM nano'),
(372, 22, 'Sim Slots', '1'),
(373, 22, 'Bộ nhớ trong', '64GB'),
(374, 22, 'Bảo hành', '12 tháng'),
(375, 23, '3D TV', 'No'),
(376, 23, 'Camera Back', '11 - 15 MP'),
(377, 23, 'Camera Front', '5 - 6 MP'),
(378, 23, 'Điều kiện', 'Mới'),
(379, 23, 'Curved TV', 'No'),
(380, 23, 'Kích thước màn hình', '4.7'),
(381, 23, 'Mẫu mã', '6s'),
(382, 23, 'Network Connections', '3G-HSPA|4G-LTE'),
(383, 23, 'Hệ điều hành', 'IOS'),
(384, 23, 'Operation System Version', 'IOS9'),
(385, 23, 'Trọng lượng (KG)', '0.2'),
(386, 23, 'Sản xuất tại', 'Trung quốc'),
(387, 23, 'RAM memory', '2GB'),
(388, 23, 'Sim type', 'SIM nano'),
(389, 23, 'Sim Slots', '1'),
(390, 23, 'Bộ nhớ trong', '64GB'),
(391, 23, 'Bảo hành', '12 tháng'),
(392, 24, '3D TV', 'No'),
(393, 24, 'Camera Back', '11 - 15 MP'),
(394, 24, 'Camera Front', '5 - 6 MP'),
(395, 24, 'Điều kiện', 'Mới'),
(396, 24, 'Curved TV', 'No'),
(397, 24, 'Kích thước màn hình', '4.7'),
(398, 24, 'Mẫu mã', '6s'),
(399, 24, 'Network Connections', '3G-HSPA|4G-LTE'),
(400, 24, 'Hệ điều hành', 'IOS'),
(401, 24, 'Operation System Version', 'IOS9'),
(402, 24, 'Trọng lượng (KG)', '0.2'),
(403, 24, 'Sản xuất tại', 'Trung quốc'),
(404, 24, 'RAM memory', '2GB'),
(405, 24, 'Sim type', 'SIM nano'),
(406, 24, 'Sim Slots', '1'),
(407, 24, 'Bộ nhớ trong', '64GB'),
(408, 24, 'Bảo hành', '12 tháng'),
(409, 25, '3D TV', 'No'),
(410, 25, 'Camera Back', '11 - 15 MP'),
(411, 25, 'Camera Front', '5 - 6 MP'),
(412, 25, 'Điều kiện', 'Mới'),
(413, 25, 'Curved TV', 'No'),
(414, 25, 'Kích thước màn hình', '4.7'),
(415, 25, 'Mẫu mã', '6s'),
(416, 25, 'Network Connections', '3G-HSPA|4G-LTE'),
(417, 25, 'Hệ điều hành', 'IOS'),
(418, 25, 'Operation System Version', 'IOS9'),
(419, 25, 'Trọng lượng (KG)', '0.2'),
(420, 25, 'Sản xuất tại', 'Trung quốc'),
(421, 25, 'RAM memory', '2GB'),
(422, 25, 'Sim type', 'SIM nano'),
(423, 25, 'Sim Slots', '1'),
(424, 25, 'Bộ nhớ trong', '64GB'),
(425, 25, 'Bảo hành', '12 tháng'),
(426, 26, '3D TV', 'No'),
(427, 26, 'Camera Back', '11 - 15 MP'),
(428, 26, 'Camera Front', '5 - 6 MP'),
(429, 26, 'Điều kiện', 'Mới'),
(430, 26, 'Curved TV', 'No'),
(431, 26, 'Kích thước màn hình', '4.7'),
(432, 26, 'Mẫu mã', '6s'),
(433, 26, 'Network Connections', '3G-HSPA|4G-LTE'),
(434, 26, 'Hệ điều hành', 'IOS'),
(435, 26, 'Operation System Version', 'IOS9'),
(436, 26, 'Trọng lượng (KG)', '0.2'),
(437, 26, 'Sản xuất tại', 'Trung quốc'),
(438, 26, 'RAM memory', '2GB'),
(439, 26, 'Sim type', 'SIM nano'),
(440, 26, 'Sim Slots', '1'),
(441, 26, 'Bộ nhớ trong', '64GB'),
(442, 26, 'Bảo hành', '12 tháng'),
(443, 27, '3D TV', 'No'),
(444, 27, 'Camera Back', '11 - 15 MP'),
(445, 27, 'Camera Front', '5 - 6 MP'),
(446, 27, 'Điều kiện', 'Mới'),
(447, 27, 'Curved TV', 'No'),
(448, 27, 'Kích thước màn hình', '4.7'),
(449, 27, 'Mẫu mã', '6s'),
(450, 27, 'Network Connections', '3G-HSPA|4G-LTE'),
(451, 27, 'Hệ điều hành', 'IOS'),
(452, 27, 'Operation System Version', 'IOS9'),
(453, 27, 'Trọng lượng (KG)', '0.2'),
(454, 27, 'Sản xuất tại', 'Trung quốc'),
(455, 27, 'RAM memory', '2GB'),
(456, 27, 'Sim type', 'SIM nano'),
(457, 27, 'Sim Slots', '1'),
(458, 27, 'Bộ nhớ trong', '64GB'),
(459, 27, 'Bảo hành', '12 tháng'),
(460, 28, '3D TV', 'No'),
(461, 28, 'Camera Back', '11 - 15 MP'),
(462, 28, 'Camera Front', '5 - 6 MP'),
(463, 28, 'Điều kiện', 'Mới'),
(464, 28, 'Curved TV', 'No'),
(465, 28, 'Kích thước màn hình', '4.7'),
(466, 28, 'Mẫu mã', '6s'),
(467, 28, 'Network Connections', '3G-HSPA|4G-LTE'),
(468, 28, 'Hệ điều hành', 'IOS'),
(469, 28, 'Operation System Version', 'IOS9'),
(470, 28, 'Trọng lượng (KG)', '0.2'),
(471, 28, 'Sản xuất tại', 'Trung quốc'),
(472, 28, 'RAM memory', '2GB'),
(473, 29, '3D TV', 'No'),
(474, 29, 'Camera Back', '11 - 15 MP'),
(475, 29, 'Camera Front', '5 - 6 MP'),
(476, 29, 'Điều kiện', 'Mới'),
(477, 29, 'Curved TV', 'No'),
(478, 29, 'Kích thước màn hình', '4.7'),
(479, 29, 'Mẫu mã', '6s'),
(480, 29, 'Network Connections', '3G-HSPA|4G-LTE'),
(481, 29, 'Hệ điều hành', 'IOS'),
(482, 29, 'Operation System Version', 'IOS9'),
(483, 29, 'Trọng lượng (KG)', '0.2'),
(484, 29, 'Sản xuất tại', 'Trung quốc'),
(485, 29, 'RAM memory', '2GB'),
(486, 29, 'Sim type', 'SIM nano'),
(487, 29, 'Sim Slots', '1'),
(488, 29, 'Bộ nhớ trong', '64GB'),
(489, 29, 'Bảo hành', '12 tháng'),
(490, 30, '3D TV', 'No'),
(491, 30, 'Camera Back', '11 - 15 MP'),
(492, 30, 'Camera Front', '5 - 6 MP'),
(493, 30, 'Điều kiện', 'Mới'),
(494, 30, 'Curved TV', 'No'),
(495, 30, 'Kích thước màn hình', '4.7'),
(496, 30, 'Mẫu mã', '6s'),
(497, 30, 'Network Connections', '3G-HSPA|4G-LTE'),
(498, 30, 'Hệ điều hành', 'IOS'),
(499, 30, 'Operation System Version', 'IOS9'),
(500, 30, 'Trọng lượng (KG)', '0.2'),
(501, 30, 'Sản xuất tại', 'Trung quốc'),
(502, 30, 'RAM memory', '2GB'),
(503, 30, 'Sim type', 'SIM nano'),
(504, 30, 'Sim Slots', '1'),
(505, 30, 'Bộ nhớ trong', '64GB'),
(506, 30, 'Bảo hành', '12 tháng'),
(507, 31, '3D TV', 'No'),
(508, 31, 'Camera Back', '11 - 15 MP'),
(509, 31, 'Camera Front', '5 - 6 MP'),
(510, 31, 'Điều kiện', 'Mới'),
(511, 31, 'Curved TV', 'No'),
(512, 31, 'Kích thước màn hình', '4.7'),
(513, 31, 'Mẫu mã', '6s'),
(514, 31, 'Network Connections', '3G-HSPA|4G-LTE'),
(515, 31, 'Hệ điều hành', 'IOS'),
(516, 31, 'Operation System Version', 'IOS9'),
(517, 31, 'Trọng lượng (KG)', '0.2'),
(518, 31, 'Sản xuất tại', 'Trung quốc'),
(519, 31, 'RAM memory', '2GB'),
(520, 31, 'Sim type', 'SIM nano'),
(521, 31, 'Sim Slots', '1'),
(522, 31, 'Bộ nhớ trong', '64GB'),
(523, 31, 'Bảo hành', '12 tháng'),
(524, 32, '3D TV', 'No'),
(525, 32, 'Camera Back', '11 - 15 MP'),
(526, 32, 'Camera Front', '5 - 6 MP'),
(527, 32, 'Điều kiện', 'Mới'),
(528, 32, 'Curved TV', 'No'),
(529, 32, 'Kích thước màn hình', '4.7'),
(530, 32, 'Mẫu mã', '6s'),
(531, 32, 'Network Connections', '3G-HSPA|4G-LTE'),
(532, 32, 'Hệ điều hành', 'IOS'),
(533, 32, 'Operation System Version', 'IOS9'),
(534, 32, 'Trọng lượng (KG)', '0.2'),
(535, 32, 'Sản xuất tại', 'Trung quốc'),
(536, 32, 'RAM memory', '2GB'),
(537, 32, 'Sim type', 'SIM nano'),
(538, 32, 'Sim Slots', '1'),
(539, 32, 'Bộ nhớ trong', '64GB'),
(540, 32, 'Bảo hành', '12 tháng'),
(541, 33, '3D TV', 'No'),
(542, 33, 'Camera Back', '11 - 15 MP'),
(543, 33, 'Camera Front', '5 - 6 MP'),
(544, 33, 'Điều kiện', 'Mới'),
(545, 33, 'Curved TV', 'No'),
(546, 33, 'Kích thước màn hình', '4.7'),
(547, 33, 'Mẫu mã', '6s'),
(548, 33, 'Network Connections', '3G-HSPA|4G-LTE'),
(549, 33, 'Hệ điều hành', 'IOS'),
(550, 33, 'Operation System Version', 'IOS9'),
(551, 33, 'Trọng lượng (KG)', '0.2'),
(552, 33, 'Sản xuất tại', 'Trung quốc'),
(553, 33, 'RAM memory', '2GB'),
(554, 33, 'Sim type', 'SIM nano'),
(555, 33, 'Sim Slots', '1'),
(556, 33, 'Bộ nhớ trong', '64GB'),
(557, 33, 'Bảo hành', '12 tháng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietthuonghieu`
--

CREATE TABLE `chitietthuonghieu` (
  `MATHUONGHIEU` int(11) NOT NULL,
  `MALOAISP` int(11) NOT NULL,
  `HINHLOAISPTH` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chitietthuonghieu`
--

INSERT INTO `chitietthuonghieu` (`MATHUONGHIEU`, `MALOAISP`, `HINHLOAISPTH`) VALUES
(1, 1, '/hinhthuonghieu/apple.png'),
(2, 1, '/hinhthuonghieu/nokia.png'),
(3, 1, '/hinhthuonghieu/samsung.png'),
(4, 1, '/hinhthuonghieu/xiaomi.png'),
(5, 1, '/hinhthuonghieu/asus.png'),
(6, 1, '/hinhthuonghieu/lenovo.png'),
(7, 1, '/hinhthuonghieu/oppo.png'),
(8, 1, '/hinhthuonghieu/sony.png'),
(9, 1, '/hinhthuonghieu/htc.png'),
(11, 1, '/hinhthuonghieu/hp.png'),
(12, 1, '/hinhthuonghieu/scandisk.png'),
(13, 1, '/hinhthuonghieu/silicon.jpg'),
(14, 1, '/hinhthuonghieu/canon.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `danhgia`
--

CREATE TABLE `danhgia` (
  `MADG` varchar(200) NOT NULL,
  `MASP` int(11) NOT NULL,
  `TENTHIETBI` text,
  `NOIDUNG` text,
  `SOSAO` int(1) DEFAULT NULL,
  `NGAYDANHGIA` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `danhgia`
--

INSERT INTO `danhgia` (`MADG`, `MASP`, `TENTHIETBI`, `NOIDUNG`, `SOSAO`, `NGAYDANHGIA`) VALUES
('1', 1, 'Hoàng Vĩnh', 'Bad', 2, '23/07/2018'),
('112233', 2, 'Redmi 5A', 'good', 4, '23/07/2018'),
('112233', 4, 'Redmi 5A', 'good', 4, '23/07/2018'),
('12', 1, 'son', 'good', 5, '23/07/2018'),
('123abc', 2, 'Redmi 5A', 'Very good', 5, '23/07/2018'),
('123abc', 4, 'Redmi 5A', 'Good', 3, '20/07/2018');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `MAHD` int(11) NOT NULL,
  `NGAYMUA` text,
  `NGAYGIAO` text,
  `TRANGTHAI` varchar(20) DEFAULT NULL,
  `TENNGUOINHAN` varchar(50) DEFAULT NULL,
  `SODT` text,
  `DIACHI` text,
  `CHUYENKHOAN` tinyint(1) DEFAULT NULL,
  `MACHUYENKHOAN` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`MAHD`, `NGAYMUA`, `NGAYGIAO`, `TRANGTHAI`, `TENNGUOINHAN`, `SODT`, `DIACHI`, `CHUYENKHOAN`, `MACHUYENKHOAN`) VALUES
(1, '29/07/2018', '', 'chờ kiểm duyệt', 'Truong Hoang Vinh', '0919073222', 'Quan 9, TPHCM', 0, 'không có'),
(2, '29/07/2018', '', 'chờ kiểm duyệt', 'Dong Van Son', '0919999999', 'Ha Noi', 1, 'không có');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khuyenmai`
--

CREATE TABLE `khuyenmai` (
  `MAKM` int(11) NOT NULL,
  `MALOAISP` int(11) DEFAULT NULL,
  `TENKM` varchar(200) DEFAULT NULL,
  `NGAYBATDAU` varchar(20) DEFAULT NULL,
  `NGAYKETTHUC` varchar(20) DEFAULT NULL,
  `HINHKHUYENMAI` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `khuyenmai`
--

INSERT INTO `khuyenmai` (`MAKM`, `MALOAISP`, `TENKM`, `NGAYBATDAU`, `NGAYKETTHUC`, `HINHKHUYENMAI`) VALUES
(1, 2, 'Xã hàng hot đến 49%', '2016/9/12', '2019/7/20', '/hinhkhuyenmai/con loc giam gia mua he.png'),
(2, 2, 'Giải nhiệt mùa hè giảm ngay 50%', '2016/9/12', '2019/7/20', '/hinhkhuyenmai/km2.jpg'),
(3, 2, 'Hè này mua gì ?', '2016/9/12', '2019/7/20', '/hinhkhuyenmai/du lich.jpg'),
(4, 3, 'Festival salve !', '2016/9/12', '2016/10/12', '/hinhkhuyenmai/festival sale 90.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loainhanvien`
--

CREATE TABLE `loainhanvien` (
  `MALOAINV` int(11) NOT NULL,
  `TENLOAINV` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `loainhanvien`
--

INSERT INTO `loainhanvien` (`MALOAINV`, `TENLOAINV`) VALUES
(1, 'Admin'),
(2, 'Khách hàng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaisanpham`
--

CREATE TABLE `loaisanpham` (
  `MALOAISP` int(11) NOT NULL,
  `TENLOAISP` varchar(100) DEFAULT NULL,
  `MALOAI_CHA` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `loaisanpham`
--

INSERT INTO `loaisanpham` (`MALOAISP`, `TENLOAISP`, `MALOAI_CHA`) VALUES
(1, 'Điện thoại & Máy tính bảng', 0),
(2, 'Điện thoại di động', 1),
(3, 'Máy tính bảng', 1),
(4, 'Điện thoại bàn', 1),
(5, 'Phụ kiện điện thoại & máy tính bảng', 1),
(6, 'Ốp lưng và bao da điện thoại', 5),
(7, 'Miếng dán màn hình điện thoại', 5),
(8, 'Phụ kiện di động trên xe hơi', 5),
(9, 'Phụ kiện khác', 5),
(10, 'Cáp & Dock sạc', 5),
(11, 'Linh kiện & Dụng cụ', 5),
(12, 'SIM & Thẻ cào', 5),
(13, 'Pin và bộ sạc', 5),
(14, 'Phụ kiện máy tính bảng', 5),
(15, 'Pin sạc dự phòng', 5),
(16, 'Phụ kiện camera điện thoại', 5),
(17, 'Nhà cửa & Đời sống', 0),
(18, 'Bếp phòng ăn', 17),
(19, 'Dụng cụ làm bánh', 18),
(20, 'Dụng cụ nấu ăn', 18),
(21, 'Đồ dùng bàn ăn', 18),
(22, 'Đồ dùng uống trà và cà phê', 18),
(23, 'Dao nấu bếp', 18),
(24, 'Khăn trải bàn & Phụ kiện bằng vải', 18),
(25, 'Phụ kiện & Dụng cụ nhà bếp', 18),
(26, 'Đồ dùng phòng ngủ', 17),
(27, 'Bộ chăn và ga giường gối', 26),
(28, 'Gối', 26),
(29, 'Phụ kiện giường ngủ', 26),
(30, 'Bộ chăn ra gối nệm', 26),
(31, 'Ga giường', 26),
(32, 'Nệm và Vỏ nệm', 26),
(33, 'Đồ nội thất', 17),
(34, 'Nội thất phòng ngủ', 33),
(35, 'Nội thất phòng khách', 33),
(36, 'Nội thất bếp & Phòng ăn', 33),
(37, 'Nội thất phòng trẻ em', 33),
(38, 'Nội thất phòng làm việc tại gia', 33),
(39, 'Nội thất cho hành lang & lối vào', 33),
(40, 'Nội thất phòng trang trí', 33),
(41, 'Nội thất kiểu cổ', 33),
(42, 'Tân trang nhà cửa', 17),
(43, 'Kho chứa dụng cụ và Garage', 42),
(44, 'Điện', 42),
(45, 'Cổng và Hàng rào', 42),
(46, 'Bảo vệ và An toàn', 42),
(47, 'Ống nước', 42),
(48, 'Máy vi tính & Laptop', 17),
(49, 'Laptop', 48),
(50, 'Dòng giải trí', 49),
(51, 'Macbooks', 49),
(52, 'Ultrabooks', 49),
(53, 'Thiết bị lưu trữ', 17),
(54, 'Ổ cứng SSD', 53),
(55, 'Ổ cứng gắn ngoài', 53),
(56, 'Ổ cứng gắn trong', 53),
(57, 'USB lưu trữ', 53),
(58, 'Máy in & Phụ kiện', 17),
(59, 'Máy in', 58),
(60, 'Kệ máy in', 58),
(61, 'Máy Fax', 58),
(62, 'Mực in', 58),
(63, 'Chăm sóc sức khỏe & làm đẹp', 17),
(64, 'Trang điểm', 63),
(65, 'Mặt', 64),
(66, 'Môi', 64),
(67, 'Mắt', 64),
(68, 'Tẩy trang', 64),
(69, 'Chăm sóc mặt', 63),
(70, 'Mặt nạ đắp', 69),
(71, 'Sữa rữa mặt', 69),
(72, 'Thể thao', 17),
(73, 'Yaga & Thể hình', 72),
(74, 'Yoga', 73),
(75, 'Máy tập thể hình', 73),
(76, 'Máy tập thể lực', 73),
(77, 'Giày & Trang phục', 72),
(78, 'Dành cho nữ', 77),
(79, 'Dành cho nam', 77),
(80, 'Dành cho bé', 77),
(82, 'TV, Video, Âm Thanh ,Game & Thiết Bị Số', 0),
(83, 'Tivi', 82),
(84, 'Dưới 24 inches', 83),
(85, '25-32 inches', 83),
(86, '33-42 inches', 83),
(87, '43-54 inches', 83),
(88, 'Trên 55 inches', 83),
(89, 'Tivi giá đặc biệt cho các tỉnh, thành lớn', 83),
(90, 'Thiết bị âm thanh', 82),
(91, 'Các loại tai nghe', 90),
(92, 'Loa di động', 90),
(93, 'Dàn âm thanh giải trí', 90),
(94, 'Máy nghe nhạc', 90),
(95, 'Video', 82),
(96, 'Thiết bị trình chiếu', 95),
(97, 'Thiết bị streaming', 95),
(98, 'Thiết bị chơi game', 82),
(99, 'Xbox', 98),
(100, 'Nitendo', 98),
(101, 'Thiết bị đeo công nghệ', 82),
(102, 'Đồng hồ thông minh', 101),
(103, 'Thiết bị theo dõi sức khỏe & vận động', 101),
(104, 'Mắt kính thông minh', 101),
(105, 'Thiết bị giám sát thông minh', 102),
(106, 'Thể thao & du lịch', 0),
(107, 'Các loại bài tập & thể hình', 106),
(108, 'Máy tập thể hình', 107),
(109, 'Máy tập thể lực', 107),
(110, 'Phụ kiện', 107),
(111, 'Tạ', 107),
(112, 'Yoga', 107),
(113, 'Pilates', 107),
(114, 'Đấm bốc, Võ thuật & Đánh MMA', 107),
(115, 'Thể tao đồng đội', 106),
(116, 'Máy tập thể hình', 115),
(117, 'Máy tập thể hình', 115),
(118, 'Bóng đá', 115),
(119, 'Bóng rổ', 115),
(120, 'Bóng chuyền', 115),
(121, 'Hoạt động dã ngoại', 106),
(122, 'Xe đạp', 121),
(123, 'Dã ngoại & leo núi', 121),
(124, 'Câu cá', 121),
(125, 'Xe Scooters', 121),
(126, 'Trượt băng trong nhà', 121),
(127, 'Trượt ván', 121),
(128, 'Bơi lội', 121),
(129, 'Xe máy và bách hóa', 0),
(130, 'Ô tô & xe máy', 129),
(131, 'Chăm sóc ô tô & xe máy', 130),
(132, 'Phụ kiện bên ngoài', 130),
(133, 'Phụ kiện bên trong', 130),
(134, 'Link kiện thay thế', 130),
(135, 'Thiết bị giám định ô tô', 130),
(136, 'Xe mô tô & xe địa hình', 130),
(137, 'Dầu nhớt', 130),
(138, 'Sơn sửa', 130),
(139, 'Phụ kiện xe tải', 130),
(140, 'Dụng cụ và thiết bị', 130),
(141, 'Bánh & vỏ xe', 130),
(142, 'Thiết bị định vị', 130);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MANV` int(11) NOT NULL,
  `TENNV` varchar(100) DEFAULT NULL,
  `TENDANGNHAP` varchar(100) DEFAULT NULL,
  `MATKHAU` varchar(100) DEFAULT NULL,
  `MALOAINV` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MANV`, `TENNV`, `TENDANGNHAP`, `MATKHAU`, `MALOAINV`) VALUES
(1, 'Hoàng Vĩnh', 'vinh@gmail.com', '123456', 2),
(12, 'Sơn', 'son@gmail.com', '123456', 2),
(13, 'Admin', 'admin', '123456', 1),
(16, 'Huy Nguyễn', 'huy@gmail.com', '123456', 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `MASP` int(11) NOT NULL,
  `TENSP` varchar(200) DEFAULT NULL,
  `GIA` decimal(10,0) DEFAULT NULL,
  `ANHLON` text,
  `ANHNHO` text,
  `THONGTIN` text,
  `SOLUONG` int(11) DEFAULT NULL,
  `MALOAISP` int(11) DEFAULT NULL,
  `MATHUONGHIEU` int(11) DEFAULT NULL,
  `LUOTMUA` int(11) DEFAULT NULL,
  `MANV` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`MASP`, `TENSP`, `GIA`, `ANHLON`, `ANHNHO`, `THONGTIN`, `SOLUONG`, `MALOAISP`, `MATHUONGHIEU`, `LUOTMUA`, `MANV`) VALUES
(1, 'Apple iPhone 6 32GB Gold', '6490000', '/hinhsanpham/i6gold.jpg', '/hinhsanpham/i62.jpg,/hinhsanpham/i61.jpg,/hinhsanpham/i6gold3.jpg,/hinhsanpham/i6gold4.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 6, 2, 1, 0, 1),
(2, 'Apple iPhone X 64GB Space Grey', '24990000', '/hinhsanpham/x1.png', '/hinhsanpham/ix1.jpg,/hinhsanpham/ix2.png,/hinhsanpham/ix3.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 2, 1, 0, 1),
(3, 'Apple iPhone 8 Plus 64GB Gold', '20490000', '/hinhsanpham/iphone8plus.jpg', '/hinhsanpham/i8gold1.jpg,/hinhsanpham/i8gold2.png,/hinhsanpham/i8gold3.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 2, 1, 0, 1),
(4, 'Apple iPhone 8 Plus Red Red', '20490000', '/hinhsanpham/iphone8plusred.jpg', '/hinhsanpham/i8red1.png,/hinhsanpham/i8red2.jpg,/hinhsanpham/i8red3.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 2, 1, 0, 1),
(5, 'Apple iPhone X 256GB Silver', '28990000', '/hinhsanpham/ixsilver.jpg\r\n', '/hinhsanpham/ixsilver1.jpg,/hinhsanpham/ixsilver2.jpg,/hinhsanpham/ixsilver3.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 2, 1, 0, 1),
(6, 'Apple iPhone 7 32GB Black', '13890000', '/hinhsanpham/i7black.jpg', '/hinhsanpham/i7black1.jpg,/hinhsanpham/i7black2.jpg,/hinhsanpham/i7black3.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 2, 1, 0, 1),
(7, 'Apple iPhone 8 Plus 64GB Silver', '17490000', '/hinhsanpham/i8plussilver.jpg', '/hinhsanpham/i8silver2.jpg,/hinhsanpham/i8silver1.png', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 2, 1, 0, 1),
(8, 'Apple iPhone 7 32GB Rose Gold', '13890000', '/hinhsanpham/i7rosegold.jpg', '/hinhsanpham/i7rose1.jpg,/hinhsanpham/i7rose2.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 2, 1, 0, 1),
(9, 'Apple iPhone 8 Plus 256GB (Vàng) - Hàng nhập khẩu', '17490000', '/hinhsanpham/i8plusnk.jpg', '/hinhsanpham/i8vang.jpg,/hinhsanpham/i8vang2.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 2, 1, 0, 1),
(10, 'Apple iPhone 7 32GB (Vàng hồng)', '13960000', '/hinhsanpham/i7vanghong.jpg', '/hinhsanpham/i7vang1.jpg,/hinhsanpham/i7vang2.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 2, 1, 0, 1),
(11, 'Apple iPhone 6s 128GB (Vàng)', '6490000', '/hinhsanpham/i6svang.jpg', '/hinhsanpham/i6gold1.jpg,/hinhsanpham/i6gold2.png', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 49, 1, 0, 1),
(12, 'Pin sạc dự phòng Asus Zenpower 10.050mAh (Vàng) ', '339000', '/hinhsanpham/pinsacduphongasus.jpg', '/hinhsanpham/pin2.jpg,/hinhsanpham/pin1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 6, 13, 5, 0, 1),
(13, 'Bao da kiêm bàn phím cho máy tính bảng 7 inch ( Đen)  ', '98000', '/hinhsanpham/baodabanphimmaytinhbang7ich.jpg', '/hinhsanpham/baoda1.jpg,/hinhsanpham/baoda2.jpg,/hinhsanpham/baoda3.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 14, 5, 0, 1),
(14, 'Gậy chụp hình Selfie Stick (Đen phối vàng) ', '36000', '/hinhsanpham/gaychuphinhtusuong.png', '/hinhsanpham/sefi2.jpg,/hinhsanpham/sefi1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 16, 5, 0, 1),
(15, 'Bộ Miếng dán cường lực và ốp lưng cho iPhone 6 - NVPro 30306 (Trong suốt)  ', '86000', '/hinhsanpham/mieng-gian-cuong-luc-iphone-6-6s.jpg', '/hinhsanpham/dan1.jpg,/hinhsanpham/dan2.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 7, 5, 0, 1),
(16, 'Đế kẹp smartphone cho điện thoại', '36000', '/hinhsanpham/dekepsmartphonechodienthoai.jpg', '/hinhsanpham/de1.jpg,/hinhsanpham/de2.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 8, 5, 0, 1),
(17, 'Sim 3G tài khoản 600 MB', '106000', '/hinhsanpham/sim3gtaikhoan600.jpg', '/hinhsanpham/3g1.jpg,/hinhsanpham/3g2.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 14, 12, 5, 0, 1),
(18, 'Ổ cắm thông minh Xiaomi Mi Power Strips (Trắng) ', '166000', '/hinhsanpham/o-cam-thong-minh-xiaomi.jpg', '/hinhsanpham/ocam1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 11, 5, 0, 1),
(19, 'Giá đỡ điện thoại cho tay cầm chơi Game Terios T-3 ( Đen)  ', '99000', '/hinhsanpham/taycamchoigame.jpg', '/hinhsanpham/giado1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 11, 5, 0, 1),
(20, 'Tivi LED Arirang 24inch HD - Model AR-2488F (Đen)', '2439000', '/hinhsanpham/tiviled24inchesariang.jpg', '/hinhsanpham/tvled1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 84, 5, 0, 1),
(21, 'Tivi LED LG 42inch 42LF550T Full HD (Đen)  ', '6939000', '/hinhsanpham/tiviled42inches.jpg', '/hinhsanpham/tvlg1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 85, 5, 0, 1),
(22, 'Smart Tivi LED LG 55inch Full HD - Model 55LH575T (Đen)', '17000000', '/hinhsanpham/tiviled55inches.jpg', '/hinhsanpham/smarttv1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 86, 5, 0, 1),
(23, 'Load Bluetooth SUNTEK S204 (Đen) ', '269000', '/hinhsanpham/sony-electronics-hd-radio.jpg', '/hinhsanpham/loa1.jpg,/hinhsanpham/loa2.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 91, 5, 0, 1),
(24, 'Tai nghe chụp tai Ovann X1 Gaming (Đen phối Xanh) ', '60000', '/hinhsanpham/tai-nghe-chup-tai-ovann-x1-gaming-den-phoi-xanh_5235588062018469161_300.jpg', '/hinhsanpham/tainghe1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 92, 5, 0, 1),
(25, 'Dàn âm thanh Samsung HT-E350K 5.1 330W (Đen) ', '1760000', '/hinhsanpham/vish-dvd-ht-e350k-2.jpg', '/hinhsanpham/amthanh1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 93, 5, 0, 1),
(26, 'Máy nghe nhạc MP3 NVPro Minion (Xanh dương) ', '40000', '/hinhsanpham/may-nghe-nhac-mp3-nvpro-minion-xanh-duong-8610-6315961-e77b808c5237d08a940e6fe597050469-catalog_233.jpg', '/hinhsanpham/mp31.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 94, 5, 0, 1),
(27, 'Máy chiếu mini cho điện thoại (Nâu)  ', '169999', '/hinhsanpham/may-chieu-mini-cho-dien-thoai-nau-9973-9001242-168928dd2df3fa0fae4f2c453b3e8620-catalog_233.jpg', '/hinhsanpham/maychieu1.png', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 95, 5, 0, 1),
(28, 'Thiết bị Android TV box MXQ S805 (Đen) ', '429300', '/hinhsanpham/20160530150209551.jpg', '/hinhsanpham/thietbi1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 96, 5, 0, 1),
(29, 'Tay cầm chơi game Xbox One Controller và Wireless Adapter for PC (Đen)', '1549000', '/hinhsanpham/36743763_palaciodehierro_wirelesscontrollerc35mmone_xbox_vista_1.jpg', '/hinhsanpham/xbox1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 99, 5, 0, 1),
(30, 'Máy chơi games Nintendo Wii +HDD 500 GB (Full Games) (Đen) ', '5999000', '/hinhsanpham/23. WII CONSOLE BLACK W WII REMOTE PLUS _ NUNCHUCK (UPC 045496880675).jpg', '/hinhsanpham/nintendo1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 100, 5, 0, 1),
(31, 'Đồng hồ thông minh Smart Watch Uwatch DZ09 (Bạc) ', '302676000', '/hinhsanpham/res_50df6f16088731d12e6c6698c47231e4_1200x1200c_mttq.jpg', '/hinhsanpham/watch1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 102, 5, 0, 1),
(32, 'Vòng đeo tay Xiaomi Miband 2 (Đen)  ', '819000', '/hinhsanpham/sh-02-a.jpg', '/hinhsanpham/mi1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 103, 4, 0, 1),
(33, 'Bút ghi âm chuyên nghiệp 8 GB (Đen) ', '612000', '/hinhsanpham/130814225508442671.jpg', '/hinhsanpham/pen1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 104, 5, 0, 1),
(35, '\r\nApple MacBook Air 13-inch 1.8GHz dual-core Intel Core i5 128GB Silver', '20490000', '/hinhsanpham/mac1.jpg', '/hinhsanpham/mac1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 49, 1, 0, 1),
(37, 'Xiaomi Black Shark 5.99 inch 8GB RAM 128GB', '38880000', '/hinhsanpham/xiaomi1.jpg', '/hinhsanpham/xiaomi1.jpg', 'Asus ZenPower là viên pin sạc chính hãng hiếm hoi đến từ một nhà sản xuất điện thoại khá lớn ở Việt Nam. Hiện tại ZenPower có khá nhiều màu khác nhau, từ hồng đẹp trai đến màu đen yếu đuối. Hiện tại thì mình mượn được màu hồng mạnh mẽ và vàng sang chảnh để trên tay. Asus có bán các miếng bảo vệ cao su nhiều màu cho pin nhưng không rõ có được phân phối ở Việt Nam hay không.', 10, 2, 4, 0, 1),
(38, 'Bộ củ Sạc Xiaomi 5V-2A và Cáp sạc Xiaomi (Đen)', '89000', '/hinhsanpham/sacxiaomi.jpg', '/hinhsanpham/sacxiaomi.jpg', 'Là hàng được nhập khẩu trực tiếp từ nước ngoài bởi doanh nghiệp trong nước, không thông qua nhà phân phối chính thức tại thị trường Việt Nam.\r\nHàng nhập khẩu được nhiều người chọn lựa bởi giá thành tốt, chất lượng vẫn được đảm bảo như những sản phẩm được nhập khẩu thông qua nhà phân phối chính thức (vì được sản xuất từ cùng một nhà máy của hãng sản xuất). Hơn nữa, dù không được bảo hành tại các trung tâm bảo hành chính thức của hãng, các sản phẩm này vẫn được áp dụng đầy đủ chính sách bảo hành của doanh nghiệp nhập khẩu', 10, 13, 4, 0, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thuonghieu`
--

CREATE TABLE `thuonghieu` (
  `MATHUONGHIEU` int(11) NOT NULL,
  `TENTHUONGHIEU` varchar(100) DEFAULT NULL,
  `HINHTHUONGHIEU` text,
  `LUOTMUA` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `thuonghieu`
--

INSERT INTO `thuonghieu` (`MATHUONGHIEU`, `TENTHUONGHIEU`, `HINHTHUONGHIEU`, `LUOTMUA`) VALUES
(1, 'Apple', 'hinhthuonghieu/tenapple.jpg', 0),
(2, 'Nokia', 'hinhthuonghieu/tennokia.png', 0),
(3, 'Samsung', 'hinhthuonghieu/tensamsung.png', 0),
(4, 'Xiaomi', 'hinhthuonghieu/tenxiaomi.png', 0),
(5, 'Asus', 'hinhthuonghieu/tenasus.png', 0),
(6, 'Lenovo', 'hinhthuonghieu/tenlenovo.png', 0),
(7, 'Oppo', 'hinhthuonghieu/tenoppo.png', 0),
(8, 'Sony', 'hinhthuonghieu/tensony.png', 0),
(9, 'HTC', 'hinhthuonghieu/tenhtc.png', 0),
(10, 'Dell', 'hinhthuonghieu/tendell.png', 0),
(11, 'HP', 'hinhthuonghieu/tenhp.png', 0),
(12, 'Scandisk', 'hinhthuonghieu/tensandisk.png', 0),
(13, 'Silicon', 'hinhthuonghieu/tensilicon.png', 0),
(14, 'Canon', 'hinhthuonghieu/tencannon.png', 0),
(15, 'Microsoft', 'hinhthuonghieu/tenmicrosoft.png', 0);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`MAHD`,`MASP`),
  ADD KEY `KHOANGOAI_CHITIETHOADON_MASP` (`MASP`);

--
-- Chỉ mục cho bảng `chitietkhuyenmai`
--
ALTER TABLE `chitietkhuyenmai`
  ADD PRIMARY KEY (`MASP`,`MAKM`),
  ADD KEY `KHOANGOAI_CHITIETKHUYENMAI_MAKM` (`MAKM`);

--
-- Chỉ mục cho bảng `chitietsanpham`
--
ALTER TABLE `chitietsanpham`
  ADD PRIMARY KEY (`MACHITIET`);

--
-- Chỉ mục cho bảng `chitietthuonghieu`
--
ALTER TABLE `chitietthuonghieu`
  ADD PRIMARY KEY (`MATHUONGHIEU`,`MALOAISP`),
  ADD KEY `KHOANGOAI_CHITIETTHUONGHIEU_MALOAISP` (`MALOAISP`);

--
-- Chỉ mục cho bảng `danhgia`
--
ALTER TABLE `danhgia`
  ADD PRIMARY KEY (`MADG`,`MASP`),
  ADD KEY `KHOANGOAI_DANHGIA_MASP` (`MASP`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MAHD`);

--
-- Chỉ mục cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD PRIMARY KEY (`MAKM`),
  ADD KEY `KHOANGOAI_KHUYENMAI_MALOAISP` (`MALOAISP`);

--
-- Chỉ mục cho bảng `loainhanvien`
--
ALTER TABLE `loainhanvien`
  ADD PRIMARY KEY (`MALOAINV`);

--
-- Chỉ mục cho bảng `loaisanpham`
--
ALTER TABLE `loaisanpham`
  ADD PRIMARY KEY (`MALOAISP`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MANV`),
  ADD KEY `KHOANGOAI_NHANVIEN_MALOAINV` (`MALOAINV`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`MASP`),
  ADD KEY `KHOANGOAI_SANPHAM_MALOAISP` (`MALOAISP`),
  ADD KEY `KHOANGOAI_SANPHAM_MATHUONGHIEU` (`MATHUONGHIEU`);

--
-- Chỉ mục cho bảng `thuonghieu`
--
ALTER TABLE `thuonghieu`
  ADD PRIMARY KEY (`MATHUONGHIEU`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `chitietsanpham`
--
ALTER TABLE `chitietsanpham`
  MODIFY `MACHITIET` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=558;

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `MAHD` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  MODIFY `MAKM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `loainhanvien`
--
ALTER TABLE `loainhanvien`
  MODIFY `MALOAINV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `loaisanpham`
--
ALTER TABLE `loaisanpham`
  MODIFY `MALOAISP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=143;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `MANV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `MASP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT cho bảng `thuonghieu`
--
ALTER TABLE `thuonghieu`
  MODIFY `MATHUONGHIEU` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `KHOANGOAI_CHITIETHOADON_MAHD` FOREIGN KEY (`MAHD`) REFERENCES `hoadon` (`MAHD`),
  ADD CONSTRAINT `KHOANGOAI_CHITIETHOADON_MASP` FOREIGN KEY (`MASP`) REFERENCES `sanpham` (`MASP`);

--
-- Các ràng buộc cho bảng `chitietkhuyenmai`
--
ALTER TABLE `chitietkhuyenmai`
  ADD CONSTRAINT `KHOANGOAI_CHIETIETKUYENMAI_MASP` FOREIGN KEY (`MASP`) REFERENCES `sanpham` (`MASP`),
  ADD CONSTRAINT `KHOANGOAI_CHITIETKHUYENMAI_MAKM` FOREIGN KEY (`MAKM`) REFERENCES `khuyenmai` (`MAKM`);

--
-- Các ràng buộc cho bảng `chitietthuonghieu`
--
ALTER TABLE `chitietthuonghieu`
  ADD CONSTRAINT `KHOANGOAI_CHITIETTHUONGHIEU_MALOAISP` FOREIGN KEY (`MALOAISP`) REFERENCES `loaisanpham` (`MALOAISP`),
  ADD CONSTRAINT `KHOANGOAI_CHITIETTHUONGHIEU_MATHUONGHIEU` FOREIGN KEY (`MATHUONGHIEU`) REFERENCES `thuonghieu` (`MATHUONGHIEU`);

--
-- Các ràng buộc cho bảng `danhgia`
--
ALTER TABLE `danhgia`
  ADD CONSTRAINT `KHOANGOAI_DANHGIA_MASP` FOREIGN KEY (`MASP`) REFERENCES `sanpham` (`MASP`);

--
-- Các ràng buộc cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD CONSTRAINT `KHOANGOAI_KHUYENMAI_MALOAISP` FOREIGN KEY (`MALOAISP`) REFERENCES `loaisanpham` (`MALOAISP`);

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `KHOANGOAI_NHANVIEN_MALOAINV` FOREIGN KEY (`MALOAINV`) REFERENCES `loainhanvien` (`MALOAINV`);

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `KHOANGOAI_SANPHAM_MALOAISP` FOREIGN KEY (`MALOAISP`) REFERENCES `loaisanpham` (`MALOAISP`),
  ADD CONSTRAINT `KHOANGOAI_SANPHAM_MATHUONGHIEU` FOREIGN KEY (`MATHUONGHIEU`) REFERENCES `thuonghieu` (`MATHUONGHIEU`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
