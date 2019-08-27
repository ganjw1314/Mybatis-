/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost:3306
 Source Schema         : ssm_test

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 27/08/2019 17:36:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `province_id` int(10) UNSIGNED NOT NULL COMMENT '省份编号',
  `city_name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `description` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (1, 1, '温岭市', 'BYSocket 的家在温岭。');
INSERT INTO `city` VALUES (2, 2, '揭阳市', 'BYSocket 的家在揭阳市榕城区');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `ROLE_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `NOTE` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_employee
-- ----------------------------
DROP TABLE IF EXISTS `t_employee`;
CREATE TABLE `t_employee`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '雇员编号',
  `REALNAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '雇员名称',
  `SEX` int(11) NULL DEFAULT NULL COMMENT '性别：1-男，0/NULL - 女',
  `BIRTHDAY` date NOT NULL COMMENT '出生日期',
  `MOBILE` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号码',
  `EMAIL` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱地址',
  `POSITION` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位',
  `NOTE` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '雇员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_employee
-- ----------------------------
INSERT INTO `t_employee` VALUES (1, '黄滑雪', 0, '1992-05-25', '15489864646', '22323154@qq.com', '内科主任', '女主任');
INSERT INTO `t_employee` VALUES (2, '新溪', 1, '1984-06-27', '13243344646', '56354343@qq.com', '外科主任', '男主任');

-- ----------------------------
-- Table structure for t_employee_task
-- ----------------------------
DROP TABLE IF EXISTS `t_employee_task`;
CREATE TABLE `t_employee_task`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `EMP_ID` int(11) NOT NULL COMMENT '雇员编号',
  `TASK_ID` int(11) NOT NULL COMMENT '任务编号',
  `TASK_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务名称',
  `NOTE` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工任务表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_employee_task
-- ----------------------------
INSERT INTO `t_employee_task` VALUES (14, 2, 1, '心电图检查', '报告内容如下：心率正常');
INSERT INTO `t_employee_task` VALUES (15, 1, 3, '子宫检测', '报告内容如下：子宫无异常现象');

-- ----------------------------
-- Table structure for t_female_health_form
-- ----------------------------
DROP TABLE IF EXISTS `t_female_health_form`;
CREATE TABLE `t_female_health_form`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `EMP_ID` int(11) NOT NULL COMMENT '雇员编号',
  `HEART` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '心',
  `LIVER` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '肝',
  `SPLEEN` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '脾',
  `LUNG` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '肺',
  `KIDNEY` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '肾',
  `UTERUS` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '子宫',
  `NOTE` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '女性体检表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_female_health_form
-- ----------------------------
INSERT INTO `t_female_health_form` VALUES (1, 1, '心率正常', '肝脏功能有点小毛病', '脾正常', '肺正常', '肾无异常现象', '子宫正常', '备注说明');

-- ----------------------------
-- Table structure for t_male_health_form
-- ----------------------------
DROP TABLE IF EXISTS `t_male_health_form`;
CREATE TABLE `t_male_health_form`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `EMP_ID` int(11) NOT NULL COMMENT '雇员编号',
  `HEART` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '心',
  `LIVER` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '肝',
  `SPLEEN` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '脾',
  `LUNG` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '肺',
  `KIDNEY` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '肾',
  `PROSTATE` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前列腺',
  `NOTE` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '男性体检表表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_male_health_form
-- ----------------------------
INSERT INTO `t_male_health_form` VALUES (11, 2, '心率正常', '肝脏功能有点小毛病', '脾正常', '肺正常', '肾无异常现象', '前列腺正常', '备注说明');
INSERT INTO `t_male_health_form` VALUES (12, 2, '心率异常波动', '肝脏功能有点小毛病', '脾正常', '肺正常', '肾无异常现象', '前列腺正常', '备注说明');
INSERT INTO `t_male_health_form` VALUES (13, 2, '心率波动不大', '肝脏功能有点小毛病', '脾正常', '肺正常', '肾无异常现象', '前列腺正常', '备注说明');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `ROLE_ID` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色编号',
  `ROLE_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `NOTE` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ROLE_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('62e5f83f-dc9b-4e29-b059-d29ff317fe58', '超级管理员', '测试');
INSERT INTO `t_role` VALUES ('825f5a73-0e4f-4a1e-b0ec-5f9f837b6ed4', '权限管理员', '权限');

-- ----------------------------
-- Table structure for t_task
-- ----------------------------
DROP TABLE IF EXISTS `t_task`;
CREATE TABLE `t_task`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `TITLE` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务标题',
  `CONTEXT` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务内容',
  `NOTE` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_task
-- ----------------------------
INSERT INTO `t_task` VALUES (1, '张三体检报告', '报告内容如下：心率正常', '备注说明');
INSERT INTO `t_task` VALUES (3, '张阿德体检报告', '报告内容如下：心率正常', '备注说明');
INSERT INTO `t_task` VALUES (24, '强势股体检报告', '报告内容如下：心率正常', '备注说明');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `USER_ID` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户编号',
  `REAL_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
  `USER_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `SEX` int(11) NULL DEFAULT 1 COMMENT '性别：1-男，0/NULL - 女',
  `BIRTHDAY` date NOT NULL COMMENT '出生日期',
  `MOBILE` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号码',
  `EMAIL` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱地址',
  `NOTE` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('469f0231-c9cc-4927-aded-a6c2ea13cb0d', '幻术师', '黄家强', 1, '2019-08-21', '14432423', '2312312@qq.com', '用户');
INSERT INTO `t_user` VALUES ('e5f12090-9c32-4740-a71a-53d8f17d51a7', '电动车', '黄蛙萨', 1, '2019-08-21', '14564654423', '2543312@qq.com', '用户');

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户角色id',
  `USER_ID` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户编号',
  `ROLE_ID` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色编号',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色关联关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES (1, '469f0231-c9cc-4927-aded-a6c2ea13cb0d', '62e5f83f-dc9b-4e29-b059-d29ff317fe58');
INSERT INTO `t_user_role` VALUES (2, 'e5f12090-9c32-4740-a71a-53d8f17d51a7', '825f5a73-0e4f-4a1e-b0ec-5f9f837b6ed4');
INSERT INTO `t_user_role` VALUES (3, '469f0231-c9cc-4927-aded-a6c2ea13cb0d', '825f5a73-0e4f-4a1e-b0ec-5f9f837b6ed4');

-- ----------------------------
-- Table structure for t_work_cark
-- ----------------------------
DROP TABLE IF EXISTS `t_work_cark`;
CREATE TABLE `t_work_cark`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `EMP_ID` int(11) NOT NULL COMMENT '雇员编号',
  `REAL_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `DEPARTMENT` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机',
  `MOBILE` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮件',
  `POSITION` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位',
  `NOTE` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '工牌表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_work_cark
-- ----------------------------
INSERT INTO `t_work_cark` VALUES (7, 1, '黄滑雪', '15489864646', '22323154@qq.com', '内科主任', '内科主任');
INSERT INTO `t_work_cark` VALUES (8, 2, '雇员司小冬', '2134542332', '15468464@qq.com', '男妇科长', '任务');

SET FOREIGN_KEY_CHECKS = 1;
