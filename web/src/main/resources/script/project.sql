create table project(
  id VARCHAR(40) PRIMARY KEY,--主键
  name VARCHAR(80),--项目名
  job VARCHAR(2000),--项目职责
  url VARCHAR(2000),--源码链接
  info_id VARCHAR(40)--对应简历
)

insert into project
values
('1','持明法州后台管理系统',
'参与项目整体需求分析，库表设计以及代码编写。以及使用单元测试进行项目方法的测试以及bug修改。',
'https://github.com/baoziss/myproject','1')