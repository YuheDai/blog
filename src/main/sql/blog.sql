-- 数据库初始化脚本

--创建数据库
CREATE database blog;
--使用数据库
use blog;

--创建表
--创建用户表
CREATE TABLE blog_user(
object_id varchar(19) not null COMMENT'主键',
name varchar(255) not null COMMENT'用户昵称',
email varchar(255) not null COMMENT'用户邮箱',
password varchar(255) not null COMMENT'用户密码',
role varchar(19) not null default 'visitorRole'COMMENT'用户角色adminRole defaultRole visitorRole',
avatar varchar(19) COMMENT'用户头像地址',
article_count int not null default 0 COMMENT'用户文章计数',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='博客用户表';

--创建文章表
CREATE table blog_article(
object_id varchar(19) not null COMMENT'主键',
title varchar(255) not null COMMENT'文章标题',
abstracts text not null COMMENT'文章摘要',
content mediumtext not null COMMENT'文章内容',
tags varchar(255) COMMENT '文章标签,使用逗号分隔',
author_id varchar(19) not null COMMENT'作者id',
comment_count int not null default 0 COMMENT'文章评论计数',
view_count int not null default 1 COMMENT'文章浏览计数',
permalink varchar(19) COMMENT'文章访问路径',
is_published boolean not null default 0 COMMENT'文章是否完成',
is_top boolean default 0 COMMENT'文章是否置顶',
create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT'文章创建时间戳',
update_time timestamp not null COMMENT'文章更新时间戳',
commentable boolean not null default 1 COMMENT'文章是否可评论',
view_password varchar(255) COMMENT'文章浏览密码',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='博客文章表';

--创建评论表
create table blog_comment(
object_id varchar(19) not null COMMENT'主键',
content text not null COMMENT'评论内容',
create_time timestamp not null default current_timestamp COMMENT'评论创建时间戳',
name varchar(50) not null COMMENT'评论人昵称',
article_id varchar(19) not null COMMENT'评论文章的id',
sharp_url varchar(255) not null COMMENT'评论访问路径(#锚点)',
avatar varchar(255) COMMENT'评论人头像地址',
original_id varchar(19) COMMENT'父评论id',
original_name varchar(50) COMMENT'父评论昵称',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='博客评论表';

--创建标签表
create table blog_tag(
object_id varchar(19) not null COMMENT'主键',
title varchar(255) not null COMMENT'标签标题',
published_article_count int not null COMMENT'标签关联的已发布文章数量',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='博客标签表';

--创建分类表
create table blog_category(
object_id varchar(19) not null COMMENT'主键',
title varchar(255) not null COMMENT'分类标题',
url varchar(255) not null COMMENT'分类访问路径',
tag_count int not null COMMENT'分类下聚合的标签数',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='博客分类表';

--创建存档日期表
create table blog_archive(
object_id varchar(19) not null COMMENT'主键',
article_count int not null COMMENT'存档日期文章计数,即某月文章总数',
archive_date timestamp not null COMMENT'存档日期时间',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='博客存档日期表';

--创建配置表
create table blog_option(
object_id varchar(19) not null COMMENT'主键(配置项键名)',
option_value text not null COMMENT'配置项值',
option_category varchar(19) not null COMMENT'配置项分类',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='博客配置表';

--创建文章-存档日期关联表
create table blog_article_archive(
object_id varchar(19) not null COMMENT'主键',
article_id varchar(19) not null COMMENT'文章的主键',
archive_id varchar(19) not null COMMENT'存档的主键',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='文章-存档关联表';

--创建文章-标签关联表
create table blog_article_tag(
object_id varchar(19) not null COMMENT'主键',
article_id varchar(19) not null COMMENT'文章的主键',
tag_id varchar(19) not null COMMENT'标签的主键',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='文章-标签关联表';

--创建分类-标签关联表
create table blog_category_tag(
object_id varchar(19) not null COMMENT'主键',
category_id varchar(19) not null COMMENT'分类的主键',
tag_id varchar(19) not null COMMENT'标签的主键',
primary key(object_id)
)ENGINE=InnoDB DEFAULT CHARACTER SET utf8mb4 collate utf8mb4_general_ci COMMENT='分类-标签关联表';