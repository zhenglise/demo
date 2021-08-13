/*
 Navicat Premium Data Transfer

 Source Server         : 人才库
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : localhost:3306
 Source Schema         : user_stock

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 13/08/2021 18:48:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for erp_record
-- ----------------------------
DROP TABLE IF EXISTS `erp_record`;
CREATE TABLE `erp_record`  (
  `erp_id` int(11) NOT NULL,
  `user_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账号',
  `passwork` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `about_meun` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '相关目录权限',
  PRIMARY KEY (`erp_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of erp_record
-- ----------------------------
INSERT INTO `erp_record` VALUES (1, 'admin', 'aa', 'N');
INSERT INTO `erp_record` VALUES (2, 'yanfa', 'yanfa', 'N');

-- ----------------------------
-- Table structure for ji_xiao
-- ----------------------------
DROP TABLE IF EXISTS `ji_xiao`;
CREATE TABLE `ji_xiao`  (
  `ji_xiao_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL COMMENT '员工ID',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `initial_level` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '绩效初评级别',
  `initial_money` int(10) NULL DEFAULT NULL COMMENT '绩效初评金额',
  `final_level` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '绩效最终级别',
  `final_money` int(10) NULL DEFAULT NULL COMMENT '绩效最终金额',
  `year_month` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '绩效月份',
  `work_remarks` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工工作描述',
  `superior_remarks` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '直属上级备注',
  `executive_remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主管备注',
  `other_remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '其他备注',
  PRIMARY KEY (`ji_xiao_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ji_xiao
-- ----------------------------

-- ----------------------------
-- Table structure for kao_qin
-- ----------------------------
DROP TABLE IF EXISTS `kao_qin`;
CREATE TABLE `kao_qin`  (
  `kao_qin_id` int(11) NOT NULL,
  `user_id` int(11) NULL DEFAULT NULL COMMENT '员工ID',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门',
  `psot` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '岗位',
  `answer_attendance_date` int(11) NULL DEFAULT NULL COMMENT '应出勤天数',
  `attendance_date` int(11) NULL DEFAULT NULL COMMENT '出勤天数',
  `seven_before` int(10) NULL DEFAULT NULL COMMENT '7点前次数',
  `seven_after` int(10) NULL DEFAULT NULL COMMENT '7点后次数',
  `eight_after` int(10) NULL DEFAULT NULL COMMENT '8点后次数',
  `nine_after` int(10) NULL DEFAULT NULL COMMENT '9点后次数',
  `ten_after` int(10) NULL DEFAULT NULL COMMENT '10点后次数',
  `twelve_after` int(10) NULL DEFAULT NULL COMMENT '12点后次数',
  `nine_twelve_after` int(10) NULL DEFAULT NULL COMMENT '9-12点后次数',
  `work_overtime` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '加班时间备注',
  `is_work` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否有加班',
  PRIMARY KEY (`kao_qin_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kao_qin
-- ----------------------------

-- ----------------------------
-- Table structure for tiao_xin
-- ----------------------------
DROP TABLE IF EXISTS `tiao_xin`;
CREATE TABLE `tiao_xin`  (
  `tiao_xin_id` int(11) NOT NULL,
  `user_id` int(11) NULL DEFAULT NULL COMMENT '员工ID',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `final_change_salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '最终调薪值',
  `final_floating_up` decimal(10, 2) NULL DEFAULT NULL COMMENT '最新调薪上浮比例',
  `expect_salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '员工期望调薪',
  `expect_floating_up` decimal(10, 2) NULL DEFAULT NULL COMMENT '员工期望调薪上浮比例',
  `change_before_salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '调薪前薪资',
  `change_after_salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '调薪后薪资',
  `user_remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工调薪备注',
  `superior_remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '直属上级备注',
  `executive_remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主管备注',
  `other_remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '其他备注',
  `expect_time` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工期望调薪时间',
  `final_change_time` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '最终调薪时间',
  `survey_time` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '调薪调研时间',
  PRIMARY KEY (`tiao_xin_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tiao_xin
-- ----------------------------

-- ----------------------------
-- Table structure for user_data
-- ----------------------------
DROP TABLE IF EXISTS `user_data`;
CREATE TABLE `user_data`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `sex` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '性别',
  `entry_time` datetime NULL DEFAULT NULL COMMENT '入职时间',
  `entry_grade` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '入职评级',
  `entry_salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '入职薪资',
  `current_grade` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '当前评级',
  `current_salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '当前薪资',
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门',
  `psot` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '岗位',
  `lately_change_salary_time` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '最近调薪日',
  `ontrial_salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '试用薪资',
  `graduation_school` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '毕业学校',
  `major` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '专业',
  `education` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '学历',
  `graduation_time` datetime NULL DEFAULT NULL COMMENT '毕业时间',
  `entry_before_years` decimal(10, 2) NULL DEFAULT NULL COMMENT '入职前年限',
  `entry_remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '入职备注',
  `current_years` decimal(10, 2) NULL DEFAULT NULL COMMENT '当前总年限',
  `whether_extrapolation` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否内推',
  `recruit_contribution_one` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '招聘贡献人1',
  `recruit_contribution_two` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '招聘贡献人2',
  `is_job` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否在职',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_data
-- ----------------------------
INSERT INTO `user_data` VALUES (1, 'sese', '男', '2021-08-13 00:01:23', '13', 213213.00, '12', 414.00, '研发', '经理', '00:00:02', 3.00, '学校', '软件', NULL, '2021-08-13 00:00:21', NULL, '21', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user_data` VALUES (2, 'sese', '男', '2021-08-13 12:31:23', '23', 12313.00, NULL, 5123.00, '研发', '工程师', '00:00:01', 4.00, '学校', NULL, NULL, '2021-08-13 00:00:21', NULL, '21', NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
