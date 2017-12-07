CREATE DATABASE cloud DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
Use cloud;

CREATE TABLE `wx_component` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `app_name` varchar(120) DEFAULT NULL COMMENT '第三方平台名称',
  `component_app_id` varchar(50) DEFAULT NULL COMMENT '第三方平台Appid',
  `component_app_secret` varchar(50) DEFAULT NULL COMMENT '第三方平台Appsecret',
  `encoding_aes_key` varchar(100) DEFAULT NULL COMMENT '第三方平台申请时填写的接收消息的加密',
  `encoding_token` varchar(100) DEFAULT NULL COMMENT '第三方平台申请时填写的接收消息的校验token',
  `component_verify_ticket` varchar(1000) DEFAULT NULL COMMENT '第三方平台调用凭证Ticket',
  `component_access_token` varchar(1000) DEFAULT NULL COMMENT '第三方平台调用凭证',
  `pre_auth_code` varchar(1000) DEFAULT NULL COMMENT '第三方平台调用凭证code',
  `component_login_page` varchar(1000) DEFAULT NULL COMMENT '生成的第三方平台授权页面URL',
  `component_home` varchar(50) DEFAULT NULL COMMENT '授权后跳转到的结果页',
  `callback_url` varchar(200) DEFAULT NULL COMMENT '回调地址',
  `create_at` datetime DEFAULT NULL COMMENT '操作时间',
  `op_by` varchar(32) DEFAULT NULL COMMENT '操作人',
  `op_at` datetime DEFAULT NULL COMMENT '操作时间',
  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标记',
  PRIMARY KEY (`id`),
  KEY `IDX_COMPONENT_APP_ID` (`component_app_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='第三方信息';

